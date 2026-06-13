/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shari
 */
public class ClienteDAO {

    public Cliente login(String correo, String contraseña) {
        for (Cliente c : Datos.clientes) {
            if (c != null && c.getCorreo().equals(correo) && c.getContrasena().equals(contraseña)) {
                return c;
            }
        }
        return null;
    }

    
    
    public boolean registrar(Cliente cliente) {
        for (int i = 0; i < Datos.clientes.length;  i++) {
            if (Datos.clientes[i] == null) {
                Datos.clientes[i] = cliente;
                return true;
            }
        }
        return false;
    }

    
    
    
}
