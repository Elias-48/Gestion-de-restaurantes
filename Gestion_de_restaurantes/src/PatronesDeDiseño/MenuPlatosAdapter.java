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
public class MenuPlatosAdapter {
    private DefaultTableModel modelo;

    public MenuPlatosAdapter(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    // Método para agregar una fila a la tabla
    public void addRow(Object[] rowData) {
        modelo.addRow(rowData);
    }

    // Método para editar una fila de la tabla
    public void updateRow(int rowIndex, Object[] rowData) {
        if (rowIndex >= 0 && rowIndex < modelo.getRowCount()) {
            for (int i = 0; i < rowData.length; i++) {
                modelo.setValueAt(rowData[i], rowIndex, i);
            }
        }
    }

    // Método para eliminar una fila de la tabla
    public void removeRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < modelo.getRowCount()) {
            modelo.removeRow(rowIndex);
        }
    }

    // Método para obtener los datos de una fila
    public Object[] getRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < modelo.getRowCount()) {
            Object[] rowData = new Object[modelo.getColumnCount()];
            for (int i = 0; i < modelo.getColumnCount(); i++) {
                rowData[i] = modelo.getValueAt(rowIndex, i);
            }
            return rowData;
        }
        return null;
    }

    // Método para limpiar la tabla
    public void clearTable() {
        modelo.setRowCount(0);
    }
}
