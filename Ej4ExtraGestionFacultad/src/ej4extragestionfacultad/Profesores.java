/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extragestionfacultad;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class Profesores extends Empleado {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected String curso;

    public Profesores() {
    }

    public Profesores(String curso) {
        this.curso = curso;
    }

    public Profesores( String Nombre, Integer DNI, String EstadoCivil , Integer anioIncorp, Integer despacho, String curso) {
        super(anioIncorp, despacho, Nombre, DNI, EstadoCivil);
        this.curso = curso;
    }
    
      
  
   // Persona p = new Persona();
     // Empleado e = new Empleado();
      
        ArrayList<Profesores> profes = new ArrayList ();

    public void IngresoEmpleado (){
        System.out.println("Ingreso de empleados"); 
        String rta;
        
        do {
     
        System.out.println("Ingrese nombre");
             Nombre = leer.next() ;
            System.out.println("Ingrese DNI");
             DNI = leer.nextInt();
            System.out.println("Ingrese Estado Civil");
            EstadoCivil = leer.next();
            System.out.println("Ingrese anio de incorporacion");
            anioIncorp = leer.nextInt();
             System.out.println("Ingrese Despacho en donde trabaja");
            despacho =leer.nextInt();
             System.out.println("Ingrese la materia que dicta");
             curso = leer.next();
    
   profes.add (new Profesores(Nombre, DNI, EstadoCivil, anioIncorp, despacho , curso));
   
     rta = null;
            System.out.println("Quiere agregar otra empleado? s / n");
             rta = leer.next();
             
             if (!rta.equals("s") && !rta.equals("n") ) {
                 System.out.println("Ingrese una respuesta válida");   
            }
          
    } while (!"n".equals(rta));
    }

    @Override
    public String toString() {
        return "Profesores{" + "Nombre=" + Nombre+  ", DNI= " + DNI + " Estado Civil= " + EstadoCivil + ", Despacho= " +despacho+ ", Materia que dicta= " + curso + '}';
    }


    public void MostrarArray (){
        for (Profesores profe : profes) {
            System.out.println(profe.toString());
        }
     
}
 public void CambiarEstadoCivil (){
     
        System.out.println("Ingrese el nombre de la persona que quiera cambiar el estado civil"); 
     String rta = leer.next();
     System.out.println("Ingrese el nuevo Estado Civil");
            String EstCivil = leer.next();
            
            for (Profesores profe : profes) {
                if (profe.getNombre().equals(rta)) {
                  profe.setEstadoCivil(EstCivil);  
                }
                
     }
   
 }
     
     
    
   
}
