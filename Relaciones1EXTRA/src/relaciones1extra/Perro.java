/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones1extra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class Perro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
     ArrayList<Perro> perr = new ArrayList ();
    
    private String nombrePerro;
    private String tamanio;

    public Perro() {
    }

    public Perro(String nombrePerro, String tamanio) {
        this.nombrePerro = nombrePerro;
        this.tamanio = tamanio;
    }

    public ArrayList<Perro> getPerr() {
        return perr;
    }

    public void setPerr(ArrayList<Perro> perr) {
        this.perr = perr;
    }
 
    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" +  "Nombre del perro: " + nombrePerro + " , tamaño: " + tamanio + '}';
    }
   
    public void IngresoPerros (){
        System.out.println(" ");
        System.out.println("Ingreso de Perros"); 
        String rta;
        
        do {
     
        System.out.println("Ingrese nombre");
             nombrePerro = leer.next() ;
            System.out.println("Ingrese tamaño");
             tamanio = leer.next();
            
    
   perr.add (new Perro(nombrePerro, tamanio));
   
     rta = null;
            System.out.println("Quiere agregar otra perro? s / n");
             rta = leer.next();
             
             if (!rta.equals("s") && !rta.equals("n") ) {
                 System.out.println("Ingrese una respuesta válida");   
            }
          
    } while (!"n".equals(rta));
    }
 public void MostrarPerros (){
     System.out.println(" ");
     System.out.println("Los perros disponibles son:");
     for (Perro perro : perr) {
         System.out.println(perro); 
     }   
 }   
 
       String rta;
    

    public String getRta() {
        return rta;
    }

    public void setRta(String rta) {
        this.rta = rta;
    }
    
    public String nombrePerroAdoptado(){
        System.out.println(rta);
        return rta;
    }

 // Persona tt = new Persona();
    
 public void AdoptarPerro (){
     System.out.println(" ");
     System.out.println("Que perro quiere adoptar?");
     rta = leer.next();
    // tt.setPerro(rta);
     
     for (Perro perro : perr) {
         if (perro.getNombrePerro().equals(rta)) {
             System.out.println("Ud. va a adoptar a " + rta);  
            
         }   
     }
    Iterator<Perro> iterator = perr.iterator();
        while(iterator.hasNext())
{
    Perro perr = iterator.next();
     if (perr.getNombrePerro().equals(rta)) {
    {
        iterator.remove();
        break;
    }
}
    // System.out.println("La nueva lista de perros para adoptar");
        
    }   
 }
 
}
