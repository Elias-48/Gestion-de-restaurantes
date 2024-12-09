
package Clases;
/**
 *
 * @author JUAN CARLOS HENRY
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
    // Parámetros de conexión
    private final String url = "jdbc:mysql://localhost:3306/restaurante?useSSL=false&serverTimezone=UTC";
    private final String usuario = "root";
    private final String contraseña = "";
    private Connection con;

    // Instancia única de la clase Conexion (Singleton)
    private static Singleton instancia;

    // Constructor privado para evitar la creación directa de instancias
    private Singleton() {}

    // Método para obtener la instancia de Conexion
    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // Obtener la conexión a la base de datos
    public Connection getConnection() {
        try {
            // Cargar el controlador (opcional para versiones modernas)
            Class.forName("com.mysql.cj.jdbc.Driver");

            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(url, usuario, contraseña);
                System.out.println("Conexion establecida.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontro el controlador: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        return con;
    }

    // Método para cerrar la conexión (opcional)
    public void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Conexion cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
        }
    }
}