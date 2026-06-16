/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.frmMetodoDePago;
import model.Compra;
import model.Datos;
import model.MetodoPago;
import model.Producto;

/**
 *
 * @author CARLO
 */
public class MetodoPagoController {
    private final frmMetodoDePago vista;

    public MetodoPagoController(frmMetodoDePago vista) {
        this.vista = vista;
    }
    
    public void inicializarCampos(){
    }

    public void finalizarCompra() {
        Producto prod = vista.getProductoAComprar();
        if (prod == null) {
            javax.swing.JOptionPane.showMessageDialog(vista, "Error al recuperar los datos del producto.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (prod.getStockDisponible() <= 0) {
            javax.swing.JOptionPane.showMessageDialog(vista, "Lo sentimos, el articulo se quedó sin stock disponible.", "Sin Inventario", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idMetodoPagoFinal = 0;

        if (vista.usarMetodoActual()) {
            idMetodoPagoFinal = 1; 
        } else {
            if (vista.getTxtNuevoMetodo().isEmpty() || vista.getTxtTitular().isEmpty() 
                    || vista.getTxtReferencia().isEmpty() || vista.getTxtDetalles().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(vista, "Debes llenar todos los campos del nuevo método de pago.", "Campos vacíos", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                int idMetodoNuevo = model.catalogo.contadorId + 500;
                String tipo = vista.getTxtNuevoMetodo();
                int titular = Integer.parseInt(vista.getTxtTitular());
                String referencia = vista.getTxtReferencia();
                String detalles = vista.getTxtDetalles();

                MetodoPago nuevoMetodo = new MetodoPago(idMetodoNuevo, tipo, titular, referencia, detalles);
                idMetodoPagoFinal = idMetodoNuevo;

            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(vista, "El campo Titular debe ser un ID numérico entero válido.", "Error de formato", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int posicionVacia = -1;
        for (int i = 0; i < Datos.compras.length; i++) {
            if (Datos.compras[i] == null) {
                posicionVacia = i;
                break;
            }
        }

        if (posicionVacia == -1) {
            javax.swing.JOptionPane.showMessageDialog(vista, "El almacenamiento interno de compras está lleno (Límite: 100).", "Error de Almacenamiento", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        prod.setStockDisponible(prod.getStockDisponible() - 1);

        double precio = prod.getPrecio();
        double subtotal = precio;
        double total = subtotal;

        int idCliente = (Datos.clienteActual != null) ? Datos.clienteActual.getId_Cliente() : 1;

        Compra nuevaCompra = new Compra(
            model.catalogo.contadorId,
            prod.getId_Producto(),
            idCliente,
            idMetodoPagoFinal,
            subtotal,
            total,
            true
        );

        Datos.compras[posicionVacia] = nuevaCompra;
        model.catalogo.contadorId++;

        javax.swing.JOptionPane.showMessageDialog(vista, "¡Compra procesada con éxito!\nArtículo: " + prod.getNombre() + "\nTotal: $" + total, "Éxito en la transacción", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        vista.dispose();
    }
    
}
