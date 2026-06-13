/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.Cliente;
import model.ClienteDAO;
import view.frmRegistroUsuario;

/**
 *
 * @author shari
 */
public class RegistroUsrController {

    private final frmRegistroUsuario vista;

    public RegistroUsrController(frmRegistroUsuario vista) {
        this.vista = vista;
    }

    public void registrar() {

        String nombre = vista.getJtfNombre().getText();
        String correo = vista.getJtfCorreo().getText();
        String contraseña = vista.getJtfContraseña().getText();
        String metodoPago = vista.getJcbMetodoPago().getSelectedItem().toString();

        if (nombre.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || metodoPago.equals("MÉTODO DE PAGO")) {
            JOptionPane.showMessageDialog(vista,
                    "Completa todos los campos");
            return;
        }

        Cliente cliente = new Cliente(obtenerId(), nombre, correo, contraseña, metodoPago, 0);

        ClienteDAO dao = new ClienteDAO();

        if (dao.registrar(cliente)) {   
            JOptionPane.showMessageDialog(vista, "Usuario registrado correctamente");
            
        } else {
            JOptionPane.showMessageDialog(vista, "Falta espacio para usuarios");
        }
    }

    private int obtenerId() {

        int id = 1;

        for (Cliente c : model.Datos.clientes) {
            if (c != null) {
                id++;
            }
        }
        return id;
    }

}
