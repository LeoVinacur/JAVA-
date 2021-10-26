 
package pooextra1;
import java.util.Scanner;
/**
 1 EXTRA Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes
* 
* ACLARACION: Preferí hacerlo con atributos públicos, y poder indexar muchas canciones
 */
public class POOEXTRA1 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       // Canciones cancion = new Canciones ();
        
       System.out.println("Ingrese la cantidad de canciones que desea ingresar");
        int numero = leer.nextInt();
        String titulo;
        String autor;
        
        Canciones [] cancion = new Canciones [numero] ;
        
        for (int i = 0; i < numero; i++) {
  
        System.out.println("Ingrese el título de una canción");
       // cancion[i].setTitulo(leer.next());
        titulo=leer.next();
        System.out.println("Ingrese el autor de la canción");
       // cancion[i].setAutor(leer.next());
        autor=leer.next();
        System.out.println(" ");
        cancion[i] = new Canciones (titulo,autor );
        }
        
        for (int i = 0; i < numero; i++) {
          cancion[i].mostrarCancion();  
        }
       
       
       
        // TODO code application logic here
    }
    
}
