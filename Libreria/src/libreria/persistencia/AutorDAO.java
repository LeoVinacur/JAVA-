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

/**
 *
 * @author LEOPOLDO
 */
public class AutorDAO {
    //El parametro de este atributo, es COMO SE NOMBRA MI ARCHIVO PERSISTENCIA (persistence.xml, Persistencia Unit Name)
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarAutor(Autor autor) throws Exception { // Este metodo es para ingresar 
        em.getTransaction().begin();
        em.persist(autor); // Para guardar - envio el objeto completo
        em.getTransaction().commit();       
    }
//
    public void modificarAutor(Autor autor) throws Exception { // Este metodo es para ingresar o modificar
        em.getTransaction().begin();
        em.merge(autor); // Para modificar un objeto - Sobreescribe los atributos
        em.getTransaction().commit();    
    }

    public void eliminarAutorPorId(String id) throws Exception {
        Autor autor = buscarAutorPorId(id);
        em.getTransaction().begin(); //Inicio   
        em.remove(autor);
        em.getTransaction().commit(); //Fin (Si algo fallo ... vuelve pa atras)    
    }
    
     public void eliminarAutorPorNombre(String nombre) throws Exception {
        Autor autor = buscarAutorPorNombre(nombre);
        em.getTransaction().begin(); //Inicio   
        em.remove(autor);
        em.getTransaction().commit(); //Fin (Si algo fallo ... vuelve pa atras)    
    }

    public Autor buscarAutorPorId(String id) throws Exception {
        Autor autor = em.find(Autor.class, id); // Para traer objeto con el ID
        return autor;
    }
    
       public Autor buscarAutorPorNombre(String nombre) throws Exception {
        Autor autor = (Autor) em.createQuery("SELECT d  "
                + " FROM Autor d"
                + " WHERE d.nombre LIKE :nombre").
                setParameter("nombre", nombre).
                getSingleResult();   
           System.out.println("El autor es: " +autor); // no es necesario
        return autor;
    }

    //CONSULTA SIN PARAMETROS
       // Lo hice void, para mostrar ordenado por pantalla
    public void listarAutors() throws Exception {  // en lugar de void, era "List<Autor>"
        List<Autor> autors = em.createQuery("SELECT d FROM Autor d")
                .getResultList();
        
        for (Autor autor : autors) {
            System.out.println(autor.getNombre());
        }
     //   return autors;
    }

    //CONSULTA CON PARAMETROS
    public List<Autor> listarAutorsNombre(String nombre) throws Exception {
        List<Autor> autorsFiltradas = em.createQuery("SELECT d "
                + " FROM Autor d"
                + " WHERE d.nombre = :nombre").
                setParameter("nombre", nombre)
                .getResultList();
        return autorsFiltradas;
    }

 
    
}
