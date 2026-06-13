/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.Administrador;
import model.AdministradorDAO;
import model.Datos;
import view.frmRegistroAdministrador;

/**
 *
 * @author shari
 */
public class RegistroAdminController {

    private frmRegistroAdministrador vista;
    private AdministradorDAO dao;

    public RegistroAdminController(frmRegistroAdministrador vista) {
        this.vista = vista;
        dao = new AdministradorDAO();
    }

    public void registrar() {

        String nombre = vista.getJtfNombre().getText();
        String correo = vista.getJtfCorreo().getText();
        String contraseña = vista.getJtfContraseña().getText();
        String turno = vista.getJcbTurno().getSelectedItem().toString();

        double salario;

        try {
            salario = Double.parseDouble(
                    vista.getJtfSalario().getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vista,
                    "El salario no es válido");
            return;
        }

        int id = 1;

        for (Administrador a : Datos.admins) {
            if (a != null) {
                id++;
            }
        }

        Administrador admin = new Administrador( id, nombre, correo, contraseña, salario, turno);

        if (dao.registrar(admin)) {
            JOptionPane.showMessageDialog(vista,
                    "Administrador registrado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista,
                    "No hay espacio disponible");
        }
    }

}
