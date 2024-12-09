
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Cantidad {
    private int s_idCantidad;
    private double s_cantidad;
    private Ingrediente s_ingrediente;

    public Cantidad(int s_idCantidad, double s_cantidad, Ingrediente s_ingrediente) {
        this.s_idCantidad = s_idCantidad;
        this.s_cantidad = s_cantidad;
        this.s_ingrediente = s_ingrediente;
    }

    public int getIdCantidad() {
        return s_idCantidad;
    }

    public void setIdCantidad(int s_idCantidad) {
        this.s_idCantidad = s_idCantidad;
    }

    public double getCantidad() {
        return s_cantidad;
    }

    public void setCantidad(double s_cantidad) {
        this.s_cantidad = s_cantidad;
    }

    public Ingrediente getIngrediente() {
        return s_ingrediente;
    }

    public void setIngrediente(Ingrediente s_ingrediente) {
        this.s_ingrediente = s_ingrediente;
    }

    public void asignarIngrediente(Ingrediente s_ingrediente, double s_cantidad) {
        this.s_ingrediente = s_ingrediente;
        this.s_cantidad = s_cantidad;
    }

    public void modificarCantidad(double s_nuevaCantidad) {
        this.s_cantidad = s_nuevaCantidad;
    }

    public double obtenerCantidad() {
        return s_cantidad;
    }

    public void mostrarInformacion() {
    }
}

