/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extraabstract;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class EdificioDeOficinas extends Edificio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected int pisos;
    protected int personas;
    protected int oficinas;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(String nombre ,int pisos, int personas, int oficinas) {
        this.pisos = pisos;
        this.personas = personas;
        this.oficinas = oficinas;
        this.nombre = nombre;
    }

    public EdificioDeOficinas(String nombre, int pisos, int personas, int oficinas, double ancho, double alto, double largo) {
        super(nombre, ancho, alto, largo);
        this.pisos = pisos;
        this.personas = personas;
        this.oficinas = oficinas;
        this.nombre = nombre;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
     @Override
    public void calcularSuperficie() {
         System.out.println("Ingrese el ancho, el largo y el alto del edificio"); 
       ancho = leer.nextDouble();
       largo = leer.nextDouble();
       alto = leer.nextDouble();
        System.out.println("La superficie del Edificio de Oficinas es: " +ancho*largo +" metros cuadrados");
  
    }
   @Override
    public void calcularVolumen() {
        System.out.println("El volumen del Edificio de Oficinas es: " +ancho*alto*largo + " metros cúbicos");       
    }
    
    public void cantPersonas(){
           System.out.println("Cuantos pisos tiene el edificio de Oficinas?"); 
           pisos = leer.nextInt();
           System.out.println("Cuantas oficinas tiene por piso?");
           oficinas = leer.nextInt();
           System.out.println("Cuantas personas pueden trabajar juntas en una misma oficina?");
           personas = leer.nextInt();
           
          System.out.println("En todo el edificio pueden trabajar " + (pisos*oficinas*personas) + " personas");
        
          
    }
   
    
   }
    

