/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *10. Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class Ejercicio10 {
     public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una palabra de 8 letras");
       String palabra = leer.nextLine();
       int largo = palabra.length();
         System.out.println("prueba: " +largo);
      
     /// if(largo == 8)
     if (largo > 8 || largo < 8)
       System.out.println("La palabra tiene NO TIENE 8 letras"  );
      
           else if (largo == 8)
       System.out.println("La palabra SI tiene 8 letras");
        // TODO code application logic here
    } 
}
 