   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
7. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese dos números para ver cual es el mayor");
      int num1 = leer.nextInt ();
      int num2 = leer.nextInt ();
     
      if (num1>num2)
        System.out.println("El número " + num1 + " es mayor que " + num2);
      else 
          System.out.println("El número " + num2 + " es mayor que " + num1);
       
    }
    
}
