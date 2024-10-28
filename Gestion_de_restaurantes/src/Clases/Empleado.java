
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Empleado extends Persona {
    private int idEmpleado;
    private String cargo;

    public Empleado(String nombre, String direccion, String telefono, int idEmpleado, String cargo) {
        super(nombre, direccion, telefono);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

