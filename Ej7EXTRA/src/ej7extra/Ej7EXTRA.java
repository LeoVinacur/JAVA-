/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7extra;
import java.util.Scanner;
/**
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */
public class Ej7EXTRA {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Primero vamos a usar el WHILE (solo) ");
        System.out.println("Ingrese la cantidad de números que desea analizar");
        int n = leer.nextInt();
        int i = 0;
        int num = 0;
        int contmax = 0;
        int contmin = 100;
        double total = 0;
        
         System.out.println("Ingrese uno a uno, los números");
         
        while (i<n) { 
            
            for (int j = 0; j < n; j++) {
              num = leer.nextInt();
               total = total+num;
               i=i+1;
              
                if (num > contmax) {
                   contmax = num;
                  
                if (num < contmin)
                    contmin = num;
                 
                
                   
                }
            } 
        }
        
        System.out.println("El número menor ingresado fue: " +contmin);
        System.out.println("El número mayor ingresado fue: " +contmax);
        System.out.println("El promedio de todos los números ingresados fue: " +(total/n));
        // TODO code application logic here
       /////////////////////////////////////////////////////////////////
       
        System.out.println("Ahora vamos a hacer lo mismo, pero con DO WHILE");
           System.out.println("Ingrese la cantidad de números que desea analizar");
       i = 0;
          num = 0;
         contmax = 0;
        contmin = 100;
        total = 0;
         do {
           System.out.println("Ingrese uno a uno, los números");
           
             for (int j = 0; j < n; j++) {
              num = leer.nextInt();
               total = total+num;
               i=i+1;
            
                if (num > contmax) {
                   contmax = num;
                   
                if (num < contmin)
                    contmin = num;
                 
                }
            } 
          
        } while (i<n);
        System.out.println("El número menor ingresado fue: " +contmin);
        System.out.println("El número mayor ingresado fue: " +contmax);
        System.out.println("El promedio de todos los números ingresados fue: " +(total/n));
        
        
        
    }
    
}
