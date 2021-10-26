    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
 
/**
 *Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
 
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos.
 */
public class PeliculasService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<PeliculasService> peliculas = new ArrayList ();
     
   
   public String titulo;
   public String director;
   public Integer duracion;  
   
   private static Comparator<? super String> compararTitulo;
   //private static Comparator<? super String> compararDirector;
  // private static Comparator<? super String> compararDuracion;
   
    public PeliculasService() {
    }

    public PeliculasService(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "PeliculasService{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
   
     public void ingresarPeliculas ( ) {
        String rta;
  
        do {
   
             System.out.println("Ingrese el título de la película");
                titulo = leer.next();
              
                     
             System.out.println("Ingrese el nombre del director");
                director = leer.next();
           
            setDirector(director);
                System.out.println("Ingrese la duración de la película en minutos");
                duracion = leer.nextInt();
                
      peliculas.add (new PeliculasService(titulo, director, duracion ));         
     
         rta = null;
            System.out.println("Quiere agregar otra película? s / n");
             rta = leer.next();
             
             if (!rta.equals("s") && !rta.equals("n") ) {
                 System.out.println("Ingrese una respuesta válida");   
            }
          
    } while (!"n".equals(rta));
}
     
     public void MostrarPeliculas (){
         System.out.println(" ");
         System.out.println("Las películas ingresadas son: ");
         for (PeliculasService aux : peliculas) {
             System.out.println(aux.toString());
         }
         
        System.out.println("Cantidad de peliculas ingresadas: " +peliculas.size());
        System.out.println(" "); 
     }
     
     public void DuracionLarga (){
         System.out.println("Las películas con duración de más de dos horas son: ");
         for (PeliculasService aux : peliculas) {
             if ( aux.getDuracion()>120) {
   System.out.println("Título: " + aux.getTitulo()); 
             }
         }
         
     }
     
     public static Comparator<PeliculasService> CompDuracionDesc = new Comparator<PeliculasService>() {
       @Override
      public int compare(PeliculasService o1, PeliculasService o2) {
       
     return o2.getDuracion().compareTo(o1.getDuracion());
      
       }
  };
     
      public static Comparator<PeliculasService> CompDuracionAsc = new Comparator<PeliculasService>() {
       @Override
      public int compare(PeliculasService o1, PeliculasService o2) {
       
     return o1.getDuracion().compareTo(o2.getDuracion());
      
       }
  };
     
     
      public static Comparator<PeliculasService> CompTitulo = new Comparator<PeliculasService>() {
       @Override
      public int compare(PeliculasService o1, PeliculasService o2) {
       
     return o1.getTitulo().compareTo(o2.getTitulo());
      
       }
   };
      
      public static Comparator<PeliculasService> CompDirector = new Comparator<PeliculasService>() {
       @Override
      public int compare(PeliculasService o1, PeliculasService o2) {
       
     return o1.getDirector().compareTo(o2.getDirector());
      
       }
   };
      
     public void ordenar (){
         int opcion = 0;
          do {
         System.out.println(" ");
         System.out.println("Ingrese la opción deseada:");
         System.out.println("1 - Películas ordenadas por duración ascendente");
          System.out.println("2 - Películas ordenadas por duración descendente");
           System.out.println("3 - Películas ordenadas por su Titulo");
            System.out.println("4 - Películas ordenadas por su Director");
              System.out.println("5 - SALIR");
              
          opcion = leer.nextInt();
         
         switch (opcion) {
             case 1:
                  Collections.sort(peliculas,  CompDuracionAsc );
                      for (PeliculasService aux : peliculas) {
             System.out.println(aux.toString());
         } 
                 break;
             case 2:
                  Collections.sort(peliculas,  CompDuracionDesc );
                 for (PeliculasService aux : peliculas) {
             System.out.println(aux.toString());
         } 
                 break;
             case 3:
                  Collections.sort(peliculas, CompTitulo);
                   for (PeliculasService aux : peliculas) {
             System.out.println(aux.toString());
         } 
                 break;
                   case 4:
                  Collections.sort(peliculas, CompDirector);
                     for (PeliculasService aux : peliculas) {
             System.out.println(aux.toString());
         } 
                 break;
                   case 5:
                       System.out.println("Gracias por utilizar el menú de películas");
                       System.out.println(" ");
                       
                       break;
                       
           //  default:
               //  throw new AssertionError();
                 
         }
           } while (opcion <4);
       //Collections.sort(peliculas,  CompDuracionDesc );
       
       // Collections.sort(peliculas,  CompDuracionAsc );
        
    //   Collections.sort(peliculas, Collections.reverseOrder()); 
      
     // Collections.sort(peliculas, CompTitulo);
         
      //   Collections.sort(peliculas, CompDirector);
     }
    
}
