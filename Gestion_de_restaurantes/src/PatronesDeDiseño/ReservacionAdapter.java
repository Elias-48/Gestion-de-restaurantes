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
public class ReservacionAdapter {
    private final DefaultTableModel modelo;

    // Constructor que recibe el modelo de la tabla
    public ReservacionAdapter(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    // Método para agregar una reservación (adaptando la lógica al modelo actual)
    public void addReservacion(String idCliente, String mesa, String asientos, String fecha, String horaInicio, String horaFin) {
        modelo.addRow(new Object[]{idCliente, mesa, asientos, fecha, horaInicio, horaFin});
    }

    // Método para eliminar una reservación
    public void removeReservacion(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < modelo.getRowCount()) {
            modelo.removeRow(rowIndex);
        } else {
            throw new IndexOutOfBoundsException("Índice de fila inválido");
        }
    }

    // Método para actualizar una reservación existente
    public void updateReservacion(int rowIndex, String idCliente, String mesa, String asientos, String fecha, String horaInicio, String horaFin) {
        if (rowIndex >= 0 && rowIndex < modelo.getRowCount()) {
            modelo.setValueAt(idCliente, rowIndex, 0);
            modelo.setValueAt(mesa, rowIndex, 1);
            modelo.setValueAt(asientos, rowIndex, 2);
            modelo.setValueAt(fecha, rowIndex, 3);
            modelo.setValueAt(horaInicio, rowIndex, 4);
            modelo.setValueAt(horaFin, rowIndex, 5);
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
