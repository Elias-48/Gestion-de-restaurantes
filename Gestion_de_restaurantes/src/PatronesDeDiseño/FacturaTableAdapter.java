/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDeDiseño;

import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author Henry
 */
public class FacturaTableAdapter {
    private DefaultTableModel tableModel;
    private HashSet<String> idFacturas;
    private HashSet<String> idClientes;

    public FacturaTableAdapter() {
        this.tableModel = new DefaultTableModel();
        this.idFacturas = new HashSet<>();
        this.idClientes = new HashSet<>();
        // Configurar columnas del modelo
        this.tableModel.addColumn("ID FACTURA");
        this.tableModel.addColumn("ID CLIENTE");
        this.tableModel.addColumn("NOMBRE CLIENTE");
        this.tableModel.addColumn("FECHA RESERVADA");
        this.tableModel.addColumn("PRECIO TOTAL");
    }

    // Nuevo constructor que acepta un modelo de tabla existente
    public FacturaTableAdapter(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
        this.idFacturas = new HashSet<>();
        this.idClientes = new HashSet<>();
        // Cargar datos existentes en los conjuntos para evitar duplicados
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            this.idFacturas.add(tableModel.getValueAt(i, 0).toString());
            this.idClientes.add(tableModel.getValueAt(i, 1).toString());
        }
    }

    public DefaultTableModel getTableModel() {
        return this.tableModel;
    }

    public void addFactura(String idFactura, String idCliente, String nombreCliente, String fechaReservada, double precioTotal) {
        if (idFacturas.contains(idFactura)) {
            throw new IllegalArgumentException("El ID de factura ya existe.");
        }
        if (idClientes.contains(idCliente)) {
            throw new IllegalArgumentException("El ID de cliente ya existe.");
        }
        // Añadir los datos al modelo de la tabla
        this.tableModel.addRow(new Object[]{idFactura, idCliente, nombreCliente, fechaReservada, precioTotal});
        // Registrar IDs en los conjuntos
        this.idFacturas.add(idFactura);
        this.idClientes.add(idCliente);
    }

    public void removeFactura(int rowIndex) {
        if (rowIndex < 0 || rowIndex >= tableModel.getRowCount()) {
            throw new IndexOutOfBoundsException("Índice de fila inválido.");
        }
        // Remover datos de los conjuntos
        String idFactura = tableModel.getValueAt(rowIndex, 0).toString();
        String idCliente = tableModel.getValueAt(rowIndex, 1).toString();
        idFacturas.remove(idFactura);
        idClientes.remove(idCliente);
        // Eliminar fila del modelo
        this.tableModel.removeRow(rowIndex);
    }

    public void ordenarPorIdFactura() {
        List<Object[]> datos = new ArrayList<>();
        // Extraer los datos actuales de la tabla
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            Object[] fila = new Object[tableModel.getColumnCount()];
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                fila[j] = tableModel.getValueAt(i, j);
            }
            datos.add(fila);
        }
        // Ordenar los datos por ID de Factura
        datos.sort(Comparator.comparing(o -> o[0].toString()));
        // Limpiar el modelo y reinsertar los datos ordenados
        tableModel.setRowCount(0);
        for (Object[] fila : datos) {
            tableModel.addRow(fila);
        }
    }
}
