/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CARLO
 */
public class Videojuego extends Producto{
    int id_Videojuego;
    String clasificacionEdad;
    String Genero;
    String FechaLanzamiento;
    String Plataforma;

    public Videojuego(int id_Videojuego, String clasificacionEdad, String Genero, String FechaLanzamiento, String Plataforma, int id_Producto, String nombre, double precio, int StockDisponible, String tipo) {
        super(id_Producto, nombre, precio, StockDisponible, tipo);
        this.id_Videojuego = id_Videojuego;
        this.clasificacionEdad = clasificacionEdad;
        this.Genero = Genero;
        this.FechaLanzamiento = FechaLanzamiento;
        this.Plataforma = Plataforma;
    }

    public Videojuego() {
    }

    public int getId_Videojuego() {
        return id_Videojuego;
    }

    public void setId_Videojuego(int id_Videojuego) {
        this.id_Videojuego = id_Videojuego;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getFechaLanzamiento() {
        return FechaLanzamiento;
    }

    public void setFechaLanzamiento(String FechaLanzamiento) {
        this.FechaLanzamiento = FechaLanzamiento;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }

    
    
}


