/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extraabstract;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author mzeballos
 */
public class Polideportivo extends Edificio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected String nombre;
    protected boolean techado;
        
 
    
    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado) {
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(nombre, ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

  public void Techados(){
      
      System.out.println("El polideportivo es techado? s/n");
      String rta = leer.next();
      if (rta.equals("s")) {
      techado = true;   
      } else
      techado = false;    
  }
  
  ArrayList<Edificio> polideportivo = new ArrayList (); 
 
    @Override
    public void calcularSuperficie() {
        System.out.println("Ingrese que tipo de edificio es?");
        nombre = leer.next();
         System.out.println("Ingrese el ancho, el largo y el alto del edificio"); 
       ancho = leer.nextDouble();
       largo = leer.nextDouble();
       alto = leer.nextDouble();
        System.out.println("La superficie del Polideportivo es: " +ancho*largo +" metros cuadrados");
     
        polideportivo.add (new Polideportivo(nombre, techado, ancho, alto, largo));
    
    }
 
    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivo es: " +ancho*alto*largo + " metros cúbicos");       
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "tipoEdificio=" + nombre + " -- Metros cuadrados " +ancho*largo +'}';
    }

    
   public void MostrarArray (){
       
       for (Edificio edificio : polideportivo) {
           System.out.println(edificio.toString());
       }
   }
 
    
}
