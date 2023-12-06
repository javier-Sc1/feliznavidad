 
package mx.itson.regalo.entities;

/**
 *
 * @author PC
 */
public class Function {
    
    private int sala_id;
    private int pelicula_id;
    private int function_id;

    public Function(int sala_id, int pelicula_id, int function_id) {
        this.sala_id = sala_id;
        this.pelicula_id = pelicula_id;
        this.function_id = function_id;
    }

    public Function() {
    }

    public int getSala_id() {
        return sala_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }

    public int getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(int pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public int getFunction_id() {
        return function_id;
    }

    public void setFunction_id(int function_id) {
        this.function_id = function_id;
    }
    
    
    
    
    
}
