/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo12;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
 
public class PersonaDate {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Scanner sc = new Scanner(System.in);  //esto es nuevo
     
    LocalDate fechaDeHoy;
     private String nombre;
     private LocalDate nacimiento;
     private int otraEdad;
     private boolean bandera;
      

    public PersonaDate() {
       // this.fechaDeHoy = new LocalDate ();
    }

    public PersonaDate(String nombre, LocalDate nacimiento, int otraEdad) {
      //  this.fechaDeHoy = new LocalDate ();
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.otraEdad = otraEdad;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public LocalDate getFechaDeHoy() {
        return fechaDeHoy;
    }

    public void setFechaDeHoy(LocalDate fechaDeHoy) {
        this.fechaDeHoy = fechaDeHoy;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getOtraEdad() {
        return otraEdad;
    }

    public void setOtraEdad(int otraEdad) {
        this.otraEdad = otraEdad;
    }
    
    public LocalDate fechaNacimiento () {
        System.out.println("Ingrese la Fecha de Nacimiento de " +nombre);
        System.out.println("Ingrese un dia(2 digitos)");   
        byte diaI = sc.nextByte();
        System.out.println("Ingrese un mes(2 digitos)");   
        byte mesI = sc.nextByte();
        System.out.println("Ingrese un año(4 digitos)");   
        int anioI = sc.nextInt();
       LocalDate fechaI= LocalDate.of(anioI, mesI, diaI); 
        return fechaI;
    } 
     
    public void calcularEdad() {
        
       LocalDate fechaHoy = LocalDate.now();
         
        Period periodoT = Period.between( nacimiento , fechaHoy );
        System.out.println("\n La edad de " +nombre +" es " + periodoT.getYears()) ; 
    }
     
     public void menorQue() {
         LocalDate fechaHoy = LocalDate.now();
          Period periodoT = Period.between( nacimiento , fechaHoy );
           boolean bandera = false;
           
         if ( otraEdad >= periodoT.getYears() ) {
             System.out.println("La otra edad ingresada es mayor");
             bandera = false;
         }else
             System.out.println("La otra edad ingresada es menor");
             bandera = true;
      System.out.println("Método Boolean verdadero/falso ------>" +bandera);
     }
}
