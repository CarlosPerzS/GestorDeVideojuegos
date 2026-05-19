/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CARLO
 */
public class Cliente {
    int id_Cliente;
    String Nombre;
    String Correo;
    String Contrasena;
    String MetodoPago;
    int ComprasRealizadas;

    public Cliente() {
    }

    public Cliente(int id_Cliente, String Nombre, String Correo, String Contrasena, String MetodoPago, int ComprasRealizadas) {
        this.id_Cliente = id_Cliente;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Contrasena = Contrasena;
        this.MetodoPago = MetodoPago;
        this.ComprasRealizadas = ComprasRealizadas;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String MetodoPago) {
        this.MetodoPago = MetodoPago;
    }

    public int getComprasRealizadas() {
        return ComprasRealizadas;
    }

    public void setComprasRealizadas(int ComprasRealizadas) {
        this.ComprasRealizadas = ComprasRealizadas;
    }
    
    
}
