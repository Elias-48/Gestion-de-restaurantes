
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Producto {
    private String s_nombre;
    private String s_categoria;
    private double s_precio;

    public Producto(String s_nombre, String s_categoria, double s_precio) {
        this.s_nombre = s_nombre;
        this.s_categoria = s_categoria;
        this.s_precio = s_precio;
    }

    public String getNombre() {
        return s_nombre;
    }

    public void setNombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    public String getCategoria() {
        return s_categoria;
    }

    public void setCategoria(String s_categoria) {
        this.s_categoria = s_categoria;
    }

    public double getPrecio() {
        return s_precio;
    }

    public void setPrecio(double s_precio) {
        this.s_precio = s_precio;
    }

    public void mostrarInformacion() {
    }
}

