/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5extra;
import java.util.Scanner;
/**
5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
 */
public class Ej5EXTRA {

    public static double ttt(String cat , double valor) {
       double total=0;
       
        switch (cat) {
            case "A":
                total = valor * 0.5;
                break;
           case "B":
                total = valor * 0.65;
                break;
            case "C":
                total = valor * 1;
                break;         
       }
        //double r = total;
        return total;
        
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // TODO code application logic here
        System.out.println("Ingrese que tipo de socio es, A, B, C");
        String cat = leer.nextLine();
        System.out.println("Ingrese el valor del tratamiento");
        double valor = leer.nextInt();
        
        System.out.println("El valor a pagar por el tratamiento es: " +ttt( cat ,  valor) );
        // double  total  =  ttt( cat ,  valor);
    }
    
}
