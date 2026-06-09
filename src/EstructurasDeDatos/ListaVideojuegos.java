/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

import model.Videojuego;

/**
 *
 * @author CARLO
 */
public class ListaVideojuegos { //Cola
    public Nodo cola;
    class Nodo {
        private Videojuego valor;
        public Nodo aptSiguiente;

        public Nodo(Videojuego valor) {
            this.valor = valor;
        }

        public Nodo(Videojuego valor, Nodo aptSiguiente) {
            this.valor = valor;
            this.aptSiguiente = aptSiguiente;
        }

        public Videojuego getValor() {
            return valor;
        }

        public void setValor(Videojuego valor) {
            this.valor = valor;
        }

        public Nodo getAptSiguiente() {
            return aptSiguiente;
        }

        public void setAptSiguiente(Nodo aptSiguiente) {
            this.aptSiguiente = aptSiguiente;
        }
    }
    
    public void encolar(Videojuego v){
        Nodo nuevo = new Nodo(v);
        if (cola == null){
            cola = nuevo;
        }
        else{
            Nodo aux = cola;
            while(aux.getAptSiguiente() != null){
                aux = aux.getAptSiguiente();
            }
            aux.aptSiguiente = nuevo;
        }
    }
    public String recorrerCola(){
        Nodo aux = cola;
        String valores = "";
        if(cola == null){
            valores = "La cola esta vacia.";
        }
        else{
            valores = "Videojuegos en la cola: \n";
            while(aux != null){
                valores += "Videojuego: " + aux.getValor().getNombre() + "\n";
                aux = aux.getAptSiguiente();
            }
        }
        return valores;
    }
    
    public String desencolar(){
        Nodo aux = cola;
        String valores="";
        if(cola ==null){
            valores = "La cola esta vacia.";
        }
        else{
            if(aux.getAptSiguiente()==null){
                cola = null;
            }
            else{
                cola = aux.getAptSiguiente();
            }
            valores = "Primer elemento eliminado";
        }
        return valores;
    }
}
