/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3extra;
import java.util.Scanner;
/**
 *3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String. 
 */
public class Ej3EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        
        switch (letra) {
           
                   case "a":
                System.out.println("Es una vocal");
                break;
                   case "e":
                System.out.println("Es una vocal");
                break;
                   case "i":
                System.out.println("Es una vocal");
                break;
                   case "o":
                System.out.println("Es una vocal");
                break;
                   case "u":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");;
        }
        
        
        
        // TODO code application logic here
    }
    
}
