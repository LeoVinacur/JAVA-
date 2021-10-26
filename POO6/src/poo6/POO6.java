/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;
import java.util.Scanner;
/**
6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
18
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class POO6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cafetera caf = new Cafetera();
        
        System.out.println("Cual es la capacidad máxima de la cafetera en ml?");
        caf.setCapacidadmax(leer.nextInt()) ;
        System.out.println("Cual es la capacidad actual de la cafetera en ml?");
        caf.setCapacidadactual(leer.nextInt());
          
        caf.servir() ;
       
        System.out.println("Quiere agregar café? Cuanto desea agregar?");
        caf.setAgregar(leer.nextInt());
        System.out.println("Ahora la capacidad actual de la cafetera es: " +caf.getAgregar());
        System.out.println("Quiere llenar la cafetera? Ahora la capacidad es: " +caf.getCapacidadmax() +" ml");
        System.out.println("Quiere vaciar la cafetera? Ahora la capacidad es: 0 ml");
        // TODO code application logic here
        
         
    }
    
}
