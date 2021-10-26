/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extragestionfacultad;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
public class Empleado extends Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Persona p = new Persona();
    
    protected Integer anioIncorp ;
    protected Integer despacho;

    public Empleado() {
    }

    public Empleado(Integer anioIncorp, Integer despacho) {
        this.anioIncorp = anioIncorp;
        this.despacho = despacho;
    }

    public Empleado(Integer anioIncorp, Integer despacho, String Nombre, Integer DNI, String EstadoCivil) {
        super(Nombre, DNI, EstadoCivil);
        this.anioIncorp = anioIncorp;
        this.despacho = despacho;
    }

    public Integer getAnioIncorp() {
        return anioIncorp;
    }

    public void setAnioIncorp(Integer anioIncorp) {
        this.anioIncorp = anioIncorp;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }
    
   
}
