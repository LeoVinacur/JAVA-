/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;
import java.util.Scanner ;
/**
 *20. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
 
        
        System.out.println("Ingrese 4 números para escribir asteriscos");
   
       int num1 = leer.nextInt (); 
       int num2 = leer.nextInt ();
       int num3 = leer.nextInt ();
       int num4 = leer.nextInt ();
       
        System.out.println(" ");
        if (num1<=20 && num1>0) {
        System.out.print(num1+" ");
        for (int i = 1; i <= num1; i++) {
            System.out.print("*");
        } 
        } else 
            System.out.println("El número " +num1 +" no es válido");
         System.out.println(" ");
         
          System.out.println(" ");
        if (num2<=20 && num2>0) {
        System.out.print(num2+" ");
        for (int i = 1; i <= num2; i++) {
            System.out.print("*");
        } 
        } else 
            System.out.println("El número " +num2 +" no es válido");
         System.out.println(" ");
         
          System.out.println(" ");
        if (num3<=20 && num3>0) {
        System.out.print(num3+" ");
        for (int i = 1; i <= num3; i++) {
            System.out.print("*");
        } 
        } else 
            System.out.println("El número " +num3 +" no es válido");
         System.out.println(" ");
         
          System.out.println(" ");
        if (num4<=20 && num4>0) {
        System.out.print(num4+" ");
        for (int i = 1; i <= num4; i++) {
            System.out.print("*");
        } 
        } else 
            System.out.println("El número " +num4 +" no es válido");
         System.out.println(" ");
        // TODO code application logic here
    }
    
}
