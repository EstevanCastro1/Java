package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import vista.Decano;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo;
import modelo.VectorDecano;

//KeyListener es para escuchar los eventos de los TXT
public class Controlador implements ActionListener,KeyListener {
    VectorDecano vd = new VectorDecano();
    private Decano dec;
    private Modelo model;

    public Controlador(Decano dec, Modelo model) {
        this.dec = dec;
        this.model = model;
        this.dec.boton1.addActionListener(this);
        this.dec.botn2B.addActionListener(this);
        this.dec.boton3A.addActionListener(this);
        this.dec.botn4E.addActionListener(this);
        this.dec.btnDesconectar.addActionListener(this);
        this.dec.btnSeleccion.addActionListener(this);        
        this.dec.cedula.addKeyListener(this);
        this.dec.nombre.addKeyListener(this);
        this.dec.apellido.addKeyListener(this);
        this.dec.celular.addKeyListener(this);
        this.dec.txtBuscar.addKeyListener(this);
        this.dec.botn4E.setEnabled(false);
        this.dec.boton3A.setEnabled(false);
        
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==dec.boton1){
            model.setCc(Integer.parseInt(dec.cedula.getText()));
            model.setNom(dec.nombre.getText());
            model.setApe(dec.apellido.getText());
            model.setCel(dec.celular.getText());
            if(model.insertarDato()){
                JOptionPane.showMessageDialog(null, "Registro guardado éxitosamente");
                limpiar();
                listarTabla(dec.tblDatos);
                
            }else{
                JOptionPane.showMessageDialog(null, "error al guardar");
                limpiar();
            }
        }else if( e.getSource()==dec.btnSeleccion){
            dec.boton1.setEnabled(false);
            //captura el numero de fila a editar
           int numFilaEditar=dec.tblDatos.getSelectedRow();
            //captura el numero de filas que se seleccionara
            int numFilas=dec.tblDatos.getSelectedRowCount();
            if(numFilaEditar>=0 && numFilas==1 ){
                dec.cedula.setText(String.valueOf(dec.tblDatos.getValueAt(numFilaEditar, 0)));
                dec.cedula.setEditable(false);
                dec.botn4E.setEnabled(true);
                dec.boton3A.setEnabled(true);
                dec.nombre.setText(String.valueOf(dec.tblDatos.getValueAt(numFilaEditar, 1)));
                dec.apellido.setText(String.valueOf(dec.tblDatos.getValueAt(numFilaEditar, 2)));
                dec.celular.setText(String.valueOf(dec.tblDatos.getValueAt(numFilaEditar, 3)));
               
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione una sola fila");
            }
        }else if(e.getSource()==dec.boton3A){           
            model.setCc(Integer.parseInt(dec.cedula.getText()));
            model.setNom(dec.nombre.getText());
            model.setApe(dec.apellido.getText());
            model.setCel(dec.celular.getText());
            dec.botn4E.setEnabled(false);
            if(model.modificarDato()>0){
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                limpiar();
                listarTabla(dec.tblDatos);
            }else{
                JOptionPane.showMessageDialog(null, "Error al Actualizar");
                limpiar();
            }
        }else if(e.getSource()==dec.botn4E){
            dec.botn4E.setEnabled(false);
            
            int filaEditar=dec.tblDatos.getSelectedRow();//devuelve el numero de filas
            int numerofilasS=dec.tblDatos.getSelectedRowCount();//# de filas que va seleccionar
            //Si no se selecciona ninfuna fila filaEditar=1 y numerofilasS=0
            ArrayList<String> lDatos=new ArrayList();
            String ncc="";
            //al seleccionar filas, se recopila las cc
            if (filaEditar>=0){
                ncc=String.valueOf(dec.tblDatos.getValueAt(filaEditar, 0));
                lDatos.add(ncc);
                for (int i=0; i<numerofilasS; i++){
                    int respuestausu=JOptionPane.showConfirmDialog(null, "Seguro, que desea elimar el dato"+ncc+"?");
                    if(respuestausu==0){
                        int ncc1=Integer.parseInt(ncc);
                        model.borrarDato(ncc1);
                        limpiar();
                    }
                }
                listarTabla(dec.tblDatos);
            }else{
                JOptionPane.showMessageDialog(null, "Selecciona una fila");
            }
        }else if(e.getSource()==dec.botn2B){
            model.setBuscardato(dec.txtBuscar.getText());          
            listarTabla(dec.tblDatos);
        }else if(e.getSource()==dec.btnDesconectar){
             if(model.deconectar()){
             dec.setVisible(false);
             }
        }
    }
    public void listarTabla(JTable tablaDecano){
        DefaultTableModel modeloTabla = new DefaultTableModel();        //modeloTabla=(DefaultTableModel)tablaDecano.setModel();//para mostrar la tabla en el momento de ejecutar
        tablaDecano.setModel(modeloTabla);
        modeloTabla.addColumn("Cedula");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");        
        modeloTabla.addColumn("Celular");
        Object[] col = new Object[4];
        ArrayList<VectorDecano> listaDecanos = model.listarDato();
       for(int i=0; i<listaDecanos.size(); i++){
            col[0]=listaDecanos.get(i).getIdcc();
            col[1]=listaDecanos.get(i).getName();
            col[2]=listaDecanos.get(i).getLastName();
            col[3]=listaDecanos.get(i).getPhone();
           modeloTabla.addRow(col);
        }
        dec.tblDatos.setModel(modeloTabla);
    }
    public void limpiar(){
        dec.cedula.setEditable(true);
        dec.cedula.setText(null);
        dec.nombre.setText(null);
        dec.apellido.setText(null);
        dec.celular.setText(null);
        dec.botn4E.setEnabled(false);
        dec.boton3A.setEnabled(false);
        dec.boton1.setEnabled(true);
    }

    @Override
    //Permite realizar accioón según el evento, cuando tecleamos una tecla que no es caracter ni número
    public void keyTyped(KeyEvent e) {
        if(e.getSource()==dec.cedula){
            char c = e.getKeyChar();
            if(c<'0' || c>'9'){
                e.consume();
            }
        }
        if(e.getSource()==dec.celular){
            char c = e.getKeyChar();
            if(c<'0' || c>'9'){
                e.consume();
            }
        }
         if(e.getSource()==dec.nombre || e.getSource()==dec.apellido){
            char c = e.getKeyChar();
            if((c<'a' || c>'z') && (c<'A' || c>'Z')&& (c!=(char)KeyEvent.VK_SPACE)){
                e.consume();
            }
        }
    }

    @Override
    //Ejecuta una serie de acciones al ejecutar un evento de presionar una tecla
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    //se ejecuta el evento cuando se suelta la tecla
    public void keyReleased(KeyEvent e) {
       
    }
}