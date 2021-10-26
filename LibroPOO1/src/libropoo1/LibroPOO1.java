/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libropoo1;
 import java.util.Scanner;

/**
 *1- Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 * 
 */
public class LibroPOO1 {

    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
        System.out.println("Ingrese Nombre del libro");
        System.out.println("autor, ISBN, cantidad de páginas");
        Libro l1 = new Libro ( leer.next(), leer.next(),leer.next(),leer.next());
        
        System.out.println("Ingrese Nombre del libro");
        System.out.println("autor, ISBN, cantidad de páginas");
        Libro l2 = new Libro ( leer.next(), leer.next(),leer.next(),leer.next());
        
        System.out.println(l1.Titulo+" "  +l1.nombre +" " +l1.ISBN + " " +l1.paginas);
        System.out.println(l2.Titulo+" "  +l2.nombre +" " +l2.ISBN + " " +l2.paginas);
        // TODO code application logic here
    }
    
}
