/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Cliente;
import model.Compra;
import model.Datos;
import view.frmCompras;

/**
 *
 * @author CARLO
 */
public class ComprasController {
    private frmCompras vista;

    public ComprasController(frmCompras vista) {
        this.vista = vista;
    }
    public void cargarHistorialCompleto() {
        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                new String[]{"PRODUCTO", "CLIENTE", "TOTAL"}, 0) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };

        for (Compra comp : Datos.compras) {
            if (comp != null && comp.getId_Cliente() == model.Datos.clienteActual.getId_Cliente()) {
                String nombreProducto = "No encontrado";
                String nombreCliente = "No encontrado";

                EstructurasDeDatos.ListaVideojuegos.Nodo auxV = model.catalogo.videojuegos.cola;
                while (auxV != null) {
                    if (auxV.getValor().getId_Producto() == comp.getId_Producto()) {
                        nombreProducto = auxV.getValor().getNombre();
                        break;
                    }
                    auxV = auxV.getAptSiguiente();
                }

                if (nombreProducto.equals("No encontrado")) {
                    EstructurasDeDatos.ListaConsolas.Nodo auxC = model.catalogo.consolas.origen;
                    while (auxC != null) {
                        if (auxC.dato.getId_Producto() == comp.getId_Producto()) {
                            nombreProducto = auxC.dato.getNombre();
                            break;
                        }
                        auxC = auxC.siguiente;
                    }
                }

                for (Cliente c : Datos.clientes) {
                    if (c != null && c.getId_Cliente() == comp.getId_Cliente()) {
                        nombreCliente = c.getNombre();
                        break;
                    }
                }

                modelo.addRow(new Object[]{
                    nombreProducto,
                    nombreCliente,
                    "$" + comp.getTotal()
                });
            }
        }

        vista.getTablaProductos().setModel(modelo);
    }
}
