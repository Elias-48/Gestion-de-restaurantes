package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.Date;
public class Reserva {
    private int idCliente;         
    private int capacidad;         
    private int numeroAsientos;    
    private Date fechaReserva;
    private String horaInicio;
    private String horaFin;

    public Reserva(int idCliente, int capacidad, int numeroAsientos, Date fechaReserva, String horaInicio, String horaFin) {
        this.idCliente = idCliente;
        this.capacidad = capacidad;
        this.numeroAsientos = numeroAsientos;
        this.fechaReserva = fechaReserva;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
}
