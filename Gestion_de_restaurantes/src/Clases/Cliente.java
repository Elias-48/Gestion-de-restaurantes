package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.ArrayList;

public class Cliente extends Persona {
    private int idCliente;
    private ArrayList<Pedido> historialPedidos;
    private String correo;

    public Cliente(String nombre, String direccion, String telefono, int idCliente, String correo) {
        super(nombre, direccion, telefono);
        this.idCliente = idCliente;
        this.historialPedidos = new ArrayList<>();
        this.correo = correo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
        public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Pedido> getHistorialPedidos() {
        return historialPedidos;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        Cliente otro = (Cliente) obj;
        return this.idCliente == otro.idCliente || this.correo.equals(otro.correo) || this.getTelefono().equals(otro.getTelefono());
    }

    @Override
    public int hashCode() {
        return this.idCliente + this.correo.hashCode() + this.getTelefono().hashCode();
    }
}

 