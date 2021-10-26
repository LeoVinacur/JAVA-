
package poo8;
import java.util.Scanner;
/**
 8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class POO8 {
 
   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
      
        Cadena frase1 = new Cadena();  
        Cadena frase2 = new Cadena();
        Cadena comparar = new Cadena ();
        String letra;
        
        System.out.println("Ingrese una frase");
        frase1.setTexto1(leer.next());
        frase1.setS1(frase1.getTexto1());
             
        System.out.println("Ingrese otra frase");
        frase2.setTexto1(leer.next());
        frase1.setS2(frase2.getTexto1());
        
        System.out.print("En la frase 1 "); frase1.mostrarVocales();
        System.out.print("En la frase 2 "); frase2.mostrarVocales(); 
        System.out.println(" ");
        System.out.print("Frase 1 invertida: ");frase1.invertir();
        System.out.print("Frase 2 invertida: ");frase2.invertir(); 
        System.out.println(" ");
        System.out.println("Ingrese una letra para buscar en la frase 1");
         frase1.setLetra(leer.next());
        System.out.println("Ingrese una letra para buscar en la frase 2");
         frase2.setLetra(leer.next());
        System.out.println(" ");
 
        System.out.println("En la frase 1 " ); frase1.mostrarLetra();
        System.out.println("En la frase 2 " ); frase2.mostrarLetra();
   
        System.out.println(" ");
  
          frase1.compararFrase();          
        System.out.println(" ");
      
        frase1.concatenarFrase();
          System.out.println(" ");
        System.out.println("Ingrese un símbolo para reemplazar en las frases");
         frase1.setSimbolo(leer.next());
          frase1.reemplazarLetra();
          System.out.println(" ");
          
          frase1.contieneLetra();
          frase2.contieneLetra();
       
       //  TODO code application logic here
    }
 
    
    
}
