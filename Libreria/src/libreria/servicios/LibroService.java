/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Scanner;
import java.util.UUID;
import libreria.Entidades.Autor;
import libreria.Entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author LEOPOLDO
 */
public class LibroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
      private final LibroDAO libroDao;
      private final AutorService autorService;
        AutorService as = new AutorService();

    public LibroService() {
          this.libroDao = new LibroDAO(); 
        this.autorService = new AutorService();  
    }
  

  
    
    public void creaLibro(String titulo , String nombre) throws Exception{
       
        try {
            
          
         
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar un titulo"); 
            }
            
             if (nombre == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar un autor"); 
            }
           
            Libro libronuevo = new Libro();
            Autor nuevoAutor = autorService.creaAutor(nombre);
          
            libronuevo.setTitulo(titulo);
            libronuevo.setID(UUID.randomUUID().toString());
            libronuevo.setISBN(UUID.randomUUID().getLeastSignificantBits());
            libronuevo.setAlta(Boolean.TRUE);
            libronuevo.setAutor(nuevoAutor);
            
            libroDao.guardarLibro(libronuevo);
            
               //   return libronuevo;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
         //   return null;
        }
        
    }
    
    public void eliminarLibro(String nombre) throws Exception{
        
        try {
               if (nombre == null || nombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
               }
                 libroDao.eliminarLibroPorTitulo(nombre);
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void modificarLibro (String nombre, String nuevoNombre) {
        
        Libro editori = null;
        
         try {
               if (nombre == null || nombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
               }
                if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
                   throw new Exception("Debe indicar un nombre");
                }
           editori = libroDao.buscarLibroPorTitulo(nombre);
           editori.setTitulo(nuevoNombre);
           libroDao.modificarLibro(editori);
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

     
}
