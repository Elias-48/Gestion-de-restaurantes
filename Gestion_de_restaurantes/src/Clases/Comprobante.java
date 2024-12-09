package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.Date;

public class Comprobante implements Transaccion {

    private int s_idFactura;
    private double s_total;
    private Date s_fechaFactura;

    public Comprobante(int s_idFactura, double s_total, Date s_fechaFactura) {
        this.s_idFactura = s_idFactura;
        this.s_total = s_total;
        this.s_fechaFactura = s_fechaFactura;
    }

    public int getIdFactura() {
        return s_idFactura;
    }

    public void setIdFactura(int s_idFactura) {
        this.s_idFactura = s_idFactura;
    }

    public double getTotal() {
        return s_total;
    }

    public void setTotal(double s_total) {
        this.s_total = s_total;
    }

    public Date getFechaFactura() {
        return s_fechaFactura;
    }

    public void setFechaFactura(Date s_fechaFactura) {
        this.s_fechaFactura = s_fechaFactura;
    }

    @Override
    public void procesar() {
    }

    public void generarFactura() {
    }

    public void mostrarFactura() {
    }
}
