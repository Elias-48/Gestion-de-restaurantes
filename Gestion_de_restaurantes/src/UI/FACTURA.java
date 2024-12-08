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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


/**
 *
 * @author Usuario
 */
public class FACTURA extends javax.swing.JFrame {

    private DefaultTableModel modelo2;  
    private HashSet<String> idFacturas;  
    private HashSet<String> idClientes;
    Connection conet;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form FACTURA
     */
    public FACTURA() {
        initComponents();
        modelo2 = new DefaultTableModel();
        idFacturas = new HashSet<>();  
        idClientes = new HashSet<>();
        modelo2.addColumn("ID FACTURA");
        modelo2.addColumn("ID CLIENTE");
        modelo2.addColumn("NOMBRE CLIENTE");
        modelo2.addColumn("FECHA RESERVADA");
        modelo2.addColumn("PRECIO TOTAL");
        TablaFactura.setModel(modelo2);
        ConsultarFactura();
        ordenarTablaPorIDFactura();
        // Agregar el evento para detectar clics en las filas
        TablaFactura.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = TablaFactura.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    // Obtener los valores de la fila seleccionada y colocarlos en los campos de texto
                    txtIDFactura.setText(modelo2.getValueAt(filaSeleccionada, 0).toString());
                    txtIdCliente.setText(modelo2.getValueAt(filaSeleccionada, 1).toString());
                }
            }
        });
    }
    private void ordenarTablaPorIDFactura() {   
    int rowCount = modelo2.getRowCount();  
    List<Object[]> tableData = new ArrayList<>();  

    for (int i = 0; i < rowCount; i++) {  
        Object[] row = new Object[modelo2.getColumnCount()];  
        for (int j = 0; j < modelo2.getColumnCount(); j++) {  
            row[j] = modelo2.getValueAt(i, j);  
        }  
        tableData.add(row);  
    }  

    // Ordenar la lista por el primer elemento (IDFactura)  
    Collections.sort(tableData, new Comparator<Object[]>() {  
        @Override  
        public int compare(Object[] row1, Object[] row2) {  
            return row1[0].toString().compareTo(row2[0].toString());  
        }  
    });  

    // Limpiar y volver a llenar el modelo de la tabla  
    modelo2.setRowCount(0); // Limpiar el modelo  
    for (Object[] rowData : tableData) {  
        modelo2.addRow(rowData);  
    }    
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
        txtIDFactura = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaFactura = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnNuevoComprobante = new javax.swing.JButton();
        btnGenerarComprobante = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIDFactura.setForeground(new java.awt.Color(153, 153, 153));
        txtIDFactura.setText("ID FACTURA");
        txtIDFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIDFacturaMousePressed(evt);
            }
        });
        txtIDFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 50));

        txtIdCliente.setForeground(new java.awt.Color(153, 153, 153));
        txtIdCliente.setText("ID CLIENTE");
        txtIdCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdClienteMousePressed(evt);
            }
        });
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 50));

        TablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID FACTURA", "ID CLIENTE", "NOMBRE", "FECHA RESERVADA", "PRECIO TOTAL"
            }
        ));
        jScrollPane2.setViewportView(TablaFactura);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 650, 200));

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
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 160, 40));

        btnMostrar.setBackground(new java.awt.Color(255, 153, 0));
        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setBorder(null);
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarMouseExited(evt);
            }
        });
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 160, 40));

        btnNuevoComprobante.setBackground(new java.awt.Color(255, 153, 0));
        btnNuevoComprobante.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevoComprobante.setText("NUEVO COMPROBANTE");
        btnNuevoComprobante.setBorder(null);
        btnNuevoComprobante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoComprobante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevoComprobanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevoComprobanteMouseExited(evt);
            }
        });
        btnNuevoComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoComprobanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 180, 40));

        btnGenerarComprobante.setBackground(new java.awt.Color(255, 153, 0));
        btnGenerarComprobante.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerarComprobante.setText("GENERAR COMPROBANTE");
        btnGenerarComprobante.setBorder(null);
        btnGenerarComprobante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarComprobante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarComprobanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarComprobanteMouseExited(evt);
            }
        });
        btnGenerarComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarComprobanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 180, 40));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 110, 30));

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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarComprobanteActionPerformed
        // Verificar si se ha seleccionado una fila
        int filaSeleccionada = TablaFactura.getSelectedRow();

        if (filaSeleccionada == -1) {
            // Si no hay fila seleccionada, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila de la tabla para generar el comprobante.");
        } else {
            // Crear instancia de COMPROBANTE
            COMPROBANTE mCOMPROBANTE = new COMPROBANTE();
            // Mostrar el JFrame Comprobante
            mCOMPROBANTE.setVisible(true);
            mCOMPROBANTE.setLocationRelativeTo(null);
            this.dispose(); // Cerrar la ventana actual si es necesario
            // Recopilar datos de la fila seleccionada
            StringBuilder sb = new StringBuilder();

            sb.append("Factura N°: ").append(TablaFactura.getValueAt(filaSeleccionada, 0)).append("\n");
            sb.append("Nombre Cliente: ").append(TablaFactura.getValueAt(filaSeleccionada, 2)).append("\n");
            sb.append("Fecha Reservada: ").append(TablaFactura.getValueAt(filaSeleccionada, 3)).append("\n");
            sb.append("Precio Total: ").append(TablaFactura.getValueAt(filaSeleccionada, 4)).append("\n");
            sb.append("------------------------------\n");
            // Pasar los datos al TextArea del JFrame Comprobante
            mCOMPROBANTE.getTextAreaComprobante().setText(sb.toString());
        }
    }//GEN-LAST:event_btnGenerarComprobanteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MENU_PRICIPAL mMENU_PRICIPAL = new MENU_PRICIPAL();
        mMENU_PRICIPAL.setVisible(true);
        mMENU_PRICIPAL.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        String idfactura = txtIDFactura.getText();
        String idcliente = txtIdCliente.getText();

    // Verifica ID de factura  
    if (idFacturas.contains(idfactura)) {  
        JOptionPane.showMessageDialog(this, "Este ID de factura ya existe.");  
        return;  
    }  

    // Verifica ID de cliente  
    if (idClientes.contains(idcliente)) {  
        JOptionPane.showMessageDialog(this, "Este ID de cliente ya existe.");  
        return;  
    }

    if (idfactura.isEmpty() || idcliente.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
    } else {
        // Busca el nombre del cliente y la fecha de la reserva desde la base de datos
        String[] clienteData = buscarClientePorIdCliente(idcliente);
        if (clienteData != null) {
            String nombreCliente = clienteData[0];
            String fechaReservada = obtenerFechaReservaPorIdCliente(idcliente); // Recuperamos la fecha de la reserva desde la base de datos
            if (fechaReservada != null) {
                // Buscar el total del precio del cliente en la tabla Ingreso_Pedidos
                double precioTotal = obtenerPrecioTotalPorCliente(idcliente);

                // Agrega los datos a la tabla, incluyendo el nombre, la fecha y el precio total
                modelo2.addRow(new Object[]{idfactura, idcliente, nombreCliente, fechaReservada, precioTotal});
                
                try {
                    // Obtener la conexión a la base de datos
                    Connection con = Conexion.getInstance().getConnection();

                    // Consulta SQL para insertar la nueva factura
                    String sql = "INSERT INTO factura (id_factura, id_cliente, nombre, fecha_reservada, precio_total) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement(sql);

                    // Asignar los parámetros a la consulta SQL
                    pst.setString(1, idfactura);
                    pst.setString(2, idcliente);
                    pst.setString(3, nombreCliente);
                    pst.setString(4, fechaReservada);
                    pst.setDouble(5, precioTotal);

                    // Ejecutar la consulta
                    int filasAfectadas = pst.executeUpdate();

                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(this, "Factura guardada con éxito en la base de datos.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al guardar la factura en la base de datos.");
                    }

                    pst.close(); // Cerrar el PreparedStatement
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al guardar la factura: " + e.getMessage());
                    e.printStackTrace();
                }

                // Aquí se guardaría la nueva factura en las listas internas
                idFacturas.add(idfactura);  
                idClientes.add(idcliente);
                ordenarTablaPorIDFactura();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró una fecha de reserva para este cliente.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un cliente con ese ID.");
        }
    }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (validarIDFactura(txtIDFactura.getText().trim()) && validarIDCliente(txtIdCliente.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Factura registrada con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "Debe insertar datos correctos");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public static boolean validarIDFactura(String datos) {
        return datos.matches("^\\d{1,6}$");
    }

    public static boolean validarIDCliente(String datos) {
        return datos.matches("^\\d{1,6}$");
    }


    private void btnNuevoComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoComprobanteActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoComprobanteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Seleccionamos la fila que se quiera eliminar
    int filaSeleccionada = TablaFactura.getSelectedRow();

    if (filaSeleccionada >= 0) {
        // Obtener el ID de la factura (por ejemplo, en la primera columna)
        String idFactura = modelo2.getValueAt(filaSeleccionada, 0).toString();

        // Confirmación para eliminar el registro
        int confirmacion = JOptionPane.showConfirmDialog(this, 
            "¿Estás seguro de que deseas eliminar esta factura?", 
            "Confirmación", 
            JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                // Conexión a la base de datos
                Connection con = Conexion.getInstance().getConnection();
                // Consulta SQL para eliminar el registro de la base de datos
                String sql = "DELETE FROM factura WHERE ID_FACTURA = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, idFactura); // Asignamos el ID de la factura

                // Ejecutar la consulta
                int filasAfectadas = pst.executeUpdate();
                
                if (filasAfectadas > 0) {
                    // Eliminar la fila de la tabla en la interfaz gráfica
                    modelo2.removeRow(filaSeleccionada);
                    JOptionPane.showMessageDialog(this, "Registro eliminado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro.");
                }

                // Cerrar el PreparedStatement
                pst.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el registro en la base de datos: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para eliminar.");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        String Idcliente = txtIdCliente.getText();
        String[] clienteData = buscarClientePorIdCliente(Idcliente);

        if (clienteData != null) {
            // Procesar la información del cliente
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un cliente con ese ID.");
        }
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(255, 153, 153));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(Color.gray);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnMostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseEntered
        btnMostrar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnMostrarMouseEntered

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnGenerarComprobanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarComprobanteMouseEntered
        btnGenerarComprobante.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnGenerarComprobanteMouseEntered

    private void btnNuevoComprobanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoComprobanteMouseEntered
        btnNuevoComprobante.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnNuevoComprobanteMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(255, 169, 40));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnMostrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseExited
        btnMostrar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnMostrarMouseExited

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnGenerarComprobanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarComprobanteMouseExited
        btnGenerarComprobante.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnGenerarComprobanteMouseExited

    private void btnNuevoComprobanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoComprobanteMouseExited
        btnNuevoComprobante.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnNuevoComprobanteMouseExited

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void txtIDFacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDFacturaMousePressed
        if (txtIDFactura.getText().equals("ID FACTURA")) {
            txtIDFactura.setText("");
            txtIDFactura.setForeground(Color.black);
        }
        if (String.valueOf(txtIdCliente.getText()).isEmpty()) {
            txtIdCliente.setText("ID CLIENTE");
            txtIdCliente.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtIDFacturaMousePressed

    private void txtIDFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDFacturaActionPerformed

    private void txtIdClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdClienteMousePressed
        if (txtIdCliente.getText().equals("ID CLIENTE")) {
            txtIdCliente.setText("");
            txtIdCliente.setForeground(Color.black);
        }
        if (String.valueOf(txtIDFactura.getText()).isEmpty()) {
            txtIDFactura.setText("ID FACTURA");
            txtIDFactura.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtIdClienteMousePressed
    private String[] buscarClientePorIdCliente(String idCliente) {
    String[] clienteInfo = null;
    try {
        // Obtener la conexión a la base de datos
        Connection con = Conexion.getInstance().getConnection();
        
        // Consulta SQL para buscar el cliente por su ID
        String sql = "SELECT nombre FROM registro_clientes WHERE id = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, idCliente); // Asignar el parámetro del ID del cliente

        // Ejecutar la consulta
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            // Recuperar el nombre del cliente
            clienteInfo = new String[]{rs.getString("nombre")};
        }
        
        rs.close(); // Cerrar el ResultSet
        pst.close(); // Cerrar el PreparedStatement
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar el cliente: " + e.getMessage());
        e.printStackTrace();
    }
    
    return clienteInfo; // Retorna los datos del cliente o null si no se encontró
}

    private String obtenerFechaReservaPorIdCliente(String idCliente) {
    String fechaReserva = null;
    try {
        // Obtener la conexión a la base de datos
        Connection con = Conexion.getInstance().getConnection();
        
        // Consulta SQL para obtener la fecha de reserva del cliente
        String sql = "SELECT fecha FROM reservaciones WHERE id_cliente = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, idCliente); // Asignar el parámetro del ID del cliente

        // Ejecutar la consulta
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            // Recuperar la fecha de la reserva
            fechaReserva = rs.getString("fecha");
        }
        
        rs.close(); // Cerrar el ResultSet
        pst.close(); // Cerrar el PreparedStatement
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener la fecha de la reserva: " + e.getMessage());
        e.printStackTrace();
    }
    
    return fechaReserva; // Retorna la fecha de la reserva o null si no se encontró
}
    
    private double obtenerPrecioTotalPorCliente(String idCliente) {
    double precioTotal = 0.0;

    try {
        // Obtener la conexión a la base de datos
        Connection con = Conexion.getInstance().getConnection();
        
        // Consulta SQL para obtener el total del precio de los pedidos por cliente
        String sql = "SELECT SUM(total) AS total FROM ingreso_pedidos WHERE idcliente = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, idCliente); // Asignar el parámetro del ID del cliente

        // Ejecutar la consulta
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            // Recuperar el total de precio sumado de los pedidos del cliente
            precioTotal = rs.getDouble("total");
        }
        
        rs.close(); // Cerrar el ResultSet
        pst.close(); // Cerrar el PreparedStatement
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el precio total del cliente: " + e.getMessage());
        e.printStackTrace();
    }

    return precioTotal; // Retorna el precio total o 0 si no se encuentra el cliente
}

    void ConsultarFactura() {
        String sql = "SELECT * FROM factura";
    try {
        conet = Conexion.getInstance().getConnection();
        st = conet.createStatement();
        rs = st.executeQuery(sql);

        // Crear un arreglo para almacenar los datos
        Object[] factura = new Object[5]; // Ahora hay 7 columnas

        while (rs.next()) {
            factura[0] = rs.getInt("ID_FACTURA");
            factura[1] = rs.getInt("ID_CLIENTE");
            factura[2] = rs.getString("NOMBRE");
            factura[3] = rs.getString("FECHA_RESERVADA");
            factura[4] = rs.getInt("PRECIO_TOTAL");
            modelo2.addRow(factura);
        }

        TablaFactura.setModel(modelo2);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al consultar datos: " + e.getMessage());
    }
    }

    private void limpiarCampos() {
        txtIDFactura.setText("");
        txtIdCliente.setText("");
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
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FACTURA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FACTURA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaFactura;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarComprobante;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevoComprobante;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtIDFactura;
    private javax.swing.JTextField txtIdCliente;
    // End of variables declaration//GEN-END:variables
}
