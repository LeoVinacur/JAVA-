/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Entidades.Autor;
import libreria.Entidades.Libro;

/**
 *
 * @author LEOPOLDO
 */
public class LibroDAO {
    
      //El parametro de este atributo, es COMO SE NOMBRA MI ARCHIVO PERSISTENCIA (persistence.xml, Persistencia Unit Name)
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarLibro(Libro libro) throws Exception { // Este metodo es para ingresar 
        em.getTransaction().begin();
        em.persist(libro); // Para guardar - envio el objeto completo
        em.getTransaction().commit();       
    }
//
    public void modificarLibro(Libro libro) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(libro); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();    
    }

    public void eliminarLibro(String id) throws Exception {
        Libro libro = buscarLibroPorId(id);
        em.getTransaction().begin(); //Inicio   
        em.remove(libro);
        em.getTransaction().commit(); //Fin (Si algo fallo ... vuelve pa atras)    
    }

    public Libro buscarLibroPorId(String id) throws Exception {
        Libro libro = em.find(Libro.class, id); // Para traer objeto con el ID
        return libro;
    }

    //CONSULTA SIN PARAMETROS
     // Lo hice void, para mostrar ordenado por pantalla
    public void listarLibros() throws Exception {   // En lugar de void, era "List<Libro>"
        List<Libro> libros = em.createQuery("SELECT d  FROM Libro d")
                .getResultList();
        
        
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() +"  AUTOR:  " + libro.getAutor());
        }
     //   return libros;
    }
   

    //CONSULTA CON PARAMETROS
    public List<Libro> listarLibrosTitulo(String nombre) throws Exception {
        List<Libro> librosFiltradas = em.createQuery("SELECT d "
                + " FROM Libro d"
                + " WHERE d.titulo = :titulo").
                setParameter("titulo", nombre)
                .getResultList();
        return librosFiltradas;
    }
  public void eliminarLibroPorTitulo(String nombre) throws Exception {
        Libro libro = buscarLibroPorTitulo(nombre);
        em.getTransaction().begin(); //Inicio   
        em.remove(libro);
        em.getTransaction().commit(); //Fin (Si algo fallo ... vuelve pa atras)    
    }
  
     public Libro buscarLibroPorTitulo(String nombre) throws Exception {
        Libro libro = (Libro) em.createQuery("SELECT d "
                + " FROM Libro d"
                + " WHERE d.titulo LIKE :nombre").
                setParameter("nombre", nombre).
                getSingleResult();   
        return libro;
    }
}
