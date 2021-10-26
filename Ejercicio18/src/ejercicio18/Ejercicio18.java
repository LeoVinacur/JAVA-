/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;
///import static java.lang.Math.E;
 
import java.util.Scanner ;
/**
 18. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
* Nota: investigar función equals() y como convertir números a String
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena  ;
        String cadena2 = (" ");
      
        /**cadena= String.valueOf(123);
        System.out.println(cadena.substring(1,2));
        
        cadena2 = cadena.replace("123" , "E");
           System.out.println(cadena2);
       *///   
        for (int i = 0; i <= 999 ; i++) {
            cadena= String.valueOf(i);
            
       if (!cadena.substring(0,1).equals(3) || !cadena.substring(1,2).equals(3) || !cadena.substring(2,3).equals(3))       
           cadena2 = cadena.replace("3" , "E");
                 
           System.out.println(cadena2);
              }
            
        }
             
       
          
          
        // TODO code application logic here
    }
    

