
package mx.itson.regalo.entities;


public class Movie {

    public Movie() {
    }

    public Movie(int peliculas_id, String title, String gander, String duration, String synopsis) {
        this.peliculas_id = peliculas_id;
        this.title = title;
        this.gander = gander;
        this.duration = duration;
        this.synopsis = synopsis;
    }

 
    private int peliculas_id;
    private String title;
    private String gander;
    private String duration;
    private String synopsis;

    public int getPeliculas_id() {
        return peliculas_id;
    }

    public void setPeliculas_id(int peliculas_id) {
        this.peliculas_id = peliculas_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    
}
    
    
    
    
    

