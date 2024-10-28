
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.ArrayList;

public class Plato {
    private int idPlato;
    private String nombre;
    private ArrayList<Ingrediente> ingredientes;
    private double precio;

    public Plato(int idPlato, String nombre, double precio) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
        this.precio = precio;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void mostrarInformacion() {
    }

    public boolean verificarDisponibilidad() {
        for (Ingrediente ingrediente : ingredientes) {
            if (!ingrediente.verificarStock()) {
                return false;
            }
        }
        return true;
    }
}
    
