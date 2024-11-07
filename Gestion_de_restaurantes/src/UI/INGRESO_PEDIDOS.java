/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author Usuario
 */
public class INGRESO_PEDIDOS extends javax.swing.JFrame {
    DefaultTableModel modelo3=new DefaultTableModel();
    /**
     * Creates new form INGRESO_PEDIDOS
     */
    public INGRESO_PEDIDOS() {
        initComponents();
        modelo3.addColumn("ID CLIENTE");
        modelo3.addColumn("MESA");
        modelo3.addColumn("N° ASIENTOS");
        modelo3.addColumn("MENÚ");
        modelo3.addColumn("PRECIO UNI.");
        modelo3.addColumn("CANTIDAD");
        modelo3.addColumn("TOTAL");
        modelo3.addColumn("DETALLE");
        TablaIngresoDePedidos.setModel(modelo3);
        cargarPedidosDesdeCSV();
        // Agregar el evento para detectar clics en las filas
        TablaIngresoDePedidos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = TablaIngresoDePedidos.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    // Obtener los valores de la fila seleccionada y colocarlos en los campos de texto
                    txtCliente.setText(modelo3.getValueAt(filaSeleccionada, 0).toString());
                    jComboBoxNumDeMesa.setSelectedItem(modelo3.getValueAt(filaSeleccionada, 1).toString());
                    jComboBoxNumDeSillas.setSelectedItem(modelo3.getValueAt(filaSeleccionada, 2).toString());
                    txtNombreDelPlato.setText(modelo3.getValueAt(filaSeleccionada, 3).toString());
                    txtNumDePlato.setText(modelo3.getValueAt(filaSeleccionada, 5).toString());
                    TextAreaDetalleDelPlato.setText(modelo3.getValueAt(filaSeleccionada, 7).toString());
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaIngresoDePedidos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxNumDeMesa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNombreDelPlato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumDePlato = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevoPedido = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaDetalleDelPlato = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jComboBoxNumDeSillas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESO DE PEDIDOS");

        TablaIngresoDePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID CLIENTE", "MESA", "N° ASIENTOS", "MENÚ", "PRECIO UNI.", "CANTIDAD", "TOTAL", "DETALLE"
            }
        ));
        jScrollPane1.setViewportView(TablaIngresoDePedidos);

        jLabel2.setText("N° MESA:");

        jComboBoxNumDeMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIN MESA", "MESA 1", "MESA 2", "MESA 3", "MESA 4", "MESA 5", "MESA 6" }));
        jComboBoxNumDeMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNumDeMesaActionPerformed(evt);
            }
        });

        jLabel3.setText("NOMBRE DEL PLATO:");

        jLabel4.setText("N° PLATOS:");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevoPedido.setText("NUEVO PEDIDO");
        btnNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPedidoActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel5.setText("DETALLES DEL PEDIDO (OPCIONAL):");

        TextAreaDetalleDelPlato.setColumns(20);
        TextAreaDetalleDelPlato.setRows(5);
        jScrollPane2.setViewportView(TextAreaDetalleDelPlato);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel6.setText("ID CLIENTE:");

        jLabel7.setText("N° ASIENTOS");

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jComboBoxNumDeSillas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIN ASIENTOS", "1", "2", "3", "4", "5", "6", "7", "8" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevoPedido)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtNumDePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCliente)
                                            .addComponent(txtNombreDelPlato)
                                            .addComponent(jComboBoxNumDeSillas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxNumDeMesa, 0, 146, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnEditar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxNumDeMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxNumDeSillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreDelPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumDePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevoPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        JOptionPane.showMessageDialog(this, "Pedido registrado con éxito.");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MENU_PRICIPAL mMENU_PRICIPAL = new MENU_PRICIPAL();
        mMENU_PRICIPAL.setVisible(true);
        mMENU_PRICIPAL.setLocationRelativeTo(null);
                this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String idcliente = txtCliente.getText();
        String mesa = jComboBoxNumDeMesa.getSelectedItem().toString();
        String silla = jComboBoxNumDeSillas.getSelectedItem().toString();
        String nombrePlato = txtNombreDelPlato.getText();
        String cantidadplato = txtNumDePlato.getText();
        String detalle = TextAreaDetalleDelPlato.getText();

        if (idcliente.isEmpty() || mesa.equals("SIN MESA") || silla.equals("SIN MESA") || nombrePlato.isEmpty() || cantidadplato.isEmpty() || detalle.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos");
        } else {
        // Buscar el precio del plato
        String precioUni = buscarPrecioPorNombrePlato(nombrePlato);
        
        if (precioUni != null) {
            // Calcular el total (cantidad * precio unitario)
            int cantidad = Integer.parseInt(cantidadplato);
            double precio = Double.parseDouble(precioUni);
            double total = cantidad * precio;

            // Agregar la fila a la tabla (con el precio unitario y total)
            modelo3.addRow(new Object[]{idcliente, mesa, silla, nombrePlato, precioUni, cantidadplato, total, detalle});
            guardarPedidosEnCSV(); // Guardar la tabla actualizada en CSV
        } else {
            JOptionPane.showMessageDialog(this, "Plato no encontrado.");
        }
    }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = TablaIngresoDePedidos.getSelectedRow();
        if (filaSeleccionada != -1) {
            modelo3.removeRow(filaSeleccionada);
            guardarPedidosEnCSV();
        } else {
            // Mostrar mensaje de error o advertencia
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPedidoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoPedidoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int filaSeleccionada = TablaIngresoDePedidos.getSelectedRow();
    if (filaSeleccionada != -1) {
        // Obtener el nombre del plato para buscar el precio
        String nombrePlato = txtNombreDelPlato.getText();
        String precioPlato = buscarPrecioPorNombrePlato(nombrePlato);

        if (precioPlato != null) {
            // Obtener la cantidad del plato
            int cantidad = Integer.parseInt(txtNumDePlato.getText());
            double precio = Double.parseDouble(precioPlato);
            double total = cantidad * precio;

            // Actualizar los datos en la fila seleccionada
            modelo3.setValueAt(txtCliente.getText(), filaSeleccionada, 0); // Cliente
            modelo3.setValueAt(jComboBoxNumDeMesa.getSelectedItem().toString(), filaSeleccionada, 1); // Mesa
            modelo3.setValueAt(jComboBoxNumDeSillas.getSelectedItem().toString(), filaSeleccionada, 2); // Silla
            modelo3.setValueAt(nombrePlato, filaSeleccionada, 3); // Nombre del plato
            modelo3.setValueAt(precioPlato, filaSeleccionada, 4); // Precio unitario
            modelo3.setValueAt(txtNumDePlato.getText(), filaSeleccionada, 5); // Cantidad de platos
            modelo3.setValueAt(total, filaSeleccionada, 6); // Total
            modelo3.setValueAt(TextAreaDetalleDelPlato.getText(), filaSeleccionada, 7); // Detalle

            // Guardar los pedidos en el archivo CSV después de editar
            guardarPedidosEnCSV();
        } else {
            JOptionPane.showMessageDialog(this, "Plato no encontrado.");
        }
    } else {
        // Mostrar mensaje de error o advertencia
        javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una fila para editar.");
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jComboBoxNumDeMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNumDeMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNumDeMesaActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed
    
    private String buscarPrecioPorNombrePlato(String nombrePlato) {
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("Menu.csv"))) {
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            // En el CSV, la posición 1 es el nombre del plato, y el 3 es el precio del plato
            if (data[1].equalsIgnoreCase(nombrePlato)) {
                return data[3]; // Retorna el precio del plato
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null; // Retorna null si no se encontró el plato
    }
    
    private void guardarPedidosEnCSV() {
        try (PrintWriter pw = new PrintWriter(new File("Pedidos.csv"))) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < modelo3.getRowCount(); i++) {
                for (int j = 0; j < modelo3.getColumnCount(); j++) {
                    sb.append(modelo3.getValueAt(i, j).toString());
                    sb.append(",");
                }
                sb.append("\n");
            }
            pw.write(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar los datos desde un archivo CSV
    private void cargarPedidosDesdeCSV() {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("Pedidos.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                modelo3.addRow(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void limpiarCampos() {
        txtCliente.setText("");
        jComboBoxNumDeMesa.setSelectedIndex(0);
        jComboBoxNumDeSillas.setSelectedIndex(0);
        txtNombreDelPlato.setText("");
        txtNumDePlato.setText("");
        TextAreaDetalleDelPlato.setText("");
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
            java.util.logging.Logger.getLogger(INGRESO_PEDIDOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INGRESO_PEDIDOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INGRESO_PEDIDOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INGRESO_PEDIDOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INGRESO_PEDIDOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaIngresoDePedidos;
    private javax.swing.JTextArea TextAreaDetalleDelPlato;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevoPedido;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jComboBoxNumDeMesa;
    private javax.swing.JComboBox<String> jComboBoxNumDeSillas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtNombreDelPlato;
    private javax.swing.JTextField txtNumDePlato;
    // End of variables declaration//GEN-END:variables
}
