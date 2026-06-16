/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.frmInformacionConsola;
import view.frmInformacionVideojuego;
import view.frmLogin;
import view.frmPrincipalCliente;

/**
 *
 * @author CARLO
 */
public class PrincipalClienteController {
    private final frmPrincipalCliente vista;
    private java.util.List<Integer> idsEnTabla = new java.util.ArrayList<>();
    private java.util.List<String> tiposEnTabla = new java.util.ArrayList<>();

    public PrincipalClienteController(frmPrincipalCliente vista) {
        this.vista = vista;
    }
    
    public void filtrarVideojuegos(){
        idsEnTabla.clear();
        tiposEnTabla.clear();

        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                new String[]{"PRODUCTO", "TIPO", "PRECIO", "STOCK"}, 0) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        EstructurasDeDatos.ListaVideojuegos.Nodo auxV = model.catalogo.videojuegos.cola;
        while (auxV != null) {
            modelo.addRow(new Object[]{
                auxV.getValor().getNombre(),
                "Videojuego",
                "$" + auxV.getValor().getPrecio(),
                auxV.getValor().getStockDisponible()
            });
            idsEnTabla.add(auxV.getValor().getId_Videojuego());
            tiposEnTabla.add("Videojuego");
            auxV = auxV.getAptSiguiente();
        }

        vista.TablaProductos.setModel(modelo);
    }
    
    public void filtrarConsolas(){
        idsEnTabla.clear();
        tiposEnTabla.clear();

        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                new String[]{"PRODUCTO", "TIPO", "PRECIO", "STOCK"}, 0) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };

        EstructurasDeDatos.ListaConsolas.Nodo auxC = model.catalogo.consolas.origen;
        while (auxC != null) {
            modelo.addRow(new Object[]{
                auxC.dato.getNombre(),
                "Consola",
                "$" + auxC.dato.getPrecio(),
                auxC.dato.getStockDisponible()
            });
            idsEnTabla.add(auxC.dato.getId_Consola());
            tiposEnTabla.add("Consola");
            auxC = auxC.siguiente;
        }
        vista.TablaProductos.setModel(modelo);
    }
    
    public void cargarTabla() {
        idsEnTabla.clear();
        tiposEnTabla.clear();

        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                new String[]{"PRODUCTO", "TIPO", "PRECIO", "STOCK"}, 0) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };

        EstructurasDeDatos.ListaConsolas.Nodo auxC = model.catalogo.consolas.origen;
        while (auxC != null) {
            modelo.addRow(new Object[]{
                auxC.dato.getNombre(),
                "Consola",
                "$" + auxC.dato.getPrecio(),
                auxC.dato.getStockDisponible()
            });
            idsEnTabla.add(auxC.dato.getId_Consola());
            tiposEnTabla.add("Consola");
            auxC = auxC.siguiente;
        }

        EstructurasDeDatos.ListaVideojuegos.Nodo auxV = model.catalogo.videojuegos.cola;
        while (auxV != null) {
            modelo.addRow(new Object[]{
                auxV.getValor().getNombre(),
                "Videojuego",
                "$" + auxV.getValor().getPrecio(),
                auxV.getValor().getStockDisponible()
            });
            idsEnTabla.add(auxV.getValor().getId_Videojuego());
            tiposEnTabla.add("Videojuego");
            auxV = auxV.getAptSiguiente();
        }

        vista.TablaProductos.setModel(modelo);

    }
    
    public void buscarProducto(String text){
        if (text == null || text.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(vista, "ingrese un nombre para buscar.", "Campo vacio", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String busquedaExacta = text.trim().toLowerCase();

        EstructurasDeDatos.ListaConsolas.Nodo auxC = model.catalogo.consolas.origen;
        while (auxC != null) {
            if (auxC.dato.getNombre().toLowerCase().equals(busquedaExacta)) {
                frmInformacionConsola ventana= new frmInformacionConsola(auxC);
                vista.jDesktopPane1.add(ventana);
                ventana.show();
                return; 
            }
            auxC = auxC.siguiente;
        }
        
        EstructurasDeDatos.ListaVideojuegos.Nodo auxV = model.catalogo.videojuegos.cola;
        while (auxV != null) {
            if (auxV.getValor().getNombre().toLowerCase().equals(busquedaExacta)) {              
                frmInformacionVideojuego ventana= new frmInformacionVideojuego(auxV);
                vista.jDesktopPane1.add(ventana);
                ventana.show();
                return; 
            }
            auxV = auxV.getAptSiguiente();
        }

        javax.swing.JOptionPane.showMessageDialog(vista, 
                "No se encontro ningun producto con el nombre: \"" + text + "\"", 
                "Producto no registrado", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}