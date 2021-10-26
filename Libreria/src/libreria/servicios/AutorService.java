/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.UUID;
import libreria.Entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author LEOPOLDO
 */
public class AutorService {
    
    private AutorDAO autorDao;

    public AutorService() {
        autorDao=new AutorDAO();
    }
    
    public Autor creaAutor(String nombre) throws Exception{
        Autor autornuevo = new Autor();
        
        try {
         
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre"); 
            }
           
            autornuevo.setNombre(nombre);
            autornuevo.setID(UUID.randomUUID().toString());
            autornuevo.setAlta(Boolean.TRUE);
            
            autorDao.guardarAutor(autornuevo);
            
                return autornuevo;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
           return null;
        }
        
  
    }
    
    public void eliminarAutor(String nombre) throws Exception{
        
        try {
               if (nombre == null || nombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
               }
                 autorDao.eliminarAutorPorNombre(nombre);
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void modificarAutor (String nombre, String nuevoNombre) {
        
        Autor aut = null;
        
         try {
               if (nombre == null || nombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
               }
                if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
                }
           aut = autorDao.buscarAutorPorNombre(nombre);
           aut.setNombre(nuevoNombre);
           autorDao.modificarAutor(aut);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void buscarAutor (String nombre){
          Autor aut = null;
        
         try {
               if (nombre == null || nombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
               }
              
           aut = autorDao.buscarAutorPorNombre(nombre);
           } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         
         
        
    }
  
    
}
