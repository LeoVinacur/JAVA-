/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class Cafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

public double capacidadmax;
public double capacidadactual;
public double servir = 200;
public double vaciar;
public double llenar;
public double agregar;

    public Cafetera() {
    }

    public Cafetera(double capacidadmax, double capacidadactual, double servir, double vaciar, double llenar, double agregar) {
        this.capacidadmax = capacidadmax;
        this.capacidadactual = capacidadactual;
        this.servir = servir;
        this.vaciar = vaciar;
        this.llenar = llenar;
        this.agregar = agregar;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setCapacidadmax(double capacidadmax) {
        this.capacidadmax = capacidadmax;
    }

    public void setCapacidadactual(double capacidadactual) {
        this.capacidadactual = capacidadactual;
    }

  

    public void setVaciar(double vaciar) {
        this.vaciar = vaciar;
    }

    public void setLlenar(double llenar) {
        this.llenar = llenar;
    }

    public void setAgregar(double agregar) {
        this.agregar = agregar;
    }

    
    public Scanner getLeer() {
        return leer;
    }

    public double getCapacidadmax() {
        return capacidadmax;
    }

    public double getCapacidadactual() {
        return capacidadactual;
    }

    public void servir() { 
        if (servir>capacidadactual) {
            System.out.println("No se ha podido completar una taza completa.");   
            System.out.println("Solo se ha cargado la taza con " +capacidadactual +"ml");
               
        }else
            if (servir<capacidadactual) {
                System.out.println("Ud. se ha servido una taza de café. Ahora la capacidad actual es: " +(capacidadactual-servir));
            }
                         
    }

     public double getAgregar() {
        agregar = (servir+agregar);
        return agregar;
    }
     
    public double getVaciar() {
        return vaciar;
    }

    public double getLlenar() {
        return llenar;
    }

   
  

    
}
