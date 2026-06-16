/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;
import model.Datos;

/**
 *
 * @author shari
 */
public class frmPrincipalAdmin extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmPrincipalAdmin.class.getName());
    private java.util.List<Integer> idsEnTabla = new java.util.ArrayList<>();
    private java.util.List<String> tiposEnTabla = new java.util.ArrayList<>();
    /**
     * 
     */
    public frmPrincipalAdmin() {
        initComponents();
        if (model.Datos.adminActual != null) {
            nombre.setText(model.Datos.adminActual.getNombre());
        }
        desktop.setOpaque(false);
        desktop.setBounds(0, 0, getWidth(), getHeight());

        getLayeredPane().add(desktop, javax.swing.JLayeredPane.PALETTE_LAYER);
        this.setExtendedState(frmPrincipalAdmin.MAXIMIZED_BOTH);

        ImageIcon icono = new ImageIcon(
                getClass().getResource("/imagenes/usuario.png")
        );

        Image img = icono.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        btnUsuario.setIcon(new ImageIcon(img));

        ImageIcon logo = new ImageIcon(getClass().getResource("/imagenes/logoGris.png"));
        Image imagenEscalada = logo.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon(imagenEscalada));

        btnAgregarConsola.setHorizontalTextPosition(SwingConstants.CENTER);
        btnAgregarConsola.setVerticalTextPosition(SwingConstants.BOTTOM);

        btnAgregarVideojuego.setHorizontalTextPosition(SwingConstants.CENTER);
        btnAgregarVideojuego.setVerticalTextPosition(SwingConstants.BOTTOM);

        TablaProductos.setGridColor(new Color(174, 172, 160));
        TablaProductos.setRowHeight(40);
        TablaProductos.setShowGrid(true);

        JTableHeader header = TablaProductos.getTableHeader();

        header.setBackground(new Color(174, 172, 160));
        header.setForeground(Color.BLACK);
        header.setFont(new Font("Times New Roman", Font.BOLD, 14));
        header.setPreferredSize(new Dimension(header.getWidth(), 35));
        

        TablaProductos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        TablaProductos.setBackground(new Color(241, 236, 224));
        TablaProductos.setSelectionBackground(new Color(77, 100, 141));
        TablaProductos.setSelectionForeground(Color.WHITE);
        
        TablaProductos.getTableHeader().setReorderingAllowed(false);
        
        cargarTabla();
    }
    
    public void cargarTabla() {
        idsEnTabla.clear();
        tiposEnTabla.clear();

        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                new String[]{"NOMBRE", "TIPO", "PRECIO", "STOCK", "DETALLE"}, 0) {
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };

        EstructurasDeDatos.ListaConsolas.Nodo auxC = model.catalogo.consolas.origen;
        while (auxC != null) {
            model.Consola c = auxC.dato;
            modelo.addRow(new Object[]{
                c.getNombre(),
                "Consola",
                "$" + c.getPrecio(),
                c.getStockDisponible(),
                "Marca: " + c.getMarca() + " | "
                + c.getAlmacenamiento() + "GB | "
                + "Color: " + c.getColor() + " | "
                + "juego incluido: " + (c.isIncluyeJuego() ? "Sí" : "No")
            });
            idsEnTabla.add(c.getId_Consola());
            tiposEnTabla.add("Consola");
            auxC = auxC.siguiente;
        }

        EstructurasDeDatos.ListaVideojuegos.Nodo auxV = model.catalogo.videojuegos.cola;
        while (auxV != null) {
            model.Videojuego v = auxV.getValor();
            modelo.addRow(new Object[]{
                v.getNombre(),
                "Videojuego",
                "$" + v.getPrecio(),
                v.getStockDisponible(),
                "Genero: " + v.getGenero() + " | "
                + "Clasificacion: " + v.getClasificacionEdad() + " | "
                + "Plataforma: " + v.getPlataforma() + " | "
                + "Lanzamiento: " + v.getFechaLanzamiento()
            });
            idsEnTabla.add(v.getId_Videojuego());
            tiposEnTabla.add("Videojuego");
            auxV = auxV.getAptSiguiente();
        }

        TablaProductos.setModel(modelo);
        TablaProductos.setGridColor(new Color(174, 172, 160));
        TablaProductos.setRowHeight(40);
        TablaProductos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        TablaProductos.setBackground(new Color(241, 236, 224));
        TablaProductos.setSelectionBackground(new Color(77, 100, 141));
        TablaProductos.setSelectionForeground(Color.WHITE);
        TablaProductos.getColumnModel().getColumn(4).setPreferredWidth(400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        RegistrarAdmin = new javax.swing.JMenuItem();
        VerHistorial = new javax.swing.JMenuItem();
        LogOut = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Toolbar = new javax.swing.JPanel();
        btnUsuario = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        btnAgregarConsola = new javax.swing.JButton();
        btnAgregarVideojuego = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        btnModificar1 = new javax.swing.JButton();

        jPopupMenu1.setToolTipText("");

        RegistrarAdmin.setText("REGISTRAR ADMIN");
        RegistrarAdmin.addActionListener(this::RegistrarAdminActionPerformed);
        jPopupMenu1.add(RegistrarAdmin);

        VerHistorial.setText("HISTORIAL");
        VerHistorial.addActionListener(this::VerHistorialActionPerformed);
        jPopupMenu1.add(VerHistorial);

        LogOut.setText("LOG OUT");
        LogOut.addActionListener(this::LogOutActionPerformed);
        jPopupMenu1.add(LogOut);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 236, 224));

        Toolbar.setBackground(new java.awt.Color(35, 57, 91));

        btnUsuario.setBackground(new java.awt.Color(35, 57, 91));
        btnUsuario.setForeground(new java.awt.Color(35, 57, 91));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        btnUsuario.setBorder(null);
        btnUsuario.setBorderPainted(false);
        btnUsuario.setComponentPopupMenu(jPopupMenu1);
        btnUsuario.setFocusPainted(false);
        btnUsuario.setFocusTraversalPolicyProvider(true);
        btnUsuario.addActionListener(this::btnUsuarioActionPerformed);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoGris.png"))); // NOI18N
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(35, 57, 91));
        nombre.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        nombre.setForeground(new java.awt.Color(94, 117, 158));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ToolbarLayout = new javax.swing.GroupLayout(Toolbar);
        Toolbar.setLayout(ToolbarLayout);
        ToolbarLayout.setHorizontalGroup(
            ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolbarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombre)
                .addGap(18, 18, 18)
                .addComponent(btnUsuario)
                .addGap(30, 30, 30))
        );
        ToolbarLayout.setVerticalGroup(
            ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addGroup(ToolbarLayout.createSequentialGroup()
                        .addGroup(ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ToolbarLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(nombre)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnAgregarConsola.setBackground(new java.awt.Color(5, 18, 35));
        btnAgregarConsola.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAgregarConsola.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarConsola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        btnAgregarConsola.setText("Agregar Consola");
        btnAgregarConsola.addActionListener(this::btnAgregarConsolaActionPerformed);

        btnAgregarVideojuego.setBackground(new java.awt.Color(5, 18, 35));
        btnAgregarVideojuego.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAgregarVideojuego.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVideojuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        btnAgregarVideojuego.setText("Agregar Videojuego");
        btnAgregarVideojuego.setIconTextGap(5);
        btnAgregarVideojuego.addActionListener(this::btnAgregarVideojuegoActionPerformed);

        TablaProductos.setBackground(new java.awt.Color(241, 236, 224));
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FECHA", "PRODUCTO", "TIPO", "STOCK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        jLabel8.setBackground(new java.awt.Color(35, 57, 91));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 57, 91));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PRODUCTOS");

        btnEliminar.setBackground(new java.awt.Color(200, 157, 60));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(241, 236, 224));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnModificar.setBackground(new java.awt.Color(200, 157, 60));
        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(241, 236, 224));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnModificar1.setBackground(new java.awt.Color(200, 157, 60));
        btnModificar1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnModificar1.setForeground(new java.awt.Color(241, 236, 224));
        btnModificar1.setText("ACTUALIZAR");
        btnModificar1.addActionListener(this::btnModificar1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183)
                                .addComponent(btnAgregarConsola, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(btnAgregarVideojuego, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(657, 657, 657)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 185, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(494, 494, 494))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarConsola, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(btnAgregarVideojuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        jPopupMenu1.show(btnUsuario, 0, btnUsuario.getHeight());
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnAgregarConsolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarConsolaActionPerformed
        frmNuevaConsola ventana = new frmNuevaConsola();
        desktop.add(ventana);
        ventana.setSize(900, 600);
        ventana.setLocation((desktop.getWidth() - ventana.getWidth()) / 2,(desktop.getHeight() - ventana.getHeight()) / 2);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAgregarConsolaActionPerformed

    private void btnAgregarVideojuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVideojuegoActionPerformed
        frmNuevoVideojuego ventana = new frmNuevoVideojuego();
        desktop.add(ventana);
        ventana.setLocation((desktop.getWidth() - ventana.getWidth()) / 2,(desktop.getHeight() - ventana.getHeight()) / 2);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAgregarVideojuegoActionPerformed

    private void RegistrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAdminActionPerformed
        frmRegistroAdministrador ventana = new frmRegistroAdministrador();
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_RegistrarAdminActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        frmLogin ventana = new frmLogin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutActionPerformed

    private void VerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerHistorialActionPerformed
        frmHistorial ventana = new frmHistorial();
        desktop.add(ventana);
        ventana.pack();
        ventana.setLocation((desktop.getWidth() - ventana.getWidth()) / 2,(desktop.getHeight() - ventana.getHeight()) / 2);
        ventana.setVisible(true);
    }//GEN-LAST:event_VerHistorialActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = TablaProductos.getSelectedRow();
        if (fila == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debes escoger un producto antes",
                    "Advertencia",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = idsEnTabla.get(fila);
        String tipo = tiposEnTabla.get(fila);
        String nombre = TablaProductos.getValueAt(fila, 0).toString();

        int confirmar = javax.swing.JOptionPane.showConfirmDialog(this,
                "¿Eliminar " + tipo + ": " + nombre + "?",
                "Eliminacion",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirmar == javax.swing.JOptionPane.YES_OPTION) {
            if (tipo.equals("Consola")) {
                model.catalogo.consolas.eliminar(id);
            } else {
                model.catalogo.videojuegos.desencolar();
            }
            cargarTabla();
            javax.swing.JOptionPane.showMessageDialog(this,
                    nombre + " eliminado correctamente.",
                    "Eliminado",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = TablaProductos.getSelectedRow();
        if (fila == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debes seleccionar antes una fila",
                    "Advertencia",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String tipo = tiposEnTabla.get(fila);
        int id = idsEnTabla.get(fila);
        String nombre = TablaProductos.getValueAt(fila, 0).toString();

        javax.swing.JTextField txtPrecio = new javax.swing.JTextField(10);
        javax.swing.JTextField txtStock = new javax.swing.JTextField(10);
        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridLayout(4, 1, 5, 5));
        panel.add(new javax.swing.JLabel("Nuevo precio:"));
        panel.add(txtPrecio);
        panel.add(new javax.swing.JLabel("Nuevo stock:"));
        panel.add(txtStock);

        int resultado = javax.swing.JOptionPane.showConfirmDialog(this,
                panel, "Modificar " + tipo,
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE);

        if (resultado == javax.swing.JOptionPane.OK_OPTION) {
            try {
                double nuevoPrecio = Double.parseDouble(txtPrecio.getText().trim().replace(",", "."));
                int nuevoStock = Integer.parseInt(txtStock.getText().trim());

                if (tipo.equals("Consola")) {
                    model.Consola c = model.catalogo.consolas.obtener(id);
                    c.setPrecio(nuevoPrecio);
                    c.setStockDisponible(nuevoStock);
                } else {
                    EstructurasDeDatos.ListaVideojuegos.Nodo aux = model.catalogo.videojuegos.cola;
                    while (aux != null) {
                        if (aux.getValor().getId_Videojuego() == id) {
                            aux.getValor().setPrecio(nuevoPrecio);
                            aux.getValor().setStockDisponible(nuevoStock);
                            break;
                        }
                        aux = aux.getAptSiguiente();
                    }
                }
                cargarTabla();
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Proceso terminado correctamente",
                        "Exito",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Erros en el formato de precio y stock ",
                        "Error de formato",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        // TODO add your handling code here:
        frmRegistroAdministrador ventana = new frmRegistroAdministrador();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoMouseClicked

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnModificar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frmPrincipalAdmin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem LogOut;
    private javax.swing.JMenuItem RegistrarAdmin;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JPanel Toolbar;
    private javax.swing.JMenuItem VerHistorial;
    private javax.swing.JButton btnAgregarConsola;
    private javax.swing.JButton btnAgregarVideojuego;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}
