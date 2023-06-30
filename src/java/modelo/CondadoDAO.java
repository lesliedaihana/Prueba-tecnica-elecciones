
package modelo;
import controlador.Conexionn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CondadoDAO {
    
    Conexionn con=new Conexionn();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Condado cond;
    
      public ArrayList<Condado> consultageneralcondado(){
     ArrayList<Condado> lista=new ArrayList<>();
        try {
            ps=cnn.prepareStatement("SELECT*FROM condado");
            rs=ps.executeQuery();
            while(rs.next()){
                
              cond=new Condado(rs.getString(1),  rs.getString(2),  rs.getString(3),  rs.getString(4),  rs.getString(5));
            
              lista.add(cond);
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta"+ex);
        }
        return lista;
    }
    
}
