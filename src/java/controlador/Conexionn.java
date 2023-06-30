package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexionn {

    Connection cnn;

    public Connection conexionbd() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
      //      System.err.println("Error en drives" + ex);
        }
        try {
            //JOptionPane.showMessageDialog(null, "Conexion ok");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/dbelecciones", "root", "1234");
            //JOptionPane.showMessageDialog(null, "Conexion ok");
        } catch (SQLException ex) {
            System.out.println("Error en url" + ex);
           JOptionPane.showMessageDialog(null, "Error en conexion" + ex);
        }
        return cnn;
    }

    public static void main(String[] args) {
        Conexionn conexion = new Conexionn();
        Connection cnn = conexion.conexionbd();
        
        // Realizar otras acciones o invocar otros métodos
        // ...

        // Cerrar la conexión si es necesario
        // cnn.close();
    }
}
