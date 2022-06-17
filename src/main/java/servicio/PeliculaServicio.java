/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;

/**
 *
 * @author user
 */
public class PeliculaServicio implements IPeliculaServicio {
    private static List<Pelicula> peliculaList = new ArrayList<>();

    @Override
    public Pelicula crear(Pelicula pelicula) {
        
        this.peliculaList.add(pelicula);
        return pelicula; 
 }

    @Override
    public List<Pelicula> listar() {
        
        return this.peliculaList;
    }

    @Override
    public Pelicula buscarPorCodigo(int codigoPelicula) {
        
                Pelicula pelicula=null;
        for(var c:this.peliculaList){
            if(codigoPelicula==c.getCodigo()){
                pelicula=c;
                break;
            }
        }
        return pelicula;
        }
    
    
    
}
