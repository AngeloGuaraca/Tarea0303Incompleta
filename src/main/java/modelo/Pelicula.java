/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Pelicula {
    
    
    private String nombre;
    private String peliculaTipo;
    private int anioDeEstreno;
    private int ranking;
    private String paisOrigen;

    public Pelicula(String nombre, String peliculaTipo, int anioDeEstreno, int ranking, String paisOrigen) {
        this.nombre = nombre;
        this.peliculaTipo = peliculaTipo;
        this.anioDeEstreno = anioDeEstreno;
        this.ranking = ranking;
        this.paisOrigen = paisOrigen;
    }

    public Pelicula(String nombre, String paisOrigen, Integer anioDeEstreno,Integer ranking, String peliculaTipo ) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.anioDeEstreno = anioDeEstreno;
        this.ranking = ranking;
        this.peliculaTipo = peliculaTipo;
        
      }

  

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeliculaTipo() {
        return peliculaTipo;
    }

    public void setPeliculaTipo(String peliculaTipo) {
        this.peliculaTipo = peliculaTipo;
    }

    public int getAnioDeEstreno() {
        return anioDeEstreno;
    }

    public void setAnioDeEstreno(int anioDeEstreno) {
        this.anioDeEstreno = anioDeEstreno;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", peliculaTipo=" 
                + peliculaTipo + ", anioDeEstreno=" + anioDeEstreno +
                ", ranking=" + ranking + ", paisOrigen=" + paisOrigen + '}';
    }
    
    
}
