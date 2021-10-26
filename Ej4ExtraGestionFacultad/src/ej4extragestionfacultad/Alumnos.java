/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extragestionfacultad;

/**
 *En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados
 */
public class Alumnos extends Persona {
  
   protected String curso; 

    public Alumnos() {
    }

    public Alumnos(String curso) {
        this.curso = curso;
    }

    public Alumnos(String curso, String Nombre, Integer DNI, String EstadoCivil) {
        super(Nombre, DNI, EstadoCivil);
        this.curso = curso;
    }
         
}
