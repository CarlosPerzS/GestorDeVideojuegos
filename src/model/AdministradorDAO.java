/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shari
 */
public class AdministradorDAO {

    public Administrador login(String correo, String contraseña) {
        for (Administrador a : Datos.admins) {
            if (a != null
                    && a.getCorreo().equals(correo)
                    && a.getContrasena().equals(contraseña)) {
                return a;
            }
        }
        return null;
    }

    
    public boolean registrar(Administrador admin) {
        for (int i = 0; i < Datos.admins.length; i++) {
            if (Datos.admins[i] == null) {
                Datos.admins[i] = admin;
                return true;
            }
        }
        return false;
    }
}
