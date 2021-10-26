/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra5;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class MesSecreto {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
     private String mes  ;  
     String mesSecreto = meses[4];  ///es MAYO porque comienza a contar en 0

    public MesSecreto() {
    }

    public MesSecreto(String mes) {
        this.mes = mes;
       
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    public void MostrarMesSecreto (){
        System.out.println(meses[4]);
    }
 
     public void adivinarMes (){
         int i = 1;
         System.out.println("Adivine un mes del año, introduzca un mes en minúscula");
         do {
             
              mes = leer.next();
       
             if (mes.equals(mesSecreto)) {
                 System.out.println("Felicitaciones!! Ud. ha adivinado el mes");  
             } else {
                 System.out.println("El mes es incorrecto, ingrese nuevamente el mes");
                 System.out.println("Tiene tres posibilidades, y esta es la " +i );
                i = i+1;
             }      
          } while (!mes.equals(mesSecreto) && i<4);
           
         
     }
     
     
     
}
