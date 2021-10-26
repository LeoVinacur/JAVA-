/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
8. Crear un programa que dado un numero determine si es par o impar
 */
public class Ejercicio8 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese un numero para saber si es par o impar");
      int num = leer.nextInt ();
      
      if (num % 2 == 0)
         System.out.println( "El número es PAR");
      else
          System.out.println ("el número es IMPAR");
        }
    
}
