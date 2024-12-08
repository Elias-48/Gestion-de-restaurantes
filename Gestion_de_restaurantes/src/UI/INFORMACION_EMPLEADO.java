/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class INFORMACION_EMPLEADO extends javax.swing.JFrame {

    private DefaultTableModel modelo1;
    private HashSet<String> idsUnicos;
    private HashSet<String> correosUnicos;
    private HashSet<String> telefonosUnicos;
    Connection conet;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form INFORMACION_EMPLEADO
     */
    public INFORMACION_EMPLEADO() {
        initComponents();
        modelo1 = new DefaultTableModel();
        idsUnicos = new HashSet<>();
        correosUnicos = new HashSet<>();
        telefonosUnicos = new HashSet<>();
        modelo1.addColumn("ID");
        modelo1.addColumn("CARGO");
        modelo1.addColumn("NOMBRE");
        modelo1.addColumn("GMAIL");
        modelo1.addColumn("DIRECION");
        modelo1.addColumn("TELEFONO");
        TablaInformacionEmpleados.setModel(modelo1);
        ordenarTablaPorID();
        ConsultarEmpleado();
        // Agregar el evento para detectar clics en las filas
        TablaInformacionEmpleados.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = TablaInformacionEmpleados.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    // Obtener los valores de la fila seleccionada y colocarlos en los campos de texto
                    txtIDEmpleado.setText(modelo1.getValueAt(filaSeleccionada, 0).toString());
                    jComboBoxCargoDelEmpleado.setSelectedItem(modelo1.getValueAt(filaSeleccionada, 1).toString());
                    txtNombreEmpleado.setText(modelo1.getValueAt(filaSeleccionada, 2).toString());
                    txtCorreo.setText(modelo1.getValueAt(filaSeleccionada, 3).toString());
                    txtDirecionEmpleado.setText(modelo1.getValueAt(filaSeleccionada, 4).toString());
                    txtTelefonoEmpleado.setText(modelo1.getValueAt(filaSeleccionada, 5).toString());
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
        jLabel2 = new javax.swing.JLabel();
        txtIDEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCargoDelEmpleado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDirecionEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnNuevoEmpleado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInformacionEmpleados = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID EMPLEADO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel1.add(txtIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 170, 40));

        jLabel5.setText("CARGO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 70, -1, -1));

        jComboBoxCargoDelEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIN CARGO", "ADMINISTRADOR ", "MESERO", "CHEF" }));
        jComboBoxCargoDelEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCargoDelEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCargoDelEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 172, 40));

        jLabel3.setText("NOMBRE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, -1));
        jPanel1.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 171, 40));

        jLabel7.setText("CORREO ELECTRONICO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, -1));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 171, 40));

        jLabel4.setText("DIRECCIÓN:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 220, -1, -1));
        jPanel1.add(txtDirecionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 171, 40));

        jLabel6.setText("TELÉFONO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, -1));
        jPanel1.add(txtTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 171, 40));

        btnRegistrar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(null);
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
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 114, 50));

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
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
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 114, 50));

        btnEliminar.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 114, 50));

        btnAgregar.setBackground(new java.awt.Color(255, 153, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(null);
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
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 114, 50));

        btnNuevoEmpleado.setBackground(new java.awt.Color(255, 153, 0));
        btnNuevoEmpleado.setText("NUEVO EMPLEADO");
        btnNuevoEmpleado.setBorder(null);
        btnNuevoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoEmpleadoMouseExited(evt);
            }
        });
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 114, 50));

        btnSalir.setBackground(java.awt.Color.gray);
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 114, 50));

        TablaInformacionEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CARGO", "NOMBRE", "GMAIL", "DIRECCION", "TELEFONO"
            }
        ));
        jScrollPane1.setViewportView(TablaInformacionEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 670, 191));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 340, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("INFORMACION DE EMPLEADOS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 340, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCargoDelEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCargoDelEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCargoDelEmpleadoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
 
        if (validarIDEmpleado(txtIDEmpleado.getText().trim()) && validarNombreDelEmpleado(txtNombreEmpleado.getText().trim()) && validarCorreo(txtCorreo.getText().trim()) && validarDireccion(txtDirecionEmpleado.getText().trim()) && validarTelefono(txtTelefonoEmpleado.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Empleado registrado con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "Debe insertar datos correctos");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
    public static boolean validarIDEmpleado(String datos) {
        return datos.matches("^\\d{1,5}$");
    }

    public static boolean validarNombreDelEmpleado(String datos) {
        return datos.matches("^[a-zA-ZÀ-ÿ\\s]{3,50}$");
    }

    public static boolean validarCorreo(String datos) {
        return datos.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
    }

    public static boolean validarDireccion(String datos) {
        return datos.matches("^[a-zA-Z0-9À-ÿ\\s,.-]{5,100}$");
    }

    public static boolean validarTelefono(String datos) {
        return datos.matches("^\\d{9}$");
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MENU_PRICIPAL mMENU_PRICIPAL = new MENU_PRICIPAL();
        mMENU_PRICIPAL.setVisible(true);
        mMENU_PRICIPAL.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String id = txtIDEmpleado.getText();
        String cargo = jComboBoxCargoDelEmpleado.getSelectedItem().toString();
        String nombre = txtNombreEmpleado.getText();
        String gmail = txtCorreo.getText();
        String direccion = txtDirecionEmpleado.getText();
        String telefono = txtTelefonoEmpleado.getText();

        if (id.isEmpty() || cargo.equals("SIN CARGO") || nombre.isEmpty() || gmail.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
        }

        // Validación de duplicados usando HashSet
        if (idsUnicos.contains(id)) {
            JOptionPane.showMessageDialog(this, "El ID ya está registrado. Ingrese un ID único.");
            return;
        }
        if (correosUnicos.contains(gmail)) {
            JOptionPane.showMessageDialog(this, "El correo ya está registrado. Ingrese un correo único.");
            return;
        }
        if (telefonosUnicos.contains(telefono)) {
            JOptionPane.showMessageDialog(this, "El teléfono ya está registrado. Ingrese un teléfono único.");
            return;
        }
        // Guardar datos en la base de datos
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante", "root", "")) {
            String sql = "INSERT INTO informacion_empleado (id, cargo, nombre, gmail, direccion, telefono) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, cargo);
            pst.setString(3, nombre);
            pst.setString(4, gmail);
            pst.setString(5, direccion);
            pst.setString(6, telefono);

            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
               JOptionPane.showMessageDialog(this, "Datos guardados correctamente en la base de datos.");
            } else {
               JOptionPane.showMessageDialog(this, "No se pudo guardar en la base de datos.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar en la base de datos: " + e.getMessage());
          return;
        }

        // Agregar datos al HashSet y actualizar la tabla del JFrame
        modelo1.addRow(new Object[]{id, cargo, nombre, gmail, direccion, telefono});
        idsUnicos.add(id);
        correosUnicos.add(gmail);
        telefonosUnicos.add(telefono);

        // Ordenar la tabla por ID
        ordenarTablaPorID();
        
    }//GEN-LAST:event_btnAgregarActionPerformed
private void ordenarTablaPorID() {
        List<Object[]> filas = new ArrayList<>();
        for (int i = 0; i < modelo1.getRowCount(); i++) {
            filas.add(new Object[]{
                modelo1.getValueAt(i, 0), modelo1.getValueAt(i, 1),
                modelo1.getValueAt(i, 2), modelo1.getValueAt(i, 3),
                modelo1.getValueAt(i, 4), modelo1.getValueAt(i, 5)
            });
        }
        
        filas.sort(Comparator.comparingInt(o -> Integer.parseInt(o[0].toString())));

        modelo1.setRowCount(0);  // Limpiar tabla antes de reordenar
        for (Object[] fila : filas) {
            modelo1.addRow(fila);
        }
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int filaSeleccionada = TablaInformacionEmpleados.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Obtener los nuevos valores
        String id = txtIDEmpleado.getText();
        String cargo = jComboBoxCargoDelEmpleado.getSelectedItem().toString();
        String nombre = txtNombreEmpleado.getText();
        String gmail = txtCorreo.getText();
        String direccion = txtDirecionEmpleado.getText();
        String telefono = txtTelefonoEmpleado.getText();

        // Actualizar la fila de la tabla
        modelo1.setValueAt(id, filaSeleccionada, 0);
        modelo1.setValueAt(cargo, filaSeleccionada, 1);
        modelo1.setValueAt(nombre, filaSeleccionada, 2);
        modelo1.setValueAt(gmail, filaSeleccionada, 3);
        modelo1.setValueAt(direccion, filaSeleccionada, 4);
        modelo1.setValueAt(telefono, filaSeleccionada, 5);

        // Actualizar en la base de datos
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante", "root", "")) {
            String sql = "UPDATE informacion_empleado SET cargo = ?, nombre = ?, gmail = ?, direccion = ?, telefono = ? WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(6, id);    // Parametro 6: id (donde se hace la comparación)
            pst.setString(1, cargo);
            pst.setString(2, nombre);
            pst.setString(3, gmail);
            pst.setString(4, direccion);
            pst.setString(5, telefono);

            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Empleado actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el empleado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar en la base de datos: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para editar.");
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = TablaInformacionEmpleados.getSelectedRow();
        if (filaSeleccionada != -1) {
            // Confirmación de eliminación
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este empleado?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Obtener el id, correo y teléfono del empleado a eliminar
            String id = modelo1.getValueAt(filaSeleccionada, 0).toString();
            String gmail = modelo1.getValueAt(filaSeleccionada, 3).toString();
            String telefono = modelo1.getValueAt(filaSeleccionada, 5).toString();

            // Eliminar de los HashSets
            idsUnicos.remove(id);
            correosUnicos.remove(gmail);
            telefonosUnicos.remove(telefono);

            // Eliminar de la tabla
            modelo1.removeRow(filaSeleccionada);

            // Eliminar del SQL
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurante", "root", "")) {
                String sql = "DELETE FROM informacion_empleado WHERE id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, id);

                int filasAfectadas = pst.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Empleado eliminado correctamente de la base de datos.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el empleado de la base de datos.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar en la base de datos: " + e.getMessage());
            }

            JOptionPane.showMessageDialog(this, "Empleado eliminado.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para eliminar.");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(255, 153, 153));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(Color.gray);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnNuevoEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoMouseEntered
        btnNuevoEmpleado.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnNuevoEmpleadoMouseEntered

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnNuevoEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoMouseExited
        btnNuevoEmpleado.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnNuevoEmpleadoMouseExited

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnEditarMouseExited

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    void ConsultarEmpleado() {
        String sql = "select * from informacion_empleado";
        
       try {
           // Obtener la conexión utilizando el Singleton
        conet = Conexion.getInstance().getConnection();
        
        // Crear el Statement y ejecutar la consulta
        st = conet.createStatement();
        rs = st.executeQuery(sql);
        
        // Crear un arreglo para almacenar los datos de cada empleado
        Object[] informacion_empleado = new Object[6];
        
        // Iterar sobre los resultados y agregar los datos a la tabla
        while (rs.next()) {
            informacion_empleado[0] = rs.getInt("ID");
            informacion_empleado[1] = rs.getString("CARGO");
            informacion_empleado[2] = rs.getString("NOMBRE");
            informacion_empleado[3] = rs.getString("GMAIL");
            informacion_empleado[4] = rs.getString("DIRECCION");
            informacion_empleado[5] = rs.getInt("TELEFONO");
            
            modelo1.addRow(informacion_empleado);
        }
        
        // Asignar el modelo a la tabla
        TablaInformacionEmpleados.setModel(modelo1);
        
    } catch (Exception e) {
        // Mostrar el mensaje de error si algo falla
        JOptionPane.showMessageDialog(this, "Error al consultar datos: " + e.getMessage());
    }
    }

    private void limpiarCampos() {
        txtIDEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtCorreo.setText("");
        txtDirecionEmpleado.setText("");
        txtTelefonoEmpleado.setText("");
        jComboBoxCargoDelEmpleado.setSelectedIndex(0);  // Vuelve a "SIN CARGO"
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
            java.util.logging.Logger.getLogger(INFORMACION_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INFORMACION_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INFORMACION_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INFORMACION_EMPLEADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INFORMACION_EMPLEADO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInformacionEmpleados;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jComboBoxCargoDelEmpleado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirecionEmpleado;
    private javax.swing.JTextField txtIDEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtTelefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}
