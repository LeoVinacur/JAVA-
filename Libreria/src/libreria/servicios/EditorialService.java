/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.UUID;
import libreria.Entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author LEOPOLDO
 */
public class EditorialService {
  private EditorialDAO editorialDao;

    public EditorialService() {
        editorialDao=new EditorialDAO();
    }
    
    public Editorial creaEditorial(String nombre) throws Exception{
        Editorial editorialnuevo = new Editorial();
        
        try {
         
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre"); 
            }
           
            editorialnuevo.setNombre(nombre);
            editorialnuevo.setID(UUID.randomUUID().toString());
            editorialnuevo.setAlta(Boolean.TRUE);
            
            editorialDao.guardarEditorial(editorialnuevo);
            
                  return editorialnuevo;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
    public void eliminarEditorial(String nombre) throws Exception{
        
        try {
               if (nombre == null || nombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
               }
                 editorialDao.eliminarEditorialPorNombre(nombre);
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void modificarEditorial (String nombre, String nuevoNombre) {
        
        Editorial editori = null;
        
         try {
               if (nombre == null || nombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
               }
                if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
                }
           editori = editorialDao.buscarEditorialPorNombre(nombre);
           editori.setNombre(nuevoNombre);
           editorialDao.modificarEditorial(editori);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
       
}
