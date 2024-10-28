package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.ArrayList;

public class Cliente extends Persona {
    private int idCliente;
    private ArrayList<Pedido> historialPedidos;

    public Cliente(String nombre, String direccion, String telefono, int idCliente) {
        super(nombre, direccion, telefono);
        this.idCliente = idCliente;
        this.historialPedidos = new ArrayList<>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Pedido> getHistorialPedidos() {
        return historialPedidos;
    }
}

