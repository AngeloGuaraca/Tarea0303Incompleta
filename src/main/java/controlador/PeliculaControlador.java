/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Pelicula;
import servicio.PeliculaServicio;



/**
 *
 * @author user
 */
public class PeliculaControlador {
    
        private final PeliculaServicio personajeServicio = new PeliculaServicio();
    
    public Pelicula crear(String [] params) {
        var pelicula = new Pelicula(Integer.valueOf(params[0]),params[1]);
        this.personajeServicio.crear(pelicula);
        return pelicula;
    }
    
    public List<Pelicula> listar() {
        return this.personajeServicio.listar();
    }
    
    
     
    
    
}
