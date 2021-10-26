/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 *EJERCICIOS 1 y 2
 */
public class RazasServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
      ArrayList<String> razasPerros = new ArrayList ();

    public RazasServicio(ArrayList<String> razasPerros) {
        this.razasPerros =  new ArrayList ();
    }

    public RazasServicio() {
        
    }
    
    public void ingresarRazas ( ) {
        String rta;
  
        do {
  
             String raza = null;
             System.out.println("Ingrese las razas de los perros");
                raza = leer.next();
            razasPerros.add(raza);
     
         rta = null;
            System.out.println("Quiere agregar otra raza? s / n");
             rta = leer.next();
             
             if (!rta.equals("s") && !rta.equals("n") ) {
                 System.out.println("Ingrese una respuesta válida");   
            }
          
    } while (!"n".equals(rta));
}
    public void MostrarRazas () {
        System.out.println(" ");
        System.out.println("Las razas ingresadas son:");
        for (String raza : razasPerros) {
            System.out.println(raza);    
        }
        
        System.out.println("Cantidad de razas: " +razasPerros.size());
        System.out.println(" ");
    }
    
    public void BuscarRaza () {
        System.out.println("Ingrese una raza de perro que desee buscar y borrar");
        String buscar = leer.next();
        
        if (razasPerros.contains(buscar)) {
            System.out.println("Esa raza fue encontrada en la lista, y se borrará de la misma");
            razasPerros.remove(buscar);
        } else
            System.out.println("La raza buscada no fue encontrada en la lista");
        System.out.println(" ");
        
     System.out.println(" ");
        System.out.println("Las lista de razas actualizada es:");
        for (String raza : razasPerros) {
            System.out.println(raza);    
        }
        System.out.println(" ");
        System.out.println("Cantidad de razas actualizadas: " +razasPerros.size());
        
    }
    
}
