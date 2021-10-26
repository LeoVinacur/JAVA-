/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg2.extra;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class Ej2EXTRA {

    /**
  2 EXTRA  Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // TODO code application logic here
          int aux = 0;
        System.out.println("Ingrese 4 números enteros");
      
        int A = leer.nextInt();
        int B = leer.nextInt();
        int C = leer.nextInt();
        int D = leer.nextInt();
        
        System.out.println("Los números son: " +A +" " +B +" " +C +" "+D);
//*B tome el valor de C, C tome el valor de A, 
        //A tome el valor de D y D tome el valor de B.   *//    
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux ;
        
      System.out.println("Los números con valor cambiado son: " +A +" " +B +" " +C +" "+D);   
        
             
        
        
    }
    
}
