/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1bis;
import java.util.Scanner;
/**
 *
 
 */
public class RelacionesEJ1BIS {

     
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
       
       Persona per1 = new Persona ("Luis" , "Martinez" , 48 , 22645998 );
       Persona per2 = new Persona ("Esteban" , "Alcohete" , 65 , 5647559 );
       Perro p1 = new Perro ("Mapu" , "Setter" , 13 , "grande");
       Perro p2 = new Perro ("Choqui" , "Callejero" , 15 , "chico");
       
       per1.setPerro(p1);
       per2.setPerro(p2);
       
        System.out.println(per1.toString());
        System.out.println(" ");
        System.out.println(per2.toString());
        // TODO code application logic here
    }
    
}
