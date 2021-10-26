/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extragestionfacultad;

/**
 Ej. 4 Extra -- Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad
que gestione la información sobre las personas vinculadas con la misma y que se
pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. A
continuación, se detalla qué tipo de información debe gestionar esta aplicación
 */
public class Ej4ExtraGestionFacultad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Profesores p = new Profesores ();
         
        p.IngresoEmpleado();
        p.MostrarArray();
        p.CambiarEstadoCivil();
        p.MostrarArray();
        
        
        // TODO code application logic here
    }
    
}
