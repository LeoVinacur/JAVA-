/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9extra;
import java.util.Scanner;
/**
9. Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3
 */
public class Ej9EXTRA {

    public static int[] division(int num1 , int num2) {
        int cont = 0;
        int n1 = 0;
        int n2 = 0;
        int[] vector = new int[2];
         
        do {
         
          n1 =  num1 - num2;
          num1 = n1;
         cont=cont+1;
         
        } while (n1>num2);
        
        vector[0] = n1;
        vector[1] = cont;
                
        
        int [] resultado = {n1 , cont};
      return resultado;
        
    }
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
   System.out.println("Ingrese dos números mayores que 0, el primero mayor que el segundo");
        int num1  = leer.nextInt();  
        int num2 = leer.nextInt();  
        
        
        
        System.out.println("El resuido de la división es: " +division( num1 , num2)[0] +" y el cociente es: " +division( num1 , num2)[1] );
         
       
       
       
        // TODO code application logic here
    }
    
}
