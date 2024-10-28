
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Cantidad {
    private int idCantidad;
    private double cantidad;
    private Ingrediente ingrediente;

    public Cantidad(int idCantidad, double cantidad, Ingrediente ingrediente) {
        this.idCantidad = idCantidad;
        this.cantidad = cantidad;
        this.ingrediente = ingrediente;
    }

    public int getIdCantidad() {
        return idCantidad;
    }

    public void setIdCantidad(int idCantidad) {
        this.idCantidad = idCantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void asignarIngrediente(Ingrediente ingrediente, double cantidad) {
        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
    }

    public void modificarCantidad(double nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    public double obtenerCantidad() {
        return cantidad;
    }

    public void mostrarInformacion() {
    }
}

