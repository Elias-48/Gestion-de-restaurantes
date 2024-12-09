package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.Date;
public class Reserva {
    private int s_idCliente;         
    private int s_capacidad;         
    private int s_numeroAsientos;    
    private Date s_fechaReserva;
    private String s_horaInicio;
    private String s_horaFin;

    public Reserva(int s_idCliente, int s_capacidad, int s_numeroAsientos, Date s_fechaReserva, String s_horaInicio, String s_horaFin) {
        this.s_idCliente = s_idCliente;
        this.s_capacidad = s_capacidad;
        this.s_numeroAsientos = s_numeroAsientos;
        this.s_fechaReserva = s_fechaReserva;
        this.s_horaInicio = s_horaInicio;
        this.s_horaFin = s_horaFin;
    }

    public int getIdCliente() {
        return s_idCliente;
    }

    public void setIdCliente(int s_idCliente) {
        this.s_idCliente = s_idCliente;
    }

    public int getCapacidad() {
        return s_capacidad;
    }

    public void setCapacidad(int s_capacidad) {
        this.s_capacidad = s_capacidad;
    }

    public int getNumeroAsientos() {
        return s_numeroAsientos;
    }

    public void setNumeroAsientos(int s_numeroAsientos) {
        this.s_numeroAsientos = s_numeroAsientos;
    }

    public Date getFechaReserva() {
        return s_fechaReserva;
    }

    public void setFechaReserva(Date s_fechaReserva) {
        this.s_fechaReserva = s_fechaReserva;
    }

    public String getHoraInicio() {
        return s_horaInicio;
    }

    public void setHoraInicio(String s_horaInicio) {
        this.s_horaInicio = s_horaInicio;
    }

    public String getHoraFin() {
        return s_horaFin;
    }

    public void setHoraFin(String s_horaFin) {
        this.s_horaFin = s_horaFin;
    }
}
