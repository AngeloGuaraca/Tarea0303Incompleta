/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Actor;


/**
 *
 * @author user
 */
public class ActorServicio implements IActorServicio {
    
    private static List<Actor> actorList = new ArrayList<>();

    @Override
    public Actor crear(Actor actor) {
        this.actorList.add(actor);
        return actor;    
    }

    @Override
    public List<Actor> listar() {
            
         return this.actorList;
     }
    
}
