
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



public class EleccionDAO {
      Conexionn con=new Conexionn();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Eleccion ele;
    
    public int  insertareleccion(Eleccion ele){
         int x=0;
        
        try {
            ps=cnn.prepareStatement("INSERT INTO eleccion VALUES(?,?,?,?,?,?,?)");
            ps.setInt(1, ele.getIdEleccion());
            ps.setInt(2, ele.getAño());
            ps.setInt(3, ele.getPartDemocrataVot());
            ps.setInt(4, ele.getPartRepublicanoVot());
            ps.setInt(5, ele.getOtrosVot());
            ps.setString(6, ele.getCodCondado());
            ps.setInt(7, ele.getIdCoordinador());
            x=ps.executeUpdate();
            
        
        
        
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar"+ex);
        }
    return x;
    }
    
    
    
    
    
    
    
    
   
    
    
    
}
