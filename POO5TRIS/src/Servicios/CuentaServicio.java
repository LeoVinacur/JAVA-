/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
 
import java.util.Scanner;

import poo5tris.Entidades.Cuenta;


public class CuentaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
      Cuenta t = new Cuenta ();
    
    public void crearCuenta (){
      
        System.out.println("Ingresar número de cuenta");   
        int numcuenta = leer.nextInt();
        System.out.println("Ingrese DNI");
        int dni = leer.nextInt();
        System.out.println("Saldo inicial");
        double saldo = leer.nextDouble();
        
        t.setNumcuenta(numcuenta);
        t.setDni(dni);
        t.setSaldo(saldo);
       
    }
    
    public void mostrarDatos () {
        System.out.println("Mostrando datos");
        System.out.println("Numero de Cuenta: " +t.getNumcuenta());
        System.out.println("DNI: " +t.getDni());
        System.out.println("Saldo: " +t.getSaldo());
        System.out.println(" ");
    }
    
      public double ingresarDinero ( ){
          
        System.out.println("Cuanto dinero quiere ingresar?");
        double ingreso = leer.nextDouble();
        t.setSaldo(t.getSaldo()+ingreso);
         System.out.println("Su nuevo saldo es: " +t.getSaldo());
        return t.getSaldo() ;
    }
      
      public double retirarDinero ( ){
          System.out.println("Cuanto dinero quiere retirar?");
          double retiro = leer.nextDouble ();
            t.setSaldo(t.getSaldo()-retiro);
             System.out.println("Su nuevo saldo es: " +t.getSaldo());
            return t.getSaldo();
      }
      
      public void retiroRapido (){
          
          System.out.println("Ud. ha elegido -Retiro Rápido-");
          System.out.println("El 20% de su saldo es: " +   Math.round(t.getSaldo()*0.2*100.0)/100.0 );
          t.setSaldo(t.getSaldo()*0.8);
          System.out.println("Su nuevo saldo es: " +Math.round(t.getSaldo()*100.0)/100.0);
         // return t.getSaldo();
      }
   
      public void salir (){
          System.out.println("Gracias por utilizar nuestros servicios");
      }
      public void menu ( ) {
      int opcion = 0;
          do {
              System.out.println(" ");
          System.out.println("MENU DE OPCIONES"); 
          System.out.println("Ingrese 1 para crear cuenta");
          System.out.println("Ingrese 2 para mostrar datos");
          System.out.println("Ingrese 3 para ingresar dinero");
          System.out.println("Ingrese 4 para extraer dinero");
          System.out.println("Ingrese 5 para una extracción rápida");
          System.out.println("Ingrese 6 para salir");
              System.out.println(" ");
           opcion = leer.nextInt();
          
          
          switch (opcion) {
              case 1:
                  crearCuenta();
                  break;
              case 2:
                  mostrarDatos();
                  break;
              case 3:
                  ingresarDinero();
                  break;
              case 4:
                  retirarDinero ();
                  break;
              case 5:
                  retiroRapido ();
                  break;
              case 6:
                  salir();
                  break;
              default:
                  System.out.println("Ingrese un número de opción válido");
                       
                  }
   
          } while (opcion != 6);

      
      }

   
    
    
}
