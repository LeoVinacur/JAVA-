/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainelectrodomesticos;
import java.util.Scanner;
/**
Ejercicio 2 y 3 Herencia
 */
public class ElectroDomesticos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
   protected String nombre;
   protected Double precio ;
   protected String color ;
   protected String consumoEnergetico  ; 
   protected Double peso;
   

    public ElectroDomesticos() {
    }

    public ElectroDomesticos(String nombre, Double precio, String color, String consumoEnergetico, Double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public void CrearElectrodomestico (){
        
        System.out.println();
        
    }

    @Override
    public String toString() {
        return "ElectroDomesticos{" + "nombre=" + nombre + ", precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
    
}
