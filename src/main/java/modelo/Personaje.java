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
    private String actor;
    private String pelicula;

    public Personaje(String nombre, int numeroDeEscenas, int edadDelPersonaje, String actor, String pelicula) {
        this.nombre = nombre;
        this.numeroDeEscenas = numeroDeEscenas;
        this.edadDelPersonaje = edadDelPersonaje;
        this.actor = actor;
        this.pelicula = pelicula;
    }

    public Personaje(String nombre, String actor, String pelicula, Integer numeroDeEscenas,Integer edadDelPersonaje ) {
        
        this.nombre = nombre;
        this.actor = actor;
        this.pelicula = pelicula;
        this.numeroDeEscenas = numeroDeEscenas;
        this.edadDelPersonaje = edadDelPersonaje;
        
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

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", numeroDeEscenas=" + numeroDeEscenas 
                + ", edadDelPersonaje=" + edadDelPersonaje + ", actor=" + actor + ", pelicula="
                + pelicula + '}';
    }

    
    
    
}
