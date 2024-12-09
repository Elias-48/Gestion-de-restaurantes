package Clases;
/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Persona {

    protected String s_nombre;
    protected String s_direccion;
    protected String s_telefono;

    public Persona(String s_nombre, String s_direccion, String s_telefono) {
        this.s_nombre = s_nombre;
        this.s_direccion = s_direccion;
        this.s_telefono = s_telefono;
    }

    public String getNombre() {
        return s_nombre;
    }

    public void setNombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    public String getDireccion() {
        return s_direccion;
    }

    public void setDireccion(String s_direccion) {
        this.s_direccion = s_direccion;
    }

    public String getTelefono() {
        return s_telefono;
    }

    public void setTelefono(String s_telefono) {
        this.s_telefono = s_telefono;
    }
}
