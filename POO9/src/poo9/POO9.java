/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9;
import java.util.Scanner;
 
/**
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class POO9 {
 
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    
       
        
      // Matematica oper = new Matematica () ; esto llama desde entidad
        MatService op  = new MatService() ; /// esta llama desde servicio
        
      //  System.out.println("el numero 1 al azar es: " +oper.getNum1()); // esto llama desde entidad
       
     //   System.out.println("el numero 2 al azar es: " +oper.getNum2()); // esto llama desde entidad
         
        
        op.crearNumeros();
        
      
        System.out.println(" ");
        op.devolverMayor();   
        System.out.println("");
       // op. calcularPotencia();
        //System.out.println(" "); 
         //operaciones.calcularPotencia();
         // System.out.println(" "); 
        //  operaciones.calculaRaiz();
        // TODO code application logic here
    }
    
}
