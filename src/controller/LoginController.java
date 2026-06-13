/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.Administrador;
import model.AdministradorDAO;
import model.Cliente;
import model.ClienteDAO;
import view.frmLogin;
import view.frmPrincipalAdmin;
import view.frmPrincipalCliente;

/**
 *
 * @author shari
 */

public class LoginController {

    private final frmLogin vista;

    public LoginController(frmLogin vista) {
        this.vista = vista;
    }

    public void login() {

        String correo = vista.getJtfCorreo().getText();
        String contraseña = String.valueOf(vista.getJtfContraseña().getPassword());
        
        AdministradorDAO administradorDAO = new AdministradorDAO();
        Administrador admin = administradorDAO.login(correo, contraseña);

        if (admin != null) {
            new frmPrincipalAdmin().setVisible(true);
            vista.dispose();

            return;
        }

        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.login(correo, contraseña);

        if (cliente != null) {
            new frmPrincipalCliente().setVisible(true);
            vista.dispose();

            return;
        }

        JOptionPane.showMessageDialog(vista, "Correo o contraseña incorrectos");
    }
}
