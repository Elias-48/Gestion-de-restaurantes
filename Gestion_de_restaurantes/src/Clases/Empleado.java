
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Empleado extends Persona {
    private int s_idEmpleado;
    private String s_cargo;

    public Empleado(String s_nombre, String s_direccion, String s_telefono, int s_idEmpleado, String s_cargo) {
        super(s_nombre, s_direccion, s_telefono);
        this.s_idEmpleado = s_idEmpleado;
        this.s_cargo = s_cargo;
    }

    public int getIdEmpleado() {
        return s_idEmpleado;
    }

    public void setIdEmpleado(int s_idEmpleado) {
        this.s_idEmpleado = s_idEmpleado;
    }

    public String getCargo() {
        return s_cargo;
    }

    public void setCargo(String cargo) {
        this.s_cargo = cargo;
    }
}

