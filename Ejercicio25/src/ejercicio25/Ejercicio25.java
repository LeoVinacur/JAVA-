/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;
import java.util.Scanner;
 
/**
 * 
 */
public class Ejercicio25 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre traspuesta
     * @param args
     */
     public static void main(String[] args) {
      Scanner leer = new Scanner(System.in) ;
         
         int [][] matriz = new int [4][4];
    
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) 
              matriz [i][j] = (int) (Math.random() * 20);   
         
}
    for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
             System.out.print(matriz [i][j] +" ");     
         
}   
             System.out.println(" ");
 }  
 
         System.out.println("Matriz Transpuesta");
     for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
             System.out.print(matriz [i][j] +"  ");     
         
}   
             System.out.println("  ");
 }  
    
    
  }  
}
