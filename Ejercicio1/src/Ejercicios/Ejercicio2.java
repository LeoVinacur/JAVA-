/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;
/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 * @author LeoVinacur
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese dos números para sumar");
      int num = leer.nextInt ();
      int num2 = leer.nextInt ();
      int suma = num + num2; 
      
        System.out.println("La suma de los dos números es " + suma);
       
        // TODO code application logic here
    }
    
}
