/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author  
 */
public class Ejercicio5 {
    
      public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese los grados centígrados para pasar a F");
      double num = leer.nextDouble ();
       
      double conversion =    32 + (9 * num / 5); 
      
        System.out.println(   num + " grados centígrados equivalen a "  + conversion +  " grados F");
        }
    
}
