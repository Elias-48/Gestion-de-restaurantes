package Clases;

/**
 *
 * @author ELIAS RIVERA ULLOA
 */
import java.util.ArrayList;

public class Cliente extends Persona {
    private int s_idCliente;
    private ArrayList<Pedido> s_historialPedidos;
    private String s_correo;

    public Cliente(String s_nombre, String s_direccion, String s_telefono, int s_idCliente, String s_correo) {
        super(s_nombre, s_direccion, s_telefono);
        this.s_idCliente = s_idCliente;
        this.s_historialPedidos = new ArrayList<>();
        this.s_correo = s_correo;
    }

    public int getIdCliente() {
        return s_idCliente;
    }

    public void setIdCliente(int s_idCliente) {
        this.s_idCliente = s_idCliente;
    }
    
        public String getCorreo() {
        return s_correo;
    }

    public void setCorreo(String s_correo) {
        this.s_correo = s_correo;
    }

    public ArrayList<Pedido> getHistorialPedidos() {
        return s_historialPedidos;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        Cliente otro = (Cliente) obj;
        return this.s_idCliente == otro.s_idCliente || this.s_correo.equals(otro.s_correo) || this.getTelefono().equals(otro.getTelefono());
    }

    @Override
    public int hashCode() {
        return this.s_idCliente + this.s_correo.hashCode() + this.getTelefono().hashCode();
    }
}

 