/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio26;
import java.util.Scanner;
/**
26 *Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por A
T y se obtiene cambiando sus filas por columnas (o
viceversa). 
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in) ;
       
         int [][] matrizA = new int [4][4];
         int [][] matrizB = new int [4][4];
    
         System.out.println("Escriba 16 números de la primer matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) 
              matrizA [i][j] = leer.nextInt ();
        }
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
             System.out.print(matrizA [i][j] +" ");     
         
}   
             System.out.println(" ");
 }  
         System.out.println(" ");
         
            System.out.println("Escriba 16 números de la segunda matriz, pero en negativo");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){ 
              matrizB [i][j] = leer.nextInt ();
          }
        }
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
             System.out.print(matrizB [i][j] +" ");     
         
}   
             System.out.println(" ");
 }  
         
      System.out.println(" ");     
   int cont = 0;
           
       for (int i = 0; i < 4; i++){
       for (int j = 0; j < 4; j++){    
     
           if (matrizA [i][j] + matrizB [i][j] == 0){
         //System.out.println("La matriz es ANTISIMETRICA");  
         cont = cont +1;  
     }         
 } 
  }
         if (cont == 16){
        // TODO code application logic here
     System.out.println("La matriz es ANTISIMETRICA");
    } else System.out.println("La matriz NO ES Antisimétrica");
             
 }
  }
     
  
 
