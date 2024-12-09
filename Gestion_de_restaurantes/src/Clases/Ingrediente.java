
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Ingrediente {
    private int s_idIngrediente;
    private String s_nombre;
    private double s_stock;
    private String s_unidadMedida;

    public Ingrediente(int s_idIngrediente, String s_nombre, double s_stock, String s_unidadMedida) {
        this.s_idIngrediente = s_idIngrediente;
        this.s_nombre = s_nombre;
        this.s_stock = s_stock;
        this.s_unidadMedida = s_unidadMedida;
    }

    public int getIdIngrediente() {
        return s_idIngrediente;
    }

    public void setIdIngrediente(int s_idIngrediente) {
        this.s_idIngrediente = s_idIngrediente;
    }

    public String getNombre() {
        return s_nombre;
    }

    public void setNombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    public double getStock() {
        return s_stock;
    }

    public void setStock(double s_stock) {
        this.s_stock = s_stock;
    }

    public String getUnidadMedida() {
        return s_unidadMedida;
    }

    public void setUnidadMedida(String s_unidadMedida) {
        this.s_unidadMedida = s_unidadMedida;
    }

    public void descontarCantidad(double s_cantidad) {
        if (s_cantidad <= s_stock) {
            s_stock -= s_cantidad;
        }
    }

    public boolean verificarStock() {
        return s_stock > 0;
    }
}

