 
package pooextra1;
import java.util.Scanner;
 
public class Canciones {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String titulo;
   public  String autor;

    public Canciones() {
    }

    public Canciones(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void mostrarCancion(){
        
        System.out.println("El autor de la canción -" +titulo +"- es el autor " +autor);
     ;
        
    }
    
}
