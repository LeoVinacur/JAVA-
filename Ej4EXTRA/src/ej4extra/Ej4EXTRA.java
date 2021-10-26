/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extra;
import java.util.Scanner;
/**
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
public class Ej4EXTRA {

    public static String romano(int num ) {
        String letra = null;
      switch (num) {
            case 1:
                letra = "I";
                break;
                  case 2:
                letra = "II";
                break;
                  case 3:
                letra = "III";
                break;
                  case 4:
                letra = "IV";
                break;
                  case 5:
               letra ="V";
                break;
                  case 6:
                letra = "VI";
                break;
                  case 7:
                letra = "VII";
                break;
                  case 8:
               letra = "VIII";
                break;
                  case 9:
                letra = "IX";
                break;
                  case 10:
               letra = "X";
                break;
          default:
                System.out.println("No ingresó un número válido");
        }   
        return letra;
        
        
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número del 1 al 10 para mostrarlo en romanos");
        int num = leer.nextInt();
        
        System.out.println("Su número ingresado equivale a " + romano(num ) );
        
      /* 
        switch (num) {
            case 1:
                System.out.println("El número 1 equivale a I");
                break;
                  case 2:
                System.out.println("El número 2 equivale a II");
                break;
                  case 3:
                System.out.println("El número 3 equivale a III");
                break;
                  case 4:
                System.out.println("El número 4 equivale a IV");
                break;
                  case 5:
                System.out.println("El número 5 equivale a V");
                break;
                  case 6:
                System.out.println("El número 6 equivale a VI");
                break;
                  case 7:
                System.out.println("El número 7 equivale a VII");
                break;
                  case 8:
                System.out.println("El número 8 equivale a VIII");
                break;
                  case 9:
                System.out.println("El número 9 equivale a IX");
                break;
                  case 10:
                System.out.println("El número 10 equivale a X");
                break;
            default:
                System.out.println("No ingresó un número válido");
        }
        */
      
        // TODO code application logic here
    }
    
}
