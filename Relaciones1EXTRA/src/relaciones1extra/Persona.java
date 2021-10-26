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
 * @author mzeballos
 */
public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    private Integer edad;
    private String perro;
//    private Perro perrro;
//    
//    public Perro getPerrro() {
//return perrro;
//}
//public void setPerrro(Perro perrro){
//this.perrro = perrro;
//}

    public String getPerro() {
        return perro;
    }

    public void setPerro(String perro) {
        this.perro = perro;
    }
    
    

    public Persona() {
    }

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ArrayList<Persona> getPers() {
        return pers;
    }

    public void setPers(ArrayList<Persona> pers) {
        this.pers = pers;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre= " + nombre + " - Edad= " +edad +'}';
    }
    
    

      ArrayList<Persona> pers = new ArrayList ();
 
 public void IngresoPersonas (){
        System.out.println("Ingreso de Personas"); 
        String rta;
        
        do {
     
        System.out.println("Ingrese nombre");
             nombre = leer.next() ;
            System.out.println("Ingrese edad");
             edad = leer.nextInt();
            
    
   pers.add (new Persona(nombre, edad));
   
     rta = null;
            System.out.println("Quiere agregar otra persona? s / n");
             rta = leer.next();
             
             if (!rta.equals("s") && !rta.equals("n") ) {
                 System.out.println("Ingrese una respuesta válida");   
            }
          
    } while (!"n".equals(rta));
    }
 public void MostrarPersonas (){
     System.out.println(" ");
     System.out.println("Las personas interesadas son: ");
     for (Persona per : pers) {
         System.out.println(per);   
     }
     
 }   
  //Perro pp = new Perro();
 
 
    String rta;
 public void QuienAdopta (){
     System.out.println(" ");
     System.out.println("Que persona quiere adoptar un perro?");
     rta = leer.next();
     
     for (Persona aux : pers) {
         if (aux.getNombre().equals(rta)) {
          //   System.out.println("Ud. va a adoptar a " + rta);  
         //   pers.remove(rta);
         }   
     }
    Iterator<Persona> iterator = pers.iterator();
        while(iterator.hasNext())
{
    Persona pers = iterator.next();
     if (pers.getNombre().equals(rta)) {
    {
        iterator.remove();
        break;
    }
}
    // System.out.println("Las personas restantes que quieren adoptar un perro son: ");
        
    }   
 }
 
// public void Resultado (){
//     System.out.println(" ");
//     System.out.println(rta + " va a adoptar a " + perro + pp.getRta() + pp.rta + pp.nombrePerroAdoptado());
//     
// }
// 
}
 