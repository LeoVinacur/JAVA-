/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *1Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona
 */

public class Perro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    public String tamanio2 ;
    public String nombreAdoptante;
  
    ArrayList<Perro> listadeperros = new ArrayList ();
      //Persona ppp = new Persona();  /// ESTO ME DA ERROR
 
     
    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamanio  ) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;    
    }

    public ArrayList<Perro> getListadeperros() {
        return listadeperros;
    }

    public void setListadeperros(ArrayList<Perro> listadeperros) {
        this.listadeperros = listadeperros;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTamanio2() {
        return tamanio2;
    }

    public void setTamanio2(String tamanio2) {
        this.tamanio2 = tamanio2;
    }
 
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }

    public Perro(String nombreAdoptante) {
        this.nombreAdoptante = nombreAdoptante;
    }

 
    public void NombreAdoptante (String nn){
        nombreAdoptante = nn;
    }
            
    public void ingresarPerros(){
          String rta;
  
        do {
                    
        System.out.println("Ingresar nombre, raza, edad y tamaño de un perro");
         nombre = leer.next();
         raza= leer.next();
         edad  = leer.nextInt();
         tamanio = leer.next();
        listadeperros.add (new Perro(nombre, raza, edad ,tamanio )); 
       
         rta = null;
            System.out.println("Quiere agregar otro perro? s / n");
             rta = leer.next();
             
             if (!rta.equals("s") && !rta.equals("n") ) {
                 System.out.println("Ingrese una respuesta válida");   
            }
          
    } while (!"n".equals(rta));
    }
    
    public void MostrarPerro (){
       System.out.println("Listado de Perros en Adopcion ");
        for (Perro aux : listadeperros) {
            System.out.println(aux.toString());        
        }
        for (Perro aux2 : listadeperros) {
            System.out.println("Tamaños que hay: " + aux2.getTamanio()); 
            System.out.println(" ");
        }     
    }
    
    public void ElegPerro (){
         System.out.println("El tamaño elegido por el usuario ees: " + tamanio2); 
     for (Perro aux2 : listadeperros) {
            System.out.println("Tamaños que hay en ElegPerro: " + aux2.getTamanio());
        
        }
        for (Perro listadeperro : listadeperros) {
            if (listadeperro.getTamanio().equals(tamanio2)) {
                System.out.println("Encontramos un perro");  
            }
        }      
    }
   
    public void ElegirPerro (){
     Persona ppp = new Persona();
     String NomUsuario = ppp.getNombre();
//        System.out.println(NomUsuario);
//        System.out.println(ppp.getNombre().toString());
        System.out.println("Que tamaño de perro quiere");
        String tamanio2 = leer.next();
    System.out.println("El tamaño elegido por el usuario ees: " + tamanio2); 
 //
     System.out.println("Listado de Perros en Adopcion ");
        for (Perro aux : listadeperros) {
            System.out.println(aux.toString());
            System.out.println(aux.getListadeperros().toString());
        }
//        for (Perro aux2 : listadeperros) {
//            System.out.println("Tamaños que hay: " + aux2.getTamanio()); 
//        }
     //  
     
         for (Perro listadeperro : listadeperros) {
            if (listadeperro.getTamanio()==(tamanio2)) {
                System.out.println("Encontramos un perro");  
            }
        }
         
     for (Perro aux : listadeperros) {   
         if (aux.getTamanio().equals(tamanio2)) {
             System.out.println("nombre del usuario " + nombreAdoptante);
          System.out.println("El perro que va a adoptar es " +aux.getNombre());        
            }
  
        } 
    }
  
}
