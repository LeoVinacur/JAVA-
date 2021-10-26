/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;
import java.util.Scanner;
/**
 13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in) ;
       int num ;
       do {
        System.out.println("Ingrese una nota entre 0 y 10");
            num = leer.nextInt ();
        if (num <=10 && num >=0){ 
               System.out.println("La nota es correcta");
        }
        if (num >=10 || num <=0){
           System.out.println("Ingrese una nota correcta");
        }
       } while (num >=10 ||  num <=0);
              
    }
}
               
 

