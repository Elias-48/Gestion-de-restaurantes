package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.Date;

public class Comprobante implements Transaccion {

    private int idFactura;
    private double total;
    private Date fechaFactura;

    public Comprobante(int idFactura, double total, Date fechaFactura) {
        this.idFactura = idFactura;
        this.total = total;
        this.fechaFactura = fechaFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    @Override
    public void procesar() {
    }

    public void generarFactura() {
    }

    public void mostrarFactura() {
    }
}
