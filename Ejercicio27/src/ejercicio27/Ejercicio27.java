/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27;
import java.util.Scanner;
/**
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in) ;
       
         int [][] matriz = new int [3][3];
         
    
         System.out.println("Escriba 9 números de la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) 
              matriz [i][j] = leer.nextInt ();
        }
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             System.out.print(matriz [i][j] +" ");           
}   
             System.out.println(" ");
 }  
           System.out.println(" ");
           int suma1 =0;
           int suma2 =0;
           int suma3 =0;
           int suma4 =0;
           
           for (int i = 0; i < 3; i++) {
               suma1=0;
               for (int j = 0; j < 3; j++) {
                suma1 = suma1 + matriz [i][j];  
               }    
        }
           
            for (int j = 0; j < 3; j++) {
            suma2=0;
               for (int i = 0; i < 3; i++) {
                suma2 = suma2 + matriz [i][j];  
               }    
        }
            for (int j = 0; j < 3; j++) {
               for (int i = 0; i < 3; i++) {              
                   if (i==j) {
                    suma3 = suma3 +   matriz [i][j]; 
                   }
               }    
        }
             for (int j = 0; j < 3; j++) {
               for (int i = 0; i < 3; i++) {               
                   if (i+j == 2) {
                    suma4 = suma4 +   matriz [i][j]; 
                   }
               }    
        }
        if (suma1 + suma2 == suma3 + suma4) {
            System.out.println("La matriz ES MAGICA !!!");  
        } else System.out.println("La matriz NO es mágica");
        System.out.println(" ");
        System.out.println(+suma1 +" " +suma2 +" " +suma3 +" " +suma4);
                
           
        // TODO code application logic here
    }
    
}
