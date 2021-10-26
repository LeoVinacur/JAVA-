    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libropoo1;
 
public class Libro {
 //: ISBN, Título, Autor, Número de páginas,  
    public String nombre;
    public String Titulo;
    public String ISBN;
    public String paginas;

    public Libro(String Autor, String Titulo, String ISBN, String paginas) {
        this.nombre = Autor;
        this.Titulo = Titulo;
        this.ISBN = ISBN;
        this.paginas = paginas; 
    }
    
    
   public Libro (){
           
 }  
}
