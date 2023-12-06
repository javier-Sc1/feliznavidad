/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.regalo.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.itson.regalo.db.MySQLConnection;
import mx.itson.regalo.entities.Function;


/**
 *
 * @author PC
 */
public class FunctionModel {
    MySQLConnection mySQL = new MySQLConnection();
    
    public void insert(Function f){
        //"+u.getNombre()+"
        String query = "INSERT INTO TheGalactics_funciones (sala_id, pelicula_id,function ) ";
              query+= "values ('"+f.getSala_id()+"', '"+f.getPelicula_id()+"','"+f.getFunction_id()+"' )";
              
       mySQL.insert(query);
    
    }
    
    public void update(Function f){
    
    String query ="UPDATE TheGalactics_funciones SET  salas_id='"+f.getSala_id()+"', pelicula_id ='"+f.getPelicula_id()+"' , function_id ='"+f.getFunction_id();
           query+="Where ID="+f.getFunction_id(); 
           
    mySQL.update(query);
    
    }
    
    public Function findByID(int function_id){
     Function f = null;   
     String query ="SELECT * FROM TheGalactics_funciones WHERE function_id="+function_id;
     
     ResultSet rs = mySQL.select(query);
     try {
        while(rs.next()){

                f = new Function(
                        rs.getInt("sala_id"),
                        rs.getInt("pelicula_id"),
                        rs.getInt("function_id")
                );
        }
     } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Hay un error con la base de datos!");
     }
     
     return f;
    }

    public ArrayList<Function> select(){ 
        ArrayList<Function> lista = new ArrayList<Function>(); 
        
        String query = "SELECT * FROM TheGalactics_funciones;"; 
         ResultSet rs = mySQL.select(query);
         
        try {
            while(rs.next()){
                lista.add(new Function(
                        rs.getInt("sala_id"),
                        rs.getInt("pelicula_id"),
                        rs.getInt("function_id")));
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Hay un error con la base de datos!");
        } 
        return lista; 
    
    }

     public void delete(int function_id){
    
        String query = "DELETE FROM TheGalactics_funciones WHERE function_id ="+function_id;
        
        mySQL.delete(query);
    }
    
}
