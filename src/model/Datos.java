/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shari
 */
public class Datos {

    public static Cliente[] clientes = new Cliente[100];

    public static Administrador[] admins = new Administrador[20];
    
    public static Compra[] compras = new Compra[100];
    
    public static Cliente clienteActual;
    
    static {
        admins[0] = new Administrador(1, "Admin", "admin@gmail.com", "1234", 15000, "Matutino");
        
        
        clientes[0] = new Cliente(1, "Shari Palma", "shari@gmail.com", "1234", "Efectivo", 0);
        
        
    }
}
