/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;
import static java.lang.Math.random;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class ExepcionesService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
//de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
//código con una cláusula try-catch para probar la nueva excepción que debe ser
//controlada.
   
        
           public String nombre;
             public int edad;
             public String persona;
             public int edad1;
             
             

    public ExepcionesService() {
    }

    public ExepcionesService(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
       public void mayorEdad(){
           System.out.println("Ingrese nombre de persona y edad");
          persona = leer.next();
          edad1 = leer.nextInt();
           System.out.println("Nombre: " +persona +" Edad: " +edad1);
           
}
              
         /// EJERCICIO 1
      public void CrearPersona(){
          
          try{
             System.out.println("Ingrese nombre y edad de la persona");
          nombre = leer.next();
         edad = leer.nextInt();
          
          System.out.println("La persona se llama " +nombre +" y su edad es " +edad +" años");  
          }catch(Exception e){
              System.out.println("Alguno de los valores esta mal"); 
          }
         
          // EJERCICIO 2
      }
      
      
              int[] arr = new int[5];
            
              public void LlenarArreglo (){
               try{
                  for (int i = 0; i < 5; i++) {
                 arr[i] = (int) (Math.random()*20+0);
                  }
                  for (int i = 0; i < 5; i++) {
                      System.out.println(" { " +arr[i]+" } ");    
                  }
             }  catch (ArrayIndexOutOfBoundsException e){
                   System.out.println("Metio un número de más en el Array");
                   System.out.println("El array esta inicializado con 5 espacios");
             }
                  System.out.println(" ");
              }
              
              public void Ejercicio3 (){
                  
                  String n1 ;
                  String n2;
                  int num1;
                  int num2;
                  
                  try{
                  System.out.println("Ingrese dos números");
                  n1 = leer.next();
                  n2 = leer.next();
                  System.out.println(" ");
                  System.out.println("Los números ingresados en forma de cadena son " +n1 +" y " +n2);
               num1 = Integer.parseInt(n1);
               num2= Integer.parseInt(n2);
                  System.out.println(" ");
                  System.out.println("Los números convertidos a int son " +num1 +" y " +num2);
                  System.out.println(" ");
                  System.out.println("La división del primer número por el segundo es: "  +(num1/num2));
                  }catch(InputMismatchException e){
                      System.out.println("Ha ingresado mal el número");   
                  }catch(NumberFormatException e){
                      System.out.println("La cadena no pudo ser convertida en entero"); 
                  } catch(ArithmeticException e) {
                      System.out.println("No se puede dividir por 0");
                  }catch (Exception e) {
                      
                  }
              }
              
       public void AdivinarNumero(){
         int numAleatorio = (int) (Math.random()*100+0);
           System.out.println("el número aleatorio es: " +numAleatorio); 
   
           int num;
           int intentos = 0;
           System.out.println(" ");
           System.out.println("Trate de adivinar el número");
           try{
           do {
               System.out.println("Ingrese un número");
               num = leer.nextInt();
               
               if (num== numAleatorio) {
                   System.out.println("Felicitaciones!! Ud. ha adivinado!! "); 
                   System.out.println("Su número de intentos de adivinar fue: " + intentos);
               }else 
               if (num<numAleatorio) {
                   System.out.println("El número secreto es mayor al que Ud. ingreso");
                      System.out.println("Intente nuevamente");
                      intentos = intentos+1;
               }else
               if (num>numAleatorio) {
                    System.out.println("El número secreto es menor al que Ud. ingreso");
                   System.out.println("Intente nuevamente");
               intentos = intentos+1; 
               } 
            
           } while (num!=numAleatorio);
          
           }catch(InputMismatchException e){
                      System.out.println("Ha ingresado mal el número"); 
                        intentos = intentos+1;
                  }catch( Exception e){
                      System.out.println("Ha ocurrido otro tipo de error"); 
                        intentos = intentos+1;
                  } finally {
              System.out.println("Intentos finales: " +intentos);
                  }
          
       }
       
}
   
    
    
 