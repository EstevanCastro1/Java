package configuracion;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexion {
    private String usuario="root";
    private String clave="";
    private String url="jdbc:mysql://localhost:3306/universidad";
    Connection conectar=null;
    
    public Connection conectar(){
        try{
            //obtiene el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                //obtiene la conexion
                conectar=DriverManager.getConnection(url,usuario,clave);
                if(conectar!=null){
                    JOptionPane.showMessageDialog(null, "Conexión éxitosa");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQLException"+ex.getMessage());
            }
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "error en ClassNotFoundException"+e.getMessage());
        }
        return conectar;
    }
}