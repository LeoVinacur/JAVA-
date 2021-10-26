/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;
import java.util.Scanner;
/**
23 - Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        int [] vector = new int[40];
        
        for (int i = 0; i < 40; i++) {
             vector[i]   = (int) (Math.random()*20+1);  
            
        }
        for (int i = 0; i < 40; i++) {
             System.out.println(vector[i]);     
        }
        
        System.out.println("Escribir un número entre 1 y 20 para encotrar");
        int num   = leer.nextInt ();
        int cont = 0;
        
        for (int i = 0; i < 40; i++) {
            if (num == vector[i]) {
             
                System.out.println("El número esta en la posición " +i);
                cont = cont+1;
           }
            
        }
    System.out.println("La cantidad de veces de su número encontrado es: " +cont);
        
        // TODO code application logic here
    }
    
}
