package modelo;
import java.sql.*;
import configuracion.Conexion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.Decano;
/**
 *
 * @author Usuario
 */
public class Modelo {
    private int cc;
    private String nom;
    private String ape;
    private String cel;
    private String buscardato;
    
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
    
    public String getBuscardato() {
        return buscardato;
    }

    public void setBuscardato(String buscardato) {
        this.buscardato = buscardato;
    }
    Conexion cx=new Conexion();
    Connection con = cx.conectar();
    public boolean insertarDato(){
        try {
            PreparedStatement in = con.prepareStatement("INSERT INTO decano VALUES (?,?,?,?)");
//los signos de interrogación son para preparar la consulta y no se pueda inyectar la consulta         
//insertar valores,
            in.setInt(1, cc);
            in.setString(2, nom);
            in.setString(3, ape);
            in.setString(4, cel);
            in.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQLException"+ex);
            return false;
        }
    }
    public int modificarDato(){
        int numFilas=0;
        try {
            PreparedStatement in = con.prepareStatement("UPDATE decano SET  nombre=?, apellido=?,celular=? WHERE cedula=?");
            in.setString(1, nom);
            in.setString(2, ape);
            in.setString(3, cel);
            in.setInt(4, cc);
            
            numFilas=in.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQLException"+ex);
         }
        return  numFilas;

    }
    public int borrarDato(int ncc){
        int resul=0;
        try {
            PreparedStatement in = con.prepareStatement("DELETE FROM decano WHERE  cedula=?");
            in.setInt(1, ncc);
            in.execute();
            resul=1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQLException"+ex);
        }
        return resul;
    }
    public ArrayList<VectorDecano> listarDato(){
        ArrayList<VectorDecano> listaDecanos = new ArrayList();
        try {
            PreparedStatement in;
            if(buscardato.equals("")){
                in = con.prepareStatement("SELECT * FROM decano ");
            }else{
                in = con.prepareStatement("SELECT * FROM decano WHERE  cedula like'%"+buscardato+"%'");
            }
            ResultSet resul=in.executeQuery();
           //para validar si trae datos        
            while(resul.next()){
               VectorDecano decanos = new VectorDecano();
                decanos.setIdcc(resul.getInt(1));
                decanos.setName(resul.getString(2));
                decanos.setLastName(resul.getString(3));
                decanos.setPhone(resul.getString(4));
                listaDecanos.add(decanos);
            }
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQLException -- "+ex);
            
        }  
        return listaDecanos;
    }
    public boolean deconectar(){
        try{
                con.close();
                JOptionPane.showMessageDialog(null, "Conexión desactivada");
                return true;
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error SQLException -- "+ex);
                return false;
         }
    }
    
}