/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extragestionfacultad;
import java.util.Scanner;
/**
 *Ej. 4 Extra --Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad
que gestione la información sobre las personas vinculadas con la misma y que se
pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. A
continuación, se detalla qué tipo de información debe gestionar esta aplicación
* 
* Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número
de identificación y su estado civil.
 */
public class Persona {
    
    protected String Nombre;
    protected Integer DNI;
    protected String EstadoCivil;    

    public Persona() {
    }

    public Persona(String Nombre, Integer DNI, String EstadoCivil) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.EstadoCivil = EstadoCivil;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }
    
   
    
}
