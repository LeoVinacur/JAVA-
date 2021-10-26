/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones1extra;
import java.util.Scanner;
import java.util.ArrayList;
 
/**
 *
 * @author mzeballos
 */
public class Relaciones1EXTRA {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");   
       
        Persona p = new Persona();
        Perro pe = new Perro ();
        String rrt;
       
        
        p.IngresoPersonas();
        pe.IngresoPerros();
     
        
        do {
            System.out.println(" ");
            System.out.println("Programa de adopción de Perros");
            System.out.println(" ");
          p.MostrarPersonas();
         pe.MostrarPerros();
   
            p.QuienAdopta();
           pe.AdoptarPerro();
          pe.MostrarPerros();      
          p.MostrarPersonas();
      // p.Resultado();
         System.out.println(" "); 
        System.out.println(p.rta +" va a adoptar a " +pe.rta); 
      
            System.out.println(" ");
            System.out.println("Desea correr de nuevo el programa?  s/n");
            rrt = leer.next();
        
        } while (rrt.equalsIgnoreCase("s"));  
          
         pe.MostrarPerros();      
          p.MostrarPersonas();
    //       Lo de abajo muestra arrays desde las distintas clase NO BORRAR
//         ArrayList<Perro> perr = pe.getPerr();
//        for (Perro perro : perr) {
//            System.out.println(perro); 
//            if (perro.getNombrePerro().equals(p.rta)) {
//                System.out.println("Encontró a Mapu"); 
//               
//            }
//        }
        
        // TODO code application logic here
    }
    
}
