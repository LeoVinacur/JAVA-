/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 5 Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
public class ClassPaises {

  
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Set<String> paises = new HashSet ();
   
      
    public String pais;
    private static Comparator<? super String> compararPais;
    
    public ClassPaises() {
    }


    public ClassPaises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
 
   
  @Override
    public String toString() {
        return "ClassPaises{" + "paises=" + pais + '}';
    }
    
 
 public void ingresarPaises ( ) {
        String rta;
  
        do { 
           //  String pais = null;
             System.out.println("Ingrese un país");
            pais = leer.next();               
             paises.add(new String (pais));
           
         rta = null;
            System.out.println("Quiere agregar otro país? s / n");
             rta = leer.next();
             
             if (!rta.equals("s") && !rta.equals("n") ) {
                 System.out.println("Ingrese una respuesta válida");   
            }
          
    } while (!"n".equals(rta));
      
}
   
     public void MostrarPaises () {
        System.out.println(" ");
        System.out.println("Los paises ingresados son:");
         for (String pais : paises) {
             System.out.println(pais.toString());
         }
        
        System.out.println("Cantidad de países: " +paises.size());
        System.out.println(" ");
    }
 
     
     public void BuscarPais () {
              
        System.out.println("Ingrese un pais que desee buscar y borrar");
        String buscar = leer.next();
        
         boolean bandera = false;
          
         Iterator<String> it = paises.iterator();
         
         while (it.hasNext()) {
         
        if (it.next().equals(buscar)) {
                  System.out.println("Ese país fue encontrado en la lista, y se borrará de la misma");
             it.remove();
            bandera = true;    
              }  
     }
         if (bandera==false) {
              System.out.println("El país buscado no fue encontrado en la lista");
        System.out.println(" ");
         }
     System.out.println(" ");
        System.out.println("Las lista de paises:");
        for (String aux : paises) {
            System.out.println(aux);    
        }
        System.out.println(" ");
        System.out.println("Cantidad de paises actualizados: " +paises.size());
        
         System.out.println(" ");
      //  paises.forEach((aux) -> System.out.println("mostrar en metodo buscar; " +aux));  // otra forma de mostrar en pantalla
    }
     
  
     public void ordenarAlfabeticamente () {
         System.out.println(" ");
     TreeSet myTreeSet = new TreeSet();
       myTreeSet.addAll(paises);
       System.out.println(myTreeSet); 
      
     } 
        
//     public void BorrarUnPaisDeterminado (String x){
//          Iterator<String> it = paises.iterator(); 
//         while (it.hasNext()) {
//        
//        if (it.next().equals(x)) {
//                  System.out.println("Ese país fue encontrado en la lista, y se borrará de la misma");
//             it.remove();
//     }
//}
//     
//     }
}
     


