/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainelectrodomesticos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 Ejercicio 2 y 3 - Herencia
 */
public class MainElectrodomesticos {
 
    
    public static void main(String[] args) {
        
          
        ElectroDomesticos u = new ElectroDomesticos ();   
        ElectroServicios t = new ElectroServicios();
        
        System.out.println("EJERCICIO 2");
        Lavadora l = new Lavadora();
        Televisor o = new Televisor();
      //t.crearElectro();
        l.CrearLavadora();
        o.CrearTelevisor();
       
        System.out.println(" ");
        System.out.println(l.toString());
        System.out.println(" ");
        System.out.println(o.toString());
        
//   protected String nombre;  Estos atributos estan en la clase ElectroDomesticos
//   protected Double precio ;
//   protected String color ;
//   protected String consumoEnergetico  ; 
//   protected Double peso;

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" EJERCICIO TRES"); 
        
     // ElectroServicios auxArray = new ElectroServicios(); 
      
      double total = 0.00;
      
      ArrayList<ElectroDomesticos> electro = new ArrayList ();
      electro.add (new ElectroDomesticos("TelevisorNoblex", 30000.00 , "Negro" , "A" , 29.00  )); 
      electro.add (new ElectroDomesticos("TelevisorSamsung", 25000.00 , "Negro" , "A" , 25.00  ));   
      electro.add (new ElectroDomesticos("LavarropasDrean", 65000.00 , "Blanco" , "B" , 66.00  )); 
      electro.add (new ElectroDomesticos("LavarropasCandy", 55000.00 , "Plateado" , "C" , 50.00  )); 
 
        for (ElectroDomesticos aux : electro) {
            System.out.println(aux.toString());  
            total = total +  aux.getPrecio();
        }
        System.out.println(" ");
        System.out.println("El precio total de todos los electrodomésticos es: " +total);  
        

        


// TODO code application logic here
    }
    
}
