/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDeDiseño;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Henry
 */
public class ClienteAdapter {
    private final DefaultTableModel modelo;

    // Constructor que recibe el modelo de la tabla
    public ClienteAdapter(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    // Método para agregar un cliente
    public void addCliente(String id, String nombre, String gmail, String direccion, String telefono) {
        modelo.addRow(new Object[]{id, nombre, gmail, direccion, telefono});
    }

    // Método para eliminar un cliente
    public void removeCliente(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < modelo.getRowCount()) {
            modelo.removeRow(rowIndex);
        } else {
            throw new IndexOutOfBoundsException("Índice de fila inválido");
        }
    }

    // Método para actualizar un cliente existente
    public void updateCliente(int rowIndex, String id, String nombre, String gmail, String direccion, String telefono) {
        if (rowIndex >= 0 && rowIndex < modelo.getRowCount()) {
            modelo.setValueAt(id, rowIndex, 0);
            modelo.setValueAt(nombre, rowIndex, 1);
            modelo.setValueAt(gmail, rowIndex, 2);
            modelo.setValueAt(direccion, rowIndex, 3);
            modelo.setValueAt(telefono, rowIndex, 4);
        } else {
            throw new IndexOutOfBoundsException("Índice de fila inválido");
        }
    }

    // Método para obtener el número de filas
    public int getRowCount() {
        return modelo.getRowCount();
    }

    // Método para obtener el valor de una celda específica
    public Object getValueAt(int rowIndex, int columnIndex) {
        return modelo.getValueAt(rowIndex, columnIndex);
    }
}
