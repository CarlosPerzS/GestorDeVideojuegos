/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import EstructurasDeDatos.ListaVideojuegos.Nodo;
import model.Consola;
import model.Videojuego;
import view.frmInformacionVideojuego;
import view.frmMetodoDePago;

/**
 *
 * @author CARLO
 */
public class InformacionVideojuegoController {
    private final frmInformacionVideojuego vista;

    public InformacionVideojuegoController(frmInformacionVideojuego vista) {
        this.vista = vista;
    }
    
    public void rellenarDatos(Nodo datos){
        if (datos == null || datos.getValor() == null) {
            return;
        }

        Videojuego v = datos.getValor();

        vista.jlbGenero.setText(v.getGenero());
        vista.jlbFecha.setText(v.getFechaLanzamiento());
        vista.jlbClasificacion.setText(v.getClasificacionEdad());
        vista.jlbPlataforma.setText(v.getPlataforma());

        vista.jlbNombre.setText(v.getNombre());
        vista.jlbPrecio.setText("$" + v.getPrecio());
        vista.jlbStock.setText(v.getStockDisponible() + " unidades");
    }
    
    public void comprar(Nodo datos){
        int stockDisponible = datos.valor.getStockDisponible();

        if (stockDisponible != 0) {
            javax.swing.JDesktopPane desktop = vista.getDesktopPane();
            frmMetodoDePago pantallaPago = new frmMetodoDePago(datos.valor);
            desktop.add(pantallaPago);
            pantallaPago.setVisible(true);
            
            vista.dispose(); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(vista,
                    "Lo sentimos, no hay stock disponible para este videojuego.",
                    "Sin Inventario",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
