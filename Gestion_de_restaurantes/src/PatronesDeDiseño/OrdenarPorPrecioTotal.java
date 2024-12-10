/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDeDiseño;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Henry
 */
public class OrdenarPorPrecioTotal extends FacturaOrdenamientoStrategy {
    @Override
    public void ordenar(DefaultTableModel model) {
        List<Object[]> datos = new ArrayList<>();

        // Extraer los datos actuales de la tabla
        for (int i = 0; i < model.getRowCount(); i++) {
            Object[] fila = new Object[model.getColumnCount()];
            for (int j = 0; j < model.getColumnCount(); j++) {
                fila[j] = model.getValueAt(i, j);
            }
            datos.add(fila);
        }

        // Ordenar por la última columna (PRECIO_TOTAL)
        datos.sort((o1, o2) -> Double.compare(Double.parseDouble(o1[4].toString()), Double.parseDouble(o2[4].toString())));

        // Limpiar y volver a agregar los datos al modelo
        model.setRowCount(0);
        for (Object[] fila : datos) {
            model.addRow(fila);
        }
    }
}