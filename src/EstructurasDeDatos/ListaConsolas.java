/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

import model.Consola;

/**
 *
 * @author CARLO
 */
public class ListaConsolas {  //Lista Enlazada
    class Nodo {
        Consola dato;
        Nodo siguiente;
        
        Nodo(Consola u){ 
            this.dato = u; 
            this.siguiente = null;
        }
    }
    
    Nodo origen = null;
    
    public void agregar(Consola u){
        Nodo x = new Nodo(u);
        if(origen!= null){
            Nodo temp = origen;
            while (temp.siguiente!= null){
                temp = temp.siguiente;
            }
            temp.siguiente = x;
        }
        else{
            origen = x;
        }
    }
    
    public String eliminar(int id){
       if(busquedaValida(id)){ //es valido
           Nodo temp = origen;
           if(temp.dato.getId_Consola() == id){
               temp = temp.siguiente;
           }
           else{
                while(temp.siguiente!=null){
                    if(temp.siguiente.dato.getId_Consola() == id){
                        Nodo eliminar = temp.siguiente;
                        temp.siguiente = eliminar.siguiente;
                    }
                    else{
                        temp = temp.siguiente;
                    }
                }   
           }
           return "Consola: " + id + " eliminada";
       }
       else{
           return "No existe consola con el id: " + id;
       }
    }
    
    public Consola obtener(int id){
        Nodo temp = origen;
        while (temp!= null){
            if(id == temp.dato.getId_Consola()){
                break;
            }
            else{
                temp = temp.siguiente;
            }
        }
        return temp.dato;
    }
    
    public boolean busquedaValida(int id){
        boolean encontrado = false;
        Nodo temp = origen;
        while (temp!= null){
            if(id == temp.dato.getId_Consola()){
                encontrado = true;
                break;
            }
            else{
                temp = temp.siguiente;
            }
        }
        return encontrado;
    }
    
    public String modificar (int id, Consola datosNuevos){
        if(busquedaValida(id)){ //es valido
           Nodo temp = origen;
           while (temp!= null){
               if(temp.dato.getId_Consola() == id){
                   temp.dato = datosNuevos;
                   break;
               }
               else{
                   temp = temp.siguiente;
               }
           }
           return "Consola: " + id + " modificada";
       }
       else{
           return "No existe consola con el id: " + id;
       }
    }
}
