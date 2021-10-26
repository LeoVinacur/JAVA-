/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extraabstract;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public abstract class Edificio {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected String nombre;
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(String nombre , double ancho, double alto, double largo) {
       this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
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
    
       // Polideportivo p = new Polideportivo();
       /// EdificioDeOficinas eo = new EdificioDeOficinas ();
   
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
    
//    ArrayList<Edificio> tipoEdificio = new ArrayList ();
//
//    public ArrayList<Edificio> getTipoEdificio() {
//        return tipoEdificio;
//    }
//
//    public void setTipoEdificio(ArrayList<Edificio> tipoEdificio) {
//        this.tipoEdificio = tipoEdificio;
//    }
//   
    
//      public void ingresarEdificios ( ) {
//        String rta;
//  
//        do {  
//             System.out.println("Ingrese el tipo de Edificio");
//                 nombre = leer.next();  
//          
//                 p.calcularSuperficie();
//                 
//      //  tipoEdificio.add (new Edificio(nombre, ancho, alto, largo));
//        
//        
//        
//         rta = null;
//            System.out.println("Quiere agregar otro alumno? s / n");
//             rta = leer.next();
//             
//             if (!rta.equals("s") && !rta.equals("n") ) {
//                 System.out.println("Ingrese una respuesta válida");   
//            }
//          
//    } while (!"n".equals(rta));
//        
//}
//     
}
