/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;
import java.util.Scanner;
/**
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
public class POO2 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Circunsferencia c1  =  new Circunsferencia ();
       
       
         System.out.println("Ingrese radio");
         
        c1.setRadio(leer.nextInt())  ;
        
        System.out.println("El radio ingresado es: " +c1.getRadio());
        
            System.out.println("El área de la circunferencia es: " +c1.area());
        
        System.out.println("El perímetro de la circunferencia es: " +c1.perimetro());
      
        
    }
    
}
