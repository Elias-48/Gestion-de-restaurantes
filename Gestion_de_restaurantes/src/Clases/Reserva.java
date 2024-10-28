package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.Date;
public class Reserva {
    private int idReserva;
    private Date fechaReserva;

    public Reserva(int idReserva, Date fechaReserva) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}

