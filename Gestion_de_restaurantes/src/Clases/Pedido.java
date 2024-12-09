
package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int s_idPedido;
    private Date s_fechaPedido;
    private ArrayList<Plato> s_platos;

    public Pedido(int s_idPedido, Date s_fechaPedido) {
        this.s_idPedido = s_idPedido;
        this.s_fechaPedido = s_fechaPedido;
        this.s_platos = new ArrayList<>();
    }

    public int getIdPedido() {
        return s_idPedido;
    }

    public void setIdPedido(int s_idPedido) {
        this.s_idPedido = s_idPedido;
    }

    public Date getFechaPedido() {
        return s_fechaPedido;
    }

    public void setFechaPedido(Date s_fechaPedido) {
        this.s_fechaPedido = s_fechaPedido;
    }

    public ArrayList<Plato> getPlatos() {
        return s_platos;
    }

    public void agregarPlato(Plato s_plato) {
        s_platos.add(s_plato);
    }

    public void eliminarPlato(Plato s_plato) {
        s_platos.remove(s_plato);
    }

    public double calcularTotal() {
        double total = 0;
        for (Plato plato : s_platos) {
            total += plato.getPrecio();
        }
        return total;
    }
}

