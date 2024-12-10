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
public class PedidosAdapter {
    private DefaultTableModel modelo;

    public PedidosAdapter(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    // Método para agregar un pedido al modelo
    public void agregarPedido(String idPedido, String idCliente, String nombrePlato, String precioUni, String cantidad, String total, String detalle) {
        modelo.addRow(new Object[]{idPedido, idCliente, nombrePlato, precioUni, cantidad, total, detalle});
    }

    // Método para editar un pedido
    public void editarPedido(int fila, String idPedido, String idCliente, String nombrePlato, String precioUni, String cantidad, String total, String detalle) {
        modelo.setValueAt(idPedido, fila, 0);
        modelo.setValueAt(idCliente, fila, 1);
        modelo.setValueAt(nombrePlato, fila, 2);
        modelo.setValueAt(precioUni, fila, 3);
        modelo.setValueAt(cantidad, fila, 4);
        modelo.setValueAt(total, fila, 5);
        modelo.setValueAt(detalle, fila, 6);
    }

    // Método para eliminar un pedido del modelo
    public void eliminarPedido(int fila) {
        modelo.removeRow(fila);
    }
}
