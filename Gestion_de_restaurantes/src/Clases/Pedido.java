
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int idPedido;
    private Date fechaPedido;
    private ArrayList<Plato> platos;

    public Pedido(int idPedido, Date fechaPedido) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.platos = new ArrayList<>();
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void eliminarPlato(Plato plato) {
        platos.remove(plato);
    }

    public double calcularTotal() {
        double total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio();
        }
        return total;
    }
}

