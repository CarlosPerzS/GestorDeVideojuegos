/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.frmInformacionConsola;
import EstructurasDeDatos.ListaConsolas.Nodo;
import model.Consola;
import view.frmMetodoDePago;

/**
 *
 * @author CARLO
 */
public class InformacionConsolaController {
    private final frmInformacionConsola vista;

    public InformacionConsolaController(frmInformacionConsola vista) {
        this.vista = vista;
    }
    
    public void comprar(Nodo datos){
        int stockDisponible = datos.dato.getStockDisponible();

        if (stockDisponible != 0) {
            javax.swing.JDesktopPane desktop = vista.getDesktopPane();
            frmMetodoDePago pantallaPago = new frmMetodoDePago(datos.dato);
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
    
    public void rellenarDatos(Nodo datos){
        if (datos == null || datos.dato == null) {
            return; 
        }
        
        Consola c = datos.dato;
        
        vista.jlbAlmacenamiento.setText(c.getAlmacenamiento() + " GB");
        vista.jlbColor.setText(c.getColor());
        vista.jlbMarca.setText(c.getMarca());
        
        String incluyeJuegoTexto = c.isIncluyeJuego() ? "Sí" : "No";
        vista.jlbJuego.setText(incluyeJuegoTexto);
        
        vista.jlbNombre.setText(c.getNombre());
        vista.jlbPrecio.setText("$" + c.getPrecio());
        vista.jlbStock.setText(c.getStockDisponible() + " unidades");
        
    }
    
    public void regresar(){
        vista.dispose();
    }
}
