/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio28;

import java.util.Scanner;

/**
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la
 * matriz P de 3x3, se solicita escribir un programa en el cual se compruebe si
 * la matriz P está contenida dentro de la matriz M. Para ello se debe verificar
 * si entre todas las submatrices de 3x3 que se pueden formar en la matriz M,
 * desplazándose por filas o columnas, existe al menos una que coincida con la
 * matriz P. En ese caso, el programa debe indicar la fila y la columna de la
 * matriz M en la cual empieza el primer elemento de la submatriz P
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] M = new int[10][10]; // La Matriz se llama M

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = (int) (Math.random() * 50);
            }
        }
     /*   
        M[4][4] = 1;
        M[4][5] = 2;
        M[4][6] = 3;
        M[5][4] = 4;
        M[5][5] = 5;
        M[5][6] = 6;
        M[6][4] = 7;
        M[6][5] = 8;
        M[6][6] = 9;
        
        M[0][0] = 1;
        M[0][1] = 2;
        M[0][2] = 3;
        M[1][0] = 4;
        M[1][1] = 5;
        M[1][2] = 6;
        M[2][0] = 7;
        M[2][1] = 8;
        M[2][2] = 9;
       */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[ " + M[i][j] + " ]" + " ");
            }
            System.out.println(" ");
        }
        System.out.print(" ");

        int[][] P = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int k = 0; k < 3; k++) {
        for (int l = 0; l < 3; l++) {
         System.out.print("[ " + P[k][l] + " ]" + " ");
            }
         System.out.println(" ");
        }
        
        System.out.print(" ");
        boolean bandera = false;
        int t = 0;

        for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
           int cont = 0;     
        for (int k = 0; k < 3; k++) {
        for (int l = 0; l < 3; l++) {
            if (P[k][l] == M[i + k][j + l]) {
                cont = cont + 1;
            if (cont == 9) {
  System.out.println("Hay coincidencia en la matriz M " + i + " " + j);
  bandera = true;
  
     }  
                         

                        }
                    }
                }
            }
         
            
            }
  // if ( bandera = false ){ 
   // System.out.println("No encontro ninguna matriz anidada");                        
                         // }

    }
}
    // TODO code application logic here

