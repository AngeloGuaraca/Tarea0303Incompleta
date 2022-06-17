/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;

import modelo.Personaje;

/**
 *
 * @author user
 */
public class PersonajeServicio implements IPersonajeServicio {
    
    private static List<Personaje> personajeList = new ArrayList<>();

    @Override
    public Personaje crear(Personaje personaje) {
        
        this.personajeList.add(personaje);
        return personaje; 
        
        
   }

    @Override
    public List<Personaje> listar() {
        
           return this.personajeList;
    }

    @Override
    public Personaje modificar(int codigoPersonaje, Personaje personajeNuevo) {
        
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoPersonaje));
        this.listar().get(posicion).setNombre(personajeNuevo.getNombre());
        this.listar().get(posicion).setNumeroDeEscenas(personajeNuevo.getNumeroDeEscenas());
        this.listar().get(posicion).setActor(personajeNuevo.getActor());
        this.listar().get(posicion).setPelicula(personajeNuevo.getPelicula());
        
        return personajeNuevo;
    }

    @Override
    public Personaje eliminar(int codigoPersonaje) {
        
        Personaje personaje=this.buscarPorCodigo(codigoPersonaje);
        var posicion=this.buscarPosicion(personaje);
        this.listar().remove(posicion);
        return personaje;
        
     }

    @Override
    public Personaje buscarPorCodigo(int codigoPersonaje) {
        
        Personaje personaje=null;
        for(var b:this.personajeList){
            if(codigoPersonaje==b.getCodigo()){
                personaje=b;
                break;
            }
        }
        return personaje;
        
    }

    @Override
    public int buscarPosicion(Personaje personaje) {
        
         int posicion=-1;
        for(var b:this.personajeList){
            posicion++;
            if(b.getCodigo()==personaje.getCodigo()){
                break;
            }
        }
        return posicion;
    }

   

    

   
  

 
    }
    
