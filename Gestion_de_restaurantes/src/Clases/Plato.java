
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.ArrayList;

public class Plato {
    private int s_idPlato;
    private String s_nombre;
    private ArrayList<Ingrediente> s_ingredientes;
    private double s_precio;

    public Plato(int s_idPlato, String s_nombre, double s_precio) {
        this.s_idPlato = s_idPlato;
        this.s_nombre = s_nombre;
        this.s_ingredientes = new ArrayList<>();
        this.s_precio = s_precio;
    }

    public int getIdPlato() {
        return s_idPlato;
    }

    public void setIdPlato(int s_idPlato) {
        this.s_idPlato = s_idPlato;
    }

    public String getNombre() {
        return s_nombre;
    }

    public void setNombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    public double getPrecio() {
        return s_precio;
    }

    public void setPrecio(double s_precio) {
        this.s_precio = s_precio;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return s_ingredientes;
    }

    public void mostrarInformacion() {
    }

    public boolean verificarDisponibilidad() {
        for (Ingrediente ingrediente : s_ingredientes) {
            if (!ingrediente.verificarStock()) {
                return false;
            }
        }
        return true;
    }
}
    
