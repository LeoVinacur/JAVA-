 
package coleccionesej2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 import java.util.Scanner;


public class Alumno {

  //  private static Comparator<? super String> compararNombre;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   ArrayList<Alumno> alumnos = new ArrayList ();
 
   
    private String nombre;
    public double nota1;
    public double nota2;
    public double nota3;

    public Alumno() {
    }

    public Alumno(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }

    
         public void ingresarAlumnos ( ) {
        String rta;
  
        do {  
             System.out.println("Ingrese el nombre de un alumno");
                 String nomb = leer.next();
                 nombre = nomb.toLowerCase();
             System.out.println("Ingrese las tres notas del alumno");
                nota1 = leer.nextDouble();      
               nota2 = leer.nextDouble();           
                nota3 = leer.nextDouble();
       
          alumnos.add (new Alumno(nombre, nota1, nota2, nota3));
          
         rta = null;
            System.out.println("Quiere agregar otro alumno? s / n");
             rta = leer.next();
             
             if (!rta.equals("s") && !rta.equals("n") ) {
                 System.out.println("Ingrese una respuesta válida");   
            }
          
    } while (!"n".equals(rta));
        
}
    public void MostrarAlumnos () {
        System.out.println(" ");
        System.out.println("Los alumnos ingresados son :");
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());
        }
        
        System.out.println("Cantidad de alumnos ingresados: " +alumnos.size());
        System.out.println(" ");
    }
    
     public void NotaFinal () {
        System.out.println("Ingrese un alumno para buscar su nota final");
       String buscar  = leer.next();
       boolean bandera = false;
   
         for (Alumno alumno : alumnos) {
             if (alumno.getNombre().equals(buscar)) {
                 System.out.println("Las notas del alumno " +buscar +" son: " + alumno.getNota1() +" , " + alumno.getNota2() +" y " + alumno.getNota3());
             System.out.println("El promedio final del alumno " +buscar +" es " + Math.round((alumno.getNota1()+alumno.getNota2()+alumno.getNota3())/3*100.0)/100.0);
            bandera = true;
            
             } 
        }
         if (bandera==false) {
             System.out.println("No se ha encontrado al alumno en cuestión");     
         }
    }
     
    public static Comparator<Alumno> ordenarPorNombreDesc = new Comparator<Alumno>() {
       @Override
      public int compare(Alumno o1, Alumno o2) {
       
       return o1.getNombre().compareTo(o2.getNombre());
       }
   };
      
     public void ordenar () {
     //alumnos.sort(Alumno.ordenarPorNombreDesc); // esto es lo mismo que lo de abajo
     Collections.sort(alumnos, ordenarPorNombreDesc);
      
     } 
        
}
