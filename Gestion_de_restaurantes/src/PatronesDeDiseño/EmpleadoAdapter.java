/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDeDiseño;

import javax.swing.table.DefaultTableModel;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author Henry
 */
public class EmpleadoAdapter {
    private final DefaultTableModel modelo;
    private final HashSet<String> idsUnicos;
    private final HashSet<String> correosUnicos;
    private final HashSet<String> telefonosUnicos;

    public EmpleadoAdapter(DefaultTableModel modelo) {
        this.modelo = modelo;
        this.idsUnicos = new HashSet<>();
        this.correosUnicos = new HashSet<>();
        this.telefonosUnicos = new HashSet<>();
    }

    public void agregarEmpleado(String id, String cargo, String nombre, String correo, String direccion, String telefono) {
        if (idsUnicos.contains(id)) {
            throw new IllegalArgumentException("El ID ya está registrado.");
        }
        if (correosUnicos.contains(correo)) {
            throw new IllegalArgumentException("El correo ya está registrado.");
        }
        if (telefonosUnicos.contains(telefono)) {
            throw new IllegalArgumentException("El teléfono ya está registrado.");
        }

        modelo.addRow(new Object[]{id, cargo, nombre, correo, direccion, telefono});
        idsUnicos.add(id);
        correosUnicos.add(correo);
        telefonosUnicos.add(telefono);
        ordenarPorID();
    }

    public void editarEmpleado(int rowIndex, String id, String cargo, String nombre, String correo, String direccion, String telefono) {
        if (rowIndex < 0 || rowIndex >= modelo.getRowCount()) {
            throw new IndexOutOfBoundsException("Índice de fila inválido.");
        }

        // Actualizamos los valores en el HashSet si se modificaron
        String idAntiguo = modelo.getValueAt(rowIndex, 0).toString();
        String correoAntiguo = modelo.getValueAt(rowIndex, 3).toString();
        String telefonoAntiguo = modelo.getValueAt(rowIndex, 5).toString();

        if (!id.equals(idAntiguo) && idsUnicos.contains(id)) {
            throw new IllegalArgumentException("El nuevo ID ya está registrado.");
        }
        if (!correo.equals(correoAntiguo) && correosUnicos.contains(correo)) {
            throw new IllegalArgumentException("El nuevo correo ya está registrado.");
        }
        if (!telefono.equals(telefonoAntiguo) && telefonosUnicos.contains(telefono)) {
            throw new IllegalArgumentException("El nuevo teléfono ya está registrado.");
        }

        // Actualizamos los datos en la tabla
        modelo.setValueAt(id, rowIndex, 0);
        modelo.setValueAt(cargo, rowIndex, 1);
        modelo.setValueAt(nombre, rowIndex, 2);
        modelo.setValueAt(correo, rowIndex, 3);
        modelo.setValueAt(direccion, rowIndex, 4);
        modelo.setValueAt(telefono, rowIndex, 5);

        // Actualizamos los sets de datos únicos
        idsUnicos.remove(idAntiguo);
        correosUnicos.remove(correoAntiguo);
        telefonosUnicos.remove(telefonoAntiguo);

        idsUnicos.add(id);
        correosUnicos.add(correo);
        telefonosUnicos.add(telefono);

        ordenarPorID();
    }

    public void eliminarEmpleado(int rowIndex) {
        if (rowIndex < 0 || rowIndex >= modelo.getRowCount()) {
            throw new IndexOutOfBoundsException("Índice de fila inválido.");
        }

        String id = modelo.getValueAt(rowIndex, 0).toString();
        String correo = modelo.getValueAt(rowIndex, 3).toString();
        String telefono = modelo.getValueAt(rowIndex, 5).toString();

        idsUnicos.remove(id);
        correosUnicos.remove(correo);
        telefonosUnicos.remove(telefono);

        modelo.removeRow(rowIndex);
    }

    public void ordenarPorID() {
        List<Object[]> filas = new ArrayList<>();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            filas.add(new Object[]{
                modelo.getValueAt(i, 0), modelo.getValueAt(i, 1),
                modelo.getValueAt(i, 2), modelo.getValueAt(i, 3),
                modelo.getValueAt(i, 4), modelo.getValueAt(i, 5)
            });
        }

        filas.sort(Comparator.comparingInt(o -> Integer.parseInt(o[0].toString())));
        modelo.setRowCount(0); // Limpiar tabla
        for (Object[] fila : filas) {
            modelo.addRow(fila);
        }
    }
}
