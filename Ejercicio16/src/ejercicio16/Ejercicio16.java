/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;
import java.util.Scanner;

/**
 16. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sca = new Scanner(System.in);
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         int num;
         int suma = 0;
         int cont = 0;
          
        do {
            System.out.println("Escriba un número");
            num = leer.nextInt();
            cont = (cont+1);
            if (num >0 ) {
               suma = (suma + num);
            }
            if   (num == 0) { 
                   System.out.println("Se capturó el número 0");
              break;
            }  
            
        } while (cont<20);
        
        System.out.println("La suma de todos los números ingresados es " +suma);
  

                 
                 
        // TODO code application logic here
    }
    
}
