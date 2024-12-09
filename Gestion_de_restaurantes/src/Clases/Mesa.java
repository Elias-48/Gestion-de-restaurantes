
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Mesa {
    private int s_idMesa;
    private int s_capacidad;
    private String s_ubicacion;

    public Mesa(int s_idMesa, int s_capacidad, String s_ubicacion) {
        this.s_idMesa = s_idMesa;
        this.s_capacidad = s_capacidad;
        this.s_ubicacion = s_ubicacion;
    }

    public int getIdMesa() {
        return s_idMesa;
    }

    public void setIdMesa(int s_idMesa) {
        this.s_idMesa = s_idMesa;
    }

    public int getCapacidad() {
        return s_capacidad;
    }

    public void setCapacidad(int s_capacidad) {
        this.s_capacidad = s_capacidad;
    }

    public String getUbicacion() {
        return s_ubicacion;
    }

    public void setUbicacion(String s_ubicacion) {
        this.s_ubicacion = s_ubicacion;
    }

    public boolean verificarDisponibilidad() {
        return true;
    }
}
