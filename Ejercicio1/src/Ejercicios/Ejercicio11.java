/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *11. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class Ejercicio11 {
   public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una palabra en minúscula");
       String palabra = leer.nextLine();
      // String ar = "a";
       
    ///System.out.println("escribir " + palabra.substring(3,5));
    
     //  System.out.println(palabra.substring(0,0));
       
       if (palabra.substring(0,1).equals("a"))
       System.out.println("Su palabra comienza con a");
       else
       System.out.println("Su palabra NO comienza con a");
       
             
       
       
       
   } 
}
