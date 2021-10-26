/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.Scanner;


/**
 * 24 -Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
* yo me apoyé en una variable auxiliar para ir convirtiendo cada elemento a String a medida que los ingresaba. Luego, según la longitud de cada numero (aux.length()) aumentaba la variable acumulativa de cada número.
Es decir, definí un vector de tipo entero, con un bucle fui completando sus posiciones y mediante una variable auxiliar fui contando la longitud de cada número y usando ese resultado en un switch.

 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in) ;
         
         int [] vector = new int [50];
         String cadena  ;
         int cont1 =0;
         int cont2 =0;
         int cont3 =0;
         int cont4 = 0;
         
         for (int i = 0; i < 50; i++) {
            vector [i] = (int) (Math.random()*3000+1);
           // cadena = String.valueOf(vector [i]);
        System.out.println( vector[i] +" ");
            if (Integer.toString(vector [i]).length() == 1)
            cont1 = cont1+1    ; 
             if (Integer.toString(vector [i]).length() == 2)
            cont2 = cont2+1;
           if  (Integer.toString(vector [i]).length() == 3)
            cont3 = cont3+1;
           if (Integer.toString(vector [i]).length() == 4)
            cont4 = cont4+1;
                
            }
           System.out.println("La cantidad de números de 1 dígito son: " +cont1);
            System.out.println("La cantidad de números de 2 dígitos son: " +cont2);
             System.out.println("La cantidad de números de 3 dígitos son: " +cont3);
              System.out.println("La cantidad de números de 4 dígitos son: " +cont4);
        }

      {
         
    }
                 
                  
         
         
         
         
  
         
     
    }
   
    

