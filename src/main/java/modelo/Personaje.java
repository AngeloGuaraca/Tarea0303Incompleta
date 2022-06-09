/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Personaje {
    
    private String nombre;
    private int numeroDeEscenas;
    private int edadDelPersonaje;
    private Actor actor;
    private Pelicula pelicula;

    public Personaje(String nombre, int numeroDeEscenas, int edadDelPersonaje, Actor actor, Pelicula pelicula) {
        this.nombre = nombre;
        this.numeroDeEscenas = numeroDeEscenas;
        this.edadDelPersonaje = edadDelPersonaje;
        this.actor = actor;
        this.pelicula = pelicula;
    }

    public Personaje(Integer valueOf, String arg, String arg0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Personaje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeEscenas() {
        return numeroDeEscenas;
    }

    public void setNumeroDeEscenas(int numeroDeEscenas) {
        this.numeroDeEscenas = numeroDeEscenas;
    }

    public int getEdadDelPersonaje() {
        return edadDelPersonaje;
    }

    public void setEdadDelPersonaje(int edadDelPersonaje) {
        this.edadDelPersonaje = edadDelPersonaje;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", numeroDeEscenas=" 
                + numeroDeEscenas + ", edadDelPersonaje=" + edadDelPersonaje +
                ", actor=" + actor + ", pelicula=" + pelicula + '}';
    }

    public boolean getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
