/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9;
import java.util.Scanner;
 
 
public class Matematica {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int num1;
    private int num2;

    public Matematica() {
    }

    public Matematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void devolverMayor(){
      
        if (num1 > num2) {
            System.out.println("El -" +num1 +"- es mayor que el " +num2);    
        }else 
            System.out.println("El -" +num2 +"- es mayor que el " +num1);       
    }
   
    public void calcularPotencia(){
         if (num1 > num2) {
             
            System.out.println("El Nº1 elevado a la potencia del Nº2 es: " +(Math.round(Math.pow(num1, num2)*100.0)/100.0));    
        }else 
            System.out.println("El Nº2 elevado a la potencia del Nº1 es: " +(Math.round(Math.pow(num2, num1)*100.0)/100.0));  
        
    }
    
    public void calculaRaiz() {
        if (num1 > num2) {
            // Math.sqrt(num2)
            System.out.println("La raíz cuadrada del número más chico es: " +(Math.round(Math.sqrt(num2)*100.0)/100.0));    
        }else 
            System.out.println("La raíz cuadrada del número más chico es: " +(Math.round(Math.sqrt(num1)*100.0)/100.0));   
    }
    
}
    