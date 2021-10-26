/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;
import java.util.Scanner ;
/**
 *21. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class Ejercicio21 {

    public static double cambio(int euros, int cambio) { 
     
             
          switch (cambio){
               case 1: 
                    System.out.println( "su cambio en pesos es: " +euros*140);
                    break;
                case 2:
                    System.out.println("su cambio en dolares es: " + euros *1.8);
                    break;
         }
       
      
            int r = cambio ; 
                return   r;
            }
    
    public static void main(String[] args) {
         Scanner sca = new Scanner(System.in);
         Scanner leer = new Scanner(System.in);//.useDelimiter("\n");
        String pesos ;
        String dolares ;
         
         System.out.println("En que moneda quiere cambiar los euros? Pesos o Dolares?" );
        System.out.println("Si es pesos aprete 1, si es dolares, aprete 2 " );
         int cambio = leer.nextInt ();
  
         System.out.println("Cuantos Euros quiere cambiar?");
         int euros   = leer.nextInt ();
       
         double  r  = cambio(euros, cambio);   
     
        
    }
        
}
 