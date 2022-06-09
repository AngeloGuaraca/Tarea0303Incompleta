/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Personaje;

/**
 *
 * @author user
 */
public interface IPersonajeServicio {
    
     public Personaje crear(Personaje personaje);
    public List<Personaje> listar(); 
    
    public Personaje buscarPorCodigo(int codigo);
    public Personaje eliminar(int codigo);
    
}
