/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainAnimal;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class MAINAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         Animal perro = new Perro ("Mapu", "DogChow" , 13 , "Setter");
         System.out.println(perro.toString());
         perro.alimentacion();
         System.out.println(" ");
         Animal gato = new Gato ("Mingo", "Wiskas" , 10 , "Ragdoll");
         System.out.println(gato);
         gato.alimentacion();
         System.out.println(" "); 
         Animal caballo = new Caballo ("Lady" , "Forraje" , 6 , "Islandes");
         System.out.println(caballo);
         caballo.alimentacion();
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
