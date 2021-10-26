/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;
import java.util.Scanner;
/**
 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
public class POO4 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo r1  =  new Rectangulo();
        
        System.out.println("Ingrese base");       
        r1.setBase(leer.nextInt()) ;
           System.out.println("Ingrese altura");       
        r1.setAltura(leer.nextInt()) ;
        
        System.out.println("El área del rectángulo es: " +r1.area());
        System.out.println("El perímetro del rectángulo es: "+r1.perimetro());
        System.out.println(" ");
        
        r1.imprimirRectangulo(); //metodo customer
        
 
    }
    
}
