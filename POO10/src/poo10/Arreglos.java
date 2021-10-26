/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo10;
 import java.util.Scanner;

public class Arreglos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    // double [] vectorA = new double[50]; //DECLARO EL VECTOR A DE 50
    // double[] vectorB = new double [20]; //DECLARO EL VECTOR B DE 20
 
     
     public void ArregloA () {
         int[] vectorA = new int[50]; //DECLARO EL VECTOR A DE 50
         int[] vectorB = new int[20]; //DECLARO EL VECTOR B DE 20

for (int i = 0; i < 24; i++) {
vectorA[i] =  (int) (Math.random() * 100);  
System.out.print("[ " +vectorA[i] +"]"); 
}
        System.out.println("");
 for (int i = 25; i < 50; i++) {
vectorA[i] =  (int) (Math.random() * 100);  
System.out.print("[ " +vectorA[i] +"]");
 }
        System.out.println("");
     }
    
}
