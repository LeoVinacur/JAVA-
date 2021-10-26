/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej2;
import java.util.ArrayList;
import java.util.Collections;
 import java.util.Comparator;
import java.util.Scanner;
/**
 * EJERCICIO TRES
 Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.  NO LO HICE CON INTEGER PORQUE SALE REDONDEADO EL PROMEDIO
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main. 
 */
public class ColeccionesEJ2 {
 
    public static void main(String[] args) {
      //  Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      
        Alumno a = new Alumno ();
       
       /// ArrayList<Alumno> alumnos = new ArrayList (); 
        
        a.ingresarAlumnos();
        
        a.MostrarAlumnos();
        
        a.NotaFinal();
        
       
         a.MostrarAlumnos();
         System.out.println("ordenar abajo");
          a.ordenar();
         
          a.MostrarAlumnos();
        // TODO code application logic here
    }
    
}
