/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;
import java.util.Scanner ;
/**
 *5. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class Ejercicio15 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //  Scanner leer = new Scanner(System.in) ;
         Scanner sca = new Scanner(System.in);
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
                 
        System.out.println("Ingrese dos números para hacer operaciones matemáticas");
        double num1 = leer.nextInt ();
        double num2 = leer.nextInt ();
         int opcion;
         String rta = " ";
                 
             do {
        System.out.println("Que operación matemática quisiera hacer? 1=sumar; 2=restar; 3=multiplicar; 4=dividir; 5=SALIR ");
          opcion = leer.nextInt ();
          double suma = num1 + num2; 
          double resta = num1 - num2;
          double division = num1 / num2;
          double multiplicacion = num1 * num2;
      
                switch (opcion){   
               case 1: 
                    System.out.println("La suma de los números es: " + suma);
                  break;                 
                case 2:
                 System.out.println("La resta de los números es: " + resta);
                    break;
                case 3:
                    System.out.println("La multiplicación de los números es; " + multiplicacion);
                    break;
                case 4: 
                    System.out.println("La división de los números es: " + division);
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? si / no");
                   
                      rta = leer.next();
                      
                     if (rta.equals ("si"))                 
                         System.out.println("Ud. ha salido del menú"); 
                       
             }   
              } while (rta.equals ("no") || opcion !=5 );
           
     
        }  
    
}
