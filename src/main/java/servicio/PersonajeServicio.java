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
///////////////////////////////////////////agregamos nuevo

 
    }
    
