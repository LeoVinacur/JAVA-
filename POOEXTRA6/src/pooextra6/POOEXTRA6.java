
package pooextra6;
import java.util.Scanner;
/**
 *Ej. 6 Exra: El Ahorcado
 */
public class POOEXTRA6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        Ahorcado juego = new Ahorcado ();
        
        // System.out.println("Ingrese una frase para jugar a El ahorcado");
       // juego.setFrase(leer.next()) ;
       //String frase = leer.next().toLowerCase();
        
        
        juego.CreaFrase(); 
   
        // TODO code application logic here
    }
    
}
