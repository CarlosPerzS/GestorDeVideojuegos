/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CARLO
 */
public class Producto {
    int id_Producto;
    String nombre;
    double precio;
    int StockDisponible;
    String tipo;

    public Producto() {
    }

    public Producto(int id_Producto, String nombre, double precio, int StockDisponible, String tipo) {
        this.id_Producto = id_Producto;
        this.nombre = nombre;
        this.precio = precio;
        this.StockDisponible = StockDisponible;
        this.tipo = tipo;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockDisponible() {
        return StockDisponible;
    }

    public void setStockDisponible(int StockDisponible) {
        this.StockDisponible = StockDisponible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
