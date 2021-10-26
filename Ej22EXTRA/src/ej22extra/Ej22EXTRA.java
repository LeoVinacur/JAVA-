/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej22extra;
import java.util.Scanner;
/**
22 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random(). 
 */
public class Ej22EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);    //.useDelimiter("\n");
        
        int[][] M = new int[20][20];
        
        System.out.println("Ingrese palabras para la sopa de letras");
        
        for (int i = 0; i < 1; ) {
            for (int j = 0; j < 20; j++) {
                M [i][j] =  leer.next().charAt(j);
            }
    
        }
        for (int i = 0; i < 20; ) {
            for (int j = 0; j < 20; j++) {
                System.out.println(M [i][j]);
            }
    
        }
        // TODO code application logic here
    }
    
}
