/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1;
import java.util.Iterator;
import java.util.Scanner;
/**
 *1 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona
 */
public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private Perro perro;
    private String tamanio2;
  
    Perro pp = new Perro();
    

    public Persona() {
    }

    public Persona(String nombre,   int edad, int dni ) {
        this.nombre = nombre;
       // this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        //this.perro = perro;
        //this.tamanio2 = tamanio2;
    }
 
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getTamanio2() {
        return tamanio2;
    }

    public void setTamanio2(String tamanio2) {
        this.tamanio2 = tamanio2;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }

  
    public Perro crearPerro (){
        System.out.println("Ingrese un perro");
        nombre = leer.next();
        return perro;
    }
    
    public void IngresarPersona() {
        System.out.println(" ");
        System.out.println("Ingresar nombre, edad y dni de la persona interesada en adoptar");
        nombre = leer.next();
        edad = leer.nextInt();
        dni = leer.nextInt();
       
        System.out.println(" ");
      System.out.println("La persona se llama " +nombre +" de " +edad +" años"); 
        System.out.println(" ");
       
    }
 
    public String nombreAdopt () {
        return nombre;
    }
    
     
    
    public void ElegirPerroPersona (Perro perro){
        System.out.println(" ");
     System.out.println("Que tamaño quiere el perro adoptar?");
           //tamanio2 = leer.next();
          pp.setTamanio2(leer.next());
         
         System.out.println("Tamanio elegido: " + tamanio2 );//+pp.getTamanio2());
         pp.ElegirPerro();
        
      
         for (Perro aux : pp.getListadeperros()) {
             System.out.println(pp.getTamanio());
              if ( aux.getTamanio().equals(tamanio2)) {
                System.out.println("Encontramos un perro");  
            }
        }
     
    }
 
}
