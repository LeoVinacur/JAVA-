/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9;
import  poo9.Matematica ; // importacion desde el main
/**
 * /// CREO QUE ESTA CLASS NO SIRVE;
 * Sirve la que esta dentro de Servicios, y se llama MatematicaServicios
 * @author 
 */
public class MatService {
    
    
       Matematica operaciones = new Matematica () ;
  
    
    public void crearNumeros ()  {
        
       
        operaciones.setNum1 ((int)(Math.random()*10 + 1));
        operaciones.setNum2 ((int)(Math.random()*10 + 1));
        
        
        
        System.out.println("el numero 1 al azar es: " +operaciones.getNum1()); 
        System.out.println("el numero 2 al azar es: " +operaciones.getNum2());
   
}
    
       public void devolverMayor(){  
         int num1 =  operaciones.getNum1();
         int num2 =  operaciones.getNum2();
                  
        if (num1 > num2) {
            System.out.println("El -" +num1 +"- es mayor que el " +num2);    
        }else 
            System.out.println("El -" +num2 +"- es mayor que el " +num1); 
           if (num1 > num2) {
             
            System.out.println("El Nº1 elevado a la potencia del Nº2 es: " +(Math.round(Math.pow(num1, num2)*100.0)/100.0));    
        }else 
            System.out.println("El Nº2 elevado a la potencia del Nº1 es: " +(Math.round(Math.pow(num2, num1)*100.0)/100.0));  
    }
       
  
}
