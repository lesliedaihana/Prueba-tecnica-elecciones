
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


public class CoordinadorDAO {
    Conexionn con=new  Conexionn();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    
    public ArrayList<Coordinador> coordinadordao(Coordinador lo){
        JOptionPane.showMessageDialog(null, lo.getEmailCoor()+"..."+ lo.getContraCoor());
      ArrayList<Coordinador>lista=new ArrayList<>();
        try {
            ps=cnn.prepareStatement("SELECT * FROM Coordinador WHERE EmailCoor = ? AND ContraCoor = ?");
            ps.setString(1, lo.getEmailCoor());
            ps.setString(2, lo.getContraCoor());
         


            rs=ps.executeQuery();
            
            
            if(rs.next()){
                Coordinador log=new Coordinador(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5));
                lista.add(log);
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de login "+ex);
        }
    
    return lista;
    
    }
    
    
    
    
}
