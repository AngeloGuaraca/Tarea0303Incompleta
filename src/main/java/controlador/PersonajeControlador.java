/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Actor;
import servicio.ActorServicio;
import servicio.PeliculaServicio;



/**
 *
 * @author user
 */
public class PersonajeControlador {
    
    private final ActorServicio actorServicio = new ActorServicio(); //personaje
    private final PeliculaServicio peliculaServicio = new PeliculaServicio();//profesion
    
    public Actor crear(String [] params) {
        var fecha = LocalDate.of(Integer.valueOf(params[3]),
                Integer.valueOf(params[4]), 
                Integer.valueOf(params[5]));  
        var pelicula = this.peliculaServicio.buscarPorCodigo(Integer.valueOf(params[6]));
        var actor = new Actor(Integer.valueOf(params[0]),params[1],
                params[2],fecha,pelicula);
        this.actorServicio.crear(actor);
        return actor;
    }
    
    public List<Actor> listar() {
        return this.actorServicio.listar();
    }
    
}
