/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Actor;

/**
 *
 * @author user
 */
public interface IActorServicio {
    
    public Actor crear(Actor actor);
    public List<Actor> listar(); 
    
}
