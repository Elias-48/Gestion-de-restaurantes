
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Ingrediente {
    private int idIngrediente;
    private String nombre;
    private double stock;
    private String unidadMedida;

    public Ingrediente(int idIngrediente, String nombre, double stock, String unidadMedida) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.stock = stock;
        this.unidadMedida = unidadMedida;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void descontarCantidad(double cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        }
    }

    public boolean verificarStock() {
        return stock > 0;
    }
}

