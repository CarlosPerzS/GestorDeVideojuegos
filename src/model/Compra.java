/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CARLO
 */
public class Compra {
    int id_Venta;
    int id_Producto;
    int id_Cliente;
    int id_MetodoPago;
    double Subtotal;
    double Total;
    boolean Estado;

    public Compra() {
    }

    public Compra(int id_Venta, int id_Producto, int id_Cliente, int id_MetodoPago, double Subtotal, double Total, boolean Estado) {
        this.id_Venta = id_Venta;
        this.id_Producto = id_Producto;
        this.id_Cliente = id_Cliente;
        this.id_MetodoPago = id_MetodoPago;
        this.Subtotal = Subtotal;
        this.Total = Total;
        this.Estado = Estado;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getId_MetodoPago() {
        return id_MetodoPago;
    }

    public void setId_MetodoPago(int id_MetodoPago) {
        this.id_MetodoPago = id_MetodoPago;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
}
