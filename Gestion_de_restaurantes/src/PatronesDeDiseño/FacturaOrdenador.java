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
public class FacturaOrdenador {
    private FacturaOrdenamientoStrategy strategy;

    public FacturaOrdenador(FacturaOrdenamientoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FacturaOrdenamientoStrategy strategy) {
        this.strategy = strategy;
    }

    public void ordenar(DefaultTableModel model) {
        if (strategy != null) {
            strategy.ordenar(model);
        } else {
            throw new IllegalStateException("No se ha definido una estrategia de ordenamiento.");
        }
    }
}
