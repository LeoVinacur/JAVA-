/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla
 * @author  
 */
public class Ejercicio3 {
    
       public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese su nomre y apellido");
       String nombre = leer.nextLine();
      
        System.out.println("Su nombre es " + nombre);
       
        // TODO code application logic here
    }
    
}
