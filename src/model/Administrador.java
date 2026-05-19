/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CARLO
 */
public class Administrador {
    int id_Administrador;
    String Nombre;
    String Correo;
    String Contrasena;
    double Salario;
    String Turno;

    public Administrador() {
    }

    public Administrador(int id_Administrador, String Nombre, String Correo, String Contrasena, double Salario, String Turno) {
        this.id_Administrador = id_Administrador;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Contrasena = Contrasena;
        this.Salario = Salario;
        this.Turno = Turno;
    }

    public int getId_Administrador() {
        return id_Administrador;
    }

    public void setId_Administrador(int id_Administrador) {
        this.id_Administrador = id_Administrador;
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

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }
    
    
}
