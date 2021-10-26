/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;
import java.util.Scanner ;
/**
 *19. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int num;
        System.out.println("Escriba un número para hacer un cuadrado de *");    
       num = leer.nextInt (); 
       
         for (int i = 1; i <= num ; i++) {
         for (int j = 1; j <=num ; j++) {
           if (i>1 && i<num && j>1 && j<num)
                 System.out.print(" ");
           else 
                 System.out.print("*");
            
            }
             System.out.println(" ");  
        }
        
        
        // TODO code application logic here
    }
    
}
