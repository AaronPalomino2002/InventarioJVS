package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    
    Connection con;
    String bd = "bd_inventario";
    String url = "jdbc:mysql://127.0.0.1:3310/" + bd; // Actualizado para el puerto 3310
    String user = "root";
    String pass = "";
    
    public Connection conectar() {
        try {
            // Carga el driver de MySQL para la versión 5.x
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establece la conexión
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión establecida");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: No se encontró el driver de MySQL. " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return con;
    }
}
