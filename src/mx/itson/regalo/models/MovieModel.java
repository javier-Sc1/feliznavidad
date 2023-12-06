
package mx.itson.regalo.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mx.itson.regalo.db.MySQLConnection;
import mx.itson.regalo.entities.Movie;


import javax.swing.JOptionPane;

import mx.itson.regalo.entities.Movie;

public class MovieModel {

    MySQLConnection mySQL = new MySQLConnection();

    public void insert(Movie m) {
        String query = "INSERT INTO TheGalactics_peliculas (titulo, genero, duracion_minutos, sinopsis) ";
        query += "VALUES ('" + m.getTitle() + "', '" + m.getGander() + "','" + m.getDuration() + "', '" + m.getSynopsis() + "')";
        mySQL.insert(query);
    }

    public void update(Movie m) {
        String query = "UPDATE TheGalactics_peliculas SET titulo='" + m.getTitle() + "', genero='" + m.getGander() + "', duracion_minutos='" + m.getDuration() + "', sinopsis='" + m.getSynopsis() + "' ";
        query += "WHERE pelicula_id=" + m.getPeliculas_id();
        mySQL.update(query);
    }

    public Movie findByID(int pelicula_id) {
        Movie m = null;
        String query = "SELECT * FROM TheGalactics_peliculas WHERE pelicula_id=" + pelicula_id;
        ResultSet rs = mySQL.select(query);
        try {
            while (rs.next()) {
                m = new Movie(
                        rs.getInt("pelicula_id"),
                        rs.getString("titulo"),
                        rs.getString("genero"),
                        rs.getString("duracion_minutos"),
                        rs.getString("sinopsis")
                );
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error con la base de datos!");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                // Manejar la excepción si es necesario
            }
        }
        return m;
    }

    public ArrayList<Movie> select() {
        ArrayList<Movie> lista = new ArrayList<Movie>();
        String query = "SELECT * FROM TheGalactics_peliculas;";
        ResultSet rs = mySQL.select(query);
        try {
            while (rs.next()) {
                lista.add(new Movie(
                        rs.getInt("pelicula_id"),
                        rs.getString("titulo"),
                        rs.getString("genero"),
                        rs.getString("duracion_minutos"),
                        rs.getString("sinopsis")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error con la base de datos!");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                // Manejar la excepción si es necesario
            }
        }
        return lista;
    }

    public void delete(int pelicula_id) {
        String query = "DELETE FROM TheGalactics_peliculas WHERE pelicula_id=" + pelicula_id;
        mySQL.delete(query);
    }

    public int getMaxPeliculaId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}