/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1;
 

/**
 *1 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona
 */
public class RelacionesEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
               
        Persona per1 = new Persona();
          Perro p1 = new Perro ( );
    
        p1.ingresarPerros();
       p1.MostrarPerro();
        System.out.println(" ");
       per1.IngresarPersona();
        per1.nombreAdopt();
 
        System.out.println(" ");
        System.out.println("Elegir Perro dentro de Perro");
        p1.ElegirPerro();
        System.out.println(" ");
   
    }
    
}
