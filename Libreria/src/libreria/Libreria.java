/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.persistencia.LibroDAO;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;
import java.util.Scanner;
import libreria.Entidades.Autor;
/**
 *
 * @author LEOPOLDO
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();
       
        AutorService au = new AutorService();
        AutorDAO ad = new AutorDAO();
        EditorialDAO ed = new EditorialDAO();
        EditorialService es = new EditorialService();
        LibroService ls = new LibroService();
        LibroDAO ld = new LibroDAO();
        
        // Alternativa pidiendo al usuario el nombre
//        System.out.println("Ingrese autor");
//        String aux = leer.next();
//        System.out.println(aux);
         //  au.creaAutor("Borges");
     
        
       //  au.eliminarAutor(aux);  
     //  au.modificarAutor("juam", "Isabel Allende");    
     //  System.out.println(ad.listarAutors()); // Funciona solo si NO es void el método
      // System.out.println(ad.buscarAutorPorNombre("Funes"));
     //  System.out.println(ed.listarEditorials());
  //   ad.listarAutors();
        
        
       //  es.creaEditorial("New Sheffields");
     ls.creaLibro("Momo" , "Michael Hende");  
      //  System.out.println("");
     //   System.out.println(ld.listarLibros()); // Funciona solo si NO es void el método
        ld.listarLibros();
    
     //  ls.creaLibro("El mago de Oz"); // solo con el titulo
        
      //  es.eliminarEditorial("El_Ateneo");
    //     ls.eliminarLibro("El mago de Oz");
    
     // es.modificarEditorial("El Ateneo", "Yenny");
    
//       
//        System.out.println("Ingrese nombre del libro");
//        String titulo = leer.next();
//        System.out.println("Ingrese autor");
//        String nombre = leer.next();
         
      
        // TODO code application logic here
        
    }
    
}
