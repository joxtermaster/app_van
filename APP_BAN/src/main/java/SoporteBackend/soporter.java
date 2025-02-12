package SoporteBackend;

import SoporteFromder.cconecion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.sql.Timestamp;


public class soporter {

    private String usuario;
    private String clave;
    private String dirrecion;

    public soporter(String usuario, String clave, String dirrecion) {
        this.usuario = usuario;
        this.clave = clave;
        this.dirrecion = dirrecion;
    }
    
    public soporter(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public String getDirrecion() {
        return dirrecion;
    }
    
    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }
    
    public boolean comprueba() throws SQLException{    
        
    cconecion c =  new cconecion();
    
    String [] datos = new String [2];
    Statement state;
    
    
    
    state = c.establecer().createStatement();
    ResultSet rs = state.executeQuery("select * from usuarios;");
    
    
    while(rs.next()){
        
    datos [0] = rs.getString(1);
    datos [1] = rs.getString(2);
    
    if(this.getUsuario().equals(datos[0]) && this.getClave().equals(datos[1])){
        return true;
    
    }
    
    }
    return false;
    }
    
    public void registrar(){
        
     String consulta = "insert into registros (usuarios,clave,gamil_o_telefono) values (?,?,?);";
        
    try{

    cconecion cone = new cconecion();
    
    CallableStatement cs = cone.establecer().prepareCall(consulta);
    
    cs.setString(1, this.usuario);
    cs.setString(2, this.clave);
    cs.setString(3, this.dirrecion);

    cs.execute();
    
    JOptionPane.showMessageDialog(null, "registro exitoso");
    
    } catch(Exception e){
    
    JOptionPane.showMessageDialog(null, "Error no se pudo registrar los datos por :"+e);
    
    }
   
    }
    
    public ArrayList [] Chofer_PLaca(){
        
    ArrayList<String> chofer =  new ArrayList<>();
    ArrayList<String> placa =  new ArrayList<>();
    ArrayList [] Info = new ArrayList [2];
    
    cconecion c = new cconecion();
    Statement state;
    
    try{
    
    state = c.establecer().createStatement();
    ResultSet rs = state.executeQuery("select usuario,placa from choferes;");
    
    while(rs.next()){
    
     chofer.add(rs.getString(1));
     placa.add(rs.getString(2));
        
    }
    
    Info[0]=chofer;
    Info[1]=placa;
      
 
    }catch(Exception e){
    
    JOptionPane.showMessageDialog(null, "Error:"+e);
    
    }
    
    return Info;
    
    }
    
    public ArrayList []  ruta_CR(){
        
    ArrayList<String> CR =  new ArrayList<>();
    ArrayList<String> ruta =  new ArrayList<>();
    ArrayList [] Info = new ArrayList [2];
        
    cconecion c = new cconecion();
    Statement state;
    
    try{
    
    state = c.establecer().createStatement();
    ResultSet rs = state.executeQuery("select CR,Rutas from rutas;");
    
    while(rs.next()){
    
     CR.add(rs.getString(1));
     ruta.add(rs.getString(2));
        
    }
    
    Info[0]=CR;
    Info[1]=ruta;
      
 
    }catch(Exception e){
    
    JOptionPane.showMessageDialog(null, "Error:"+e);
    
    }
    
    return Info;
    
    }
    
    public void  Creat_viajes(String Chofer,int Ruta,int Pasajeros, String TiempoDinal){
        
        cconecion conexion = new cconecion();
        Statement state;
        
    try{
        
    CallableStatement cs = conexion.establecer().prepareCall("insert into viajes (chofer,reservador,pasajeros,ruta,inicio,final) values (?,?,?,?,?,?);");
    
    cs.setString(1, Chofer);
    cs.setString(2,getUsuario());
    cs.setInt(3,Pasajeros);
    cs.setInt(4,Ruta);
    cs.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
    cs.setString(6,TiempoDinal);
    
    cs.execute();
    
    }catch(Exception e){
    
    JOptionPane.showMessageDialog(null, "Error Al registrando la reserva :"+e);
    
    }
        
        
    }

}
    
