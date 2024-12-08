/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Usuario
 */
public class MENÚ_PLATOS extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private HashSet<String> idsPlatos;
    private HashSet<String> nombresPlatos;
    Connection conet;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form MENÚ_PLATOS
     */
    public MENÚ_PLATOS() {
    modelo = new DefaultTableModel(); // Inicializar el modelo de tabla
    initComponents();
    idsPlatos = new HashSet<>();
    nombresPlatos = new HashSet<>();
    modelo.addColumn("ID");
    modelo.addColumn("MENÚ");
    modelo.addColumn("INGREDIENTES");
    modelo.addColumn("COSTO");
    TablaMenuPlato.setModel(modelo);
    ConsultarPlatos();
    ordenarTablaPorID();   // Solo ordena la visualización de la tabla, no el modelo

    // Evento para seleccionar una fila y llenar los campos
    TablaMenuPlato.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            int filaVisual = TablaMenuPlato.getSelectedRow(); // Índice visual de la fila seleccionada
            if (filaVisual >= 0) {
                // Convertir el índice visual al índice del modelo para acceder correctamente a los datos
                int filaModelo = TablaMenuPlato.convertRowIndexToModel(filaVisual);
                
                // Llenar los campos de texto con los valores de la fila seleccionada
                txtIdDelPlato.setText(modelo.getValueAt(filaModelo, 0).toString());
                txtNombreDelPlato.setText(modelo.getValueAt(filaModelo, 1).toString());
                jTextAreaIngredientes.setText(modelo.getValueAt(filaModelo, 2).toString());
                txtPrecioDelPlato.setText(modelo.getValueAt(filaModelo, 3).toString());
            }
        }
    });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMenuPlato = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevoPlato = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIdDelPlato = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreDelPlato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaIngredientes = new javax.swing.JTextArea();
        txtPrecioDelPlato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaMenuPlato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "MENÚ", "INGREDIENTES", "COSTO"
            }
        ));
        jScrollPane1.setViewportView(TablaMenuPlato);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 580, 209));

        btnSalir.setBackground(java.awt.Color.gray);
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 110, 50));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PRECIO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 110, 50));

        btnAgregar.setBackground(new java.awt.Color(255, 153, 0));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 110, 50));

        btnNuevoPlato.setBackground(new java.awt.Color(255, 153, 0));
        btnNuevoPlato.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevoPlato.setText("NUEVO PLATO");
        btnNuevoPlato.setBorder(null);
        btnNuevoPlato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoPlatoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoPlatoMouseExited(evt);
            }
        });
        btnNuevoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPlatoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 110, 50));

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, 50));

        btnEliminar.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 110, 50));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID PLATO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txtIdDelPlato.setForeground(new java.awt.Color(0, 0, 0));
        txtIdDelPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdDelPlatoMousePressed(evt);
            }
        });
        jPanel1.add(txtIdDelPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 190, 40));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE DEL PLATO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtNombreDelPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDelPlatoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreDelPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 190, 40));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INGREDIENTES:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jTextAreaIngredientes.setColumns(20);
        jTextAreaIngredientes.setRows(5);
        jScrollPane2.setViewportView(jTextAreaIngredientes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 190, 131));
        jPanel1.add(txtPrecioDelPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 190, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENU DE PLATOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 190, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPlatoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoPlatoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MENU_PRICIPAL mMENU_PRICIPAL = new MENU_PRICIPAL();
        mMENU_PRICIPAL.setVisible(true);
        mMENU_PRICIPAL.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    String idplato = txtIdDelPlato.getText().trim();
    String menu = txtNombreDelPlato.getText().trim();
    String ingredientes = jTextAreaIngredientes.getText().replace("\n", " | ").trim();
    String costo = txtPrecioDelPlato.getText().trim();

    if (idplato.isEmpty() || menu.isEmpty() || ingredientes.isEmpty() || costo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos");
    } else if (idsPlatos.contains(idplato)) {
        JOptionPane.showMessageDialog(this, "El ID del plato ya existe. Ingrese un ID diferente.");
    } else if (nombresPlatos.contains(menu)) {
        JOptionPane.showMessageDialog(this, "El nombre del plato ya existe. Ingrese un nombre diferente.");
    } else {
        try {
            // Guardar en la base de datos
            Connection con = Conexion.getInstance().getConnection(); // Obtener la conexión
            String sql = "INSERT INTO menu_platos (ID, MENU, INGREDIENTES, COSTO) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, idplato);
            pst.setString(2, menu);
            pst.setString(3, ingredientes);
            pst.setString(4, costo);
            
            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                // Guardar en la tabla si la inserción fue exitosa
                idsPlatos.add(idplato);
                nombresPlatos.add(menu);
                modelo.addRow(new Object[]{idplato, menu, ingredientes, costo});
                JOptionPane.showMessageDialog(this, "Plato registrado con éxito en la base de datos y en la tabla.");
                
                ordenarTablaPorID(); // Ordenar la tabla después de agregar un nuevo plato
                limpiarCampos(); // Limpiar los campos de texto
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar el plato en la base de datos.");
            }
            pst.close(); // Cerrar el PreparedStatement
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar en la base de datos: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int filaSeleccionada = TablaMenuPlato.getSelectedRow();

        if (filaSeleccionada >= 0) {
            // Obtener los valores del formulario
        String idPlato = txtIdDelPlato.getText().trim();
        String menu = txtNombreDelPlato.getText().trim();
        String ingredientes = jTextAreaIngredientes.getText().replace("\n", " | ").trim();
        String costo = txtPrecioDelPlato.getText().trim();

        if (idPlato.isEmpty() || menu.isEmpty() || ingredientes.isEmpty() || costo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.");
            return;
        }

        try {
            // Obtener la conexión a la base de datos
            Connection con = Conexion.getInstance().getConnection();
            
            // Preparar la consulta SQL para actualizar
            String sql = "UPDATE menu_platos SET MENU = ?, INGREDIENTES = ?, COSTO = ? WHERE ID = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, menu);
            pst.setString(2, ingredientes);
            pst.setString(3, costo);
            pst.setString(4, idPlato);

            // Ejecutar la consulta
            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas > 0) {
                // Actualizar los datos en la tabla de la interfaz
                modelo.setValueAt(idPlato, filaSeleccionada, 0);
                modelo.setValueAt(menu, filaSeleccionada, 1);
                modelo.setValueAt(ingredientes, filaSeleccionada, 2);
                modelo.setValueAt(costo, filaSeleccionada, 3);

                JOptionPane.showMessageDialog(this, "Plato editado con éxito en la base de datos.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un plato con el ID especificado.");
            }

            // Cerrar el PreparedStatement
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al editar el plato en la base de datos: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un plato para editar.");
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = TablaMenuPlato.getSelectedRow();

        if (filaSeleccionada >= 0) {
            // Obtener el ID del plato seleccionado
        String idPlato = modelo.getValueAt(filaSeleccionada, 0).toString();

        // Confirmar eliminación
        int confirmacion = JOptionPane.showConfirmDialog(this, 
            "¿Está seguro de que desea eliminar este plato?", 
            "Confirmación", 
            JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                // Obtener la conexión a la base de datos
                Connection con = Conexion.getInstance().getConnection();
                
                // Preparar la consulta SQL para eliminar
                String sql = "DELETE FROM menu_platos WHERE ID = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, idPlato);

                // Ejecutar la consulta
                int filasAfectadas = pst.executeUpdate();

                if (filasAfectadas > 0) {
                    // Eliminar la fila seleccionada en la tabla de la interfaz
                    modelo.removeRow(filaSeleccionada);

                    // Mensaje de éxito
                    JOptionPane.showMessageDialog(this, "Plato eliminado con éxito de la base de datos.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un plato con el ID especificado.");
                }

                // Cerrar el PreparedStatement
                pst.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el plato en la base de datos: " + ex.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Debe seleccionar un plato para eliminar.");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String idPlato = txtIdDelPlato.getText().trim();
    String nombrePlato = txtNombreDelPlato.getText().trim();

    if (validarIDPlato(idPlato) && validarNombre(nombrePlato) &&
        validarIngredientes(jTextAreaIngredientes.getText().trim()) &&
        validarPrecio(txtPrecioDelPlato.getText().trim())) {

        JOptionPane.showMessageDialog(this, "Datos válidos. Puede agregar el plato.");
    } else {
        JOptionPane.showMessageDialog(this, "Debe insertar datos correctos");
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public static boolean validarIDPlato(String datos) {
        return datos.matches("^\\d{1,5}$");
    }

    public static boolean validarNombre(String datos) {
        return datos.matches("^[a-zA-ZÀ-ÿ\\s]{3,30}$");
    }

    public static boolean validarIngredientes(String datos) {
        return datos.matches("^[a-zA-ZÀ-ÿ\\s]{3,500000}$");
    }

    public static boolean validarPrecio(String datos) {
        return datos.matches("^\\d+(\\.\\d{1,2})?$");
    }

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(255, 153, 153));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(Color.gray);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnNuevoPlatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoPlatoMouseEntered
        btnNuevoPlato.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnNuevoPlatoMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnNuevoPlatoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoPlatoMouseExited
        btnNuevoPlato.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnNuevoPlatoMouseExited

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void txtNombreDelPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDelPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDelPlatoActionPerformed

    private void txtIdDelPlatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdDelPlatoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDelPlatoMousePressed

    void ConsultarPlatos() {
        String sql = "select * from menu_platos";
        
       try {
           // Obtener la conexión utilizando el Singleton
        conet = Conexion.getInstance().getConnection();
        
        // Crear el Statement y ejecutar la consulta
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        // Crear un arreglo para almacenar los datos de cada empleado
        Object[] menu_platos = new Object[4];
        
        // Iterar sobre los resultados y agregar los datos a la tabla
        while (rs.next()) {
            menu_platos[0] = rs.getInt("ID");
            menu_platos[1] = rs.getString("MENU");
            menu_platos[2] = rs.getString("INGREDIENTES");
            menu_platos[3] = rs.getInt("COSTO");
            
            modelo.addRow(menu_platos);
        }
        
        // Asignar el modelo a la tabla
        TablaMenuPlato.setModel(modelo);
        
    } catch (Exception e) {
        // Mostrar el mensaje de error si algo falla
        JOptionPane.showMessageDialog(this, "Error al consultar datos: " + e.getMessage());
    }
    }
    
    private void ordenarTablaPorID() {
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
    TablaMenuPlato.setRowSorter(sorter);

    // Ordenar por la columna de ID (columna 0), en orden ascendente
    List<RowSorter.SortKey> sortKeys = new ArrayList<>();
    sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
    sorter.setSortKeys(sortKeys);
    }

    private void limpiarCampos() {
        txtIdDelPlato.setText("");
        txtNombreDelPlato.setText("");
        jTextAreaIngredientes.setText("");
        txtPrecioDelPlato.setText("");
    }

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENÚ_PLATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENÚ_PLATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENÚ_PLATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENÚ_PLATOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENÚ_PLATOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMenuPlato;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevoPlato;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaIngredientes;
    private javax.swing.JTextField txtIdDelPlato;
    private javax.swing.JTextField txtNombreDelPlato;
    private javax.swing.JTextField txtPrecioDelPlato;
    // End of variables declaration//GEN-END:variables
}
