/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author  
 */
public class Ejercicio4 {
     public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una frase");
       String frase = leer.nextLine();
      
        System.out.println("MAYUSCULAS "  + frase.toUpperCase());;
        
          System.out.println("minuscula " +  frase.toLowerCase());;
       
        // TODO code application logic here
    }
}
