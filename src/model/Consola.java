/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CARLO
 */
public class Consola extends Producto{
    int id_Consola;
    String Marca;
    int Almacenamiento;
    boolean IncluyeJuego;
    String color;

    public Consola(int id_Consola, String Marca, int Almacenamiento, boolean IncluyeJuego, String color, int id_Producto, String nombre, double precio, int StockDisponible, String tipo) {
        super(id_Producto, nombre, precio, StockDisponible, tipo);
        this.id_Consola = id_Consola;
        this.Marca = Marca;
        this.Almacenamiento = Almacenamiento;
        this.IncluyeJuego = IncluyeJuego;
        this.color = color;
    }

    public Consola() {
    }

    public int getId_Consola() {
        return id_Consola;
    }

    public void setId_Consola(int id_Consola) {
        this.id_Consola = id_Consola;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public boolean isIncluyeJuego() {
        return IncluyeJuego;
    }

    public void setIncluyeJuego(boolean IncluyeJuego) {
        this.IncluyeJuego = IncluyeJuego;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
