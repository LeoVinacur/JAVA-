/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extragestionfacultad;

/**
 *Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
public class PesonalServicio extends Empleado {
    protected String seccion;

    public PesonalServicio() {
    }

    public PesonalServicio(String seccion) {
        this.seccion = seccion;
    }

    public PesonalServicio(String seccion, Integer anioIncorp, Integer despacho) {
        super(anioIncorp, despacho);
        this.seccion = seccion;
    }

    public PesonalServicio(String seccion, Integer anioIncorp, Integer despacho, String Nombre, Integer DNI, String EstadoCivil) {
        super(anioIncorp, despacho, Nombre, DNI, EstadoCivil);
        this.seccion = seccion;
    }
    
    
}
