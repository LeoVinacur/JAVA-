/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *6. Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 * 
 */
public class Ejercicio6 {
     public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese un número para hacer operaciones matemáticas");
      int num = leer.nextInt ();
       
     
      
        System.out.println("El doble del número ingresado es: " + num*2   );
        System.out.println("El triple del número ingresado es: " + num*3    );
        System.out.println("La raíz cuadrada del número ingresado es " + Math.sqrt(num) );
        }
}
