
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
public class Mesa {
    private int idMesa;
    private int capacidad;
    private String ubicacion;

    public Mesa(int idMesa, int capacidad, String ubicacion) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean verificarDisponibilidad() {
        return true;
    }
}
