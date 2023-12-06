
package mx.itson.regalo.models;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.itson.regalo.db.MySQLConnection;
import mx.itson.regalo.entities.Hall;



public class HallModel {
    MySQLConnection mySQL = new MySQLConnection();
    
    public void insert(Hall h){
        //"+u.getNombre()+"
        String query = "INSERT INTO TheGalactics_salas (sala_id, nombre, capacidad) ";
              query+= "values ('"+h.getSala_id()+"', '"+h.getNombre()+"','"+h.getCapacidad()+"' )";
              
       mySQL.insert(query);
    
    }
    
    public void update(Hall h) {
    String query = "UPDATE TheGalactics_salas SET sala_id='" + h.getSala_id() + "', nombre='" + h.getNombre() + "', capacidad='" + h.getCapacidad() + "'";
    query += " WHERE sala_id=" + h.getSala_id();

    mySQL.update(query);
}
    
    public Hall findByID(int sala_id){
     Hall h = null;   
     String query ="SELECT * FROM TheGalactics_salas WHERE sala_id="+sala_id;
     
     ResultSet rs = mySQL.select(query);
     try {
        while(rs.next()){

                h = new Hall(
                        rs.getInt("sala_id"),
                        rs.getString("nombre"),
                        rs.getString("capacidad")
                );
        }
     } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Hay un error con la base de datos!");
     }
     
     return h;
    }

    public ArrayList<Hall> select(){ 
        ArrayList<Hall> lista = new ArrayList<Hall>(); 
        
        String query = "SELECT * FROM TheGalactics_salas;"; 
         ResultSet rs = mySQL.select(query);
         
        try {
            while(rs.next()){
                lista.add(new Hall(
                        rs.getInt("sala_id"),
                        rs.getString("nombre"),
                        rs.getString("capacidad")));
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Hay un error con la base de datos!");
        } 
        return lista; 
    
    }

     public void delete(int sala_id){
    
        String query = "DELETE FROM TheGalactics_salas WHERE sala_id ="+sala_id;
        
        mySQL.delete(query);
    }

     
}


