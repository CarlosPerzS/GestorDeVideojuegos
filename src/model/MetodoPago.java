/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CARLO
 */
public class MetodoPago {
    int id_MetodoPago;
    String tipo;
    int Titular;
    String Referencia;
    String Detalles;

    public MetodoPago() {
    }

    public MetodoPago(int id_MetodoPago, String tipo, int Titular, String Referencia, String Detalles) {
        this.id_MetodoPago = id_MetodoPago;
        this.tipo = tipo;
        this.Titular = Titular;
        this.Referencia = Referencia;
        this.Detalles = Detalles;
    }

    public int getId_MetodoPago() {
        return id_MetodoPago;
    }

    public void setId_MetodoPago(int id_MetodoPago) {
        this.id_MetodoPago = id_MetodoPago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTitular() {
        return Titular;
    }

    public void setTitular(int Titular) {
        this.Titular = Titular;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }
    
    
}
