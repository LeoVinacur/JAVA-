/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6extra;
import java.util.Scanner;
/**
 *6. Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Ej6EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese las estaturas de 10 personas");
       
        double cont1 = 0.0;
        double cont2 = 0.0;
        double altura;
        int cont3 = 0;
                
        for (int i = 0; i < 10; i++) {
            altura = leer.nextDouble();
            cont1 = cont1 + altura;
            if (altura <= 1.60) {
             cont2 = cont2 + altura;  
             cont3 = cont3 +1;
            }
        }
        System.out.println("La cantidad de personas que miden menos de 1.60 es " +cont3);
        System.out.println("El promedio de alturas por debajo de 1.60 es: " +Math.round(cont2/cont3*100.0)/100.0 );
        System.out.println("El promedio de alturas total, es: " +cont1/10);
        
        
        // TODO code application logic here
    }
    
}
