/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extraabstract;

import java.util.ArrayList;
import java.util.Scanner;
/**
  
 */
public class Ej2ExtraAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        String oficina = null;
        
        Polideportivo p = new Polideportivo();
        EdificioDeOficinas eo = new EdificioDeOficinas ();
        
   // ArrayList<Polideportivo> tipoEdificio = new ArrayList (); 
    //  tipoEdificio.add (new Polideportivo ("Polideportivo", true, 30.00, 30.00,30.00));    
      
    
    ArrayList<Edificio> lista= new ArrayList (); 
      
      
       p.Techados();
       p.calcularSuperficie();
       p.calcularVolumen();
       p.MostrarArray();
     
       eo.calcularSuperficie();
       eo.calcularVolumen();
       eo.cantPersonas();
       
     Polideportivo poli1 = new Polideportivo();
     Polideportivo p1 = new Polideportivo("Poli Nro 1", false, 76d, 18d, 140d);
       lista.add(poli1);
        
       
        for (Edificio edificio : lista) {
            System.out.println(lista);
            
        }
     
    }
}
