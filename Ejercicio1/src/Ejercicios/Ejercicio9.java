/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 9. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
* 
* 
 */
public class Ejercicio9 {
     public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una clave");
       String palabra = leer.nextLine();
       String clave = ("eureka");
      
       if (palabra.equals(clave))
       System.out.println("La clave es correcta"  );
       else
           System.out.println("La clave es incorrecta");
        // TODO code application logic here
    }
}
