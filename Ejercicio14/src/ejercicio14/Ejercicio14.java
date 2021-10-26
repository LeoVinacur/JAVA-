/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import java.util.Scanner;

/**
 14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 

 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in) ;
        System.out.println("Ingrese un número que será el límite de la suma");
        int num1 = leer.nextInt ();
        int num;
        int i=0;
        
        do {       
            System.out.println("Ingrese un número que será el límite de la suma");
           num = leer.nextInt ();   
           i=i+num;
        } while (i<num1);
            
            
        
        
        
        // TODO code application logic here
    }
    
}
