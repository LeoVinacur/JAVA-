/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class CuentaBancaria {
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
    private int numcuenta ;
    private int dni;
    private double saldo;
    private double interes;
    private double ingreso;
    private double retiro;
    private double extrapida;
    
    //constructor sin parámetros
    public CuentaBancaria() {
    }
     //constructor con parámetros
    public CuentaBancaria(int numcuenta , int dni , double saldo , double interes) {
    this.numcuenta = numcuenta;
    this.dni = dni;
    this.saldo = saldo;
    this.interes = interes;
   
    }
    
     public void setNumcuenta(int numcuenta){
   this.numcuenta= numcuenta;
}                
    public void setDni (int dni){
    this.dni = dni;
}
     public void setSaldo (double saldo){
    this.saldo = saldo;  
}
      public int getNumcuenta(){
   return numcuenta;
}
   public int getDni(){
   return dni;
}
      public double getSaldo(){
   return saldo;
}
       public void setIngreso(double ingreso){
    this.ingreso = ingreso;
}
      
       public double ingreso() {
       ingreso = (ingreso + saldo);
       saldo = ingreso ;
      return ingreso;  
    }
          public void setRetiro(double retiro){
    this.retiro = retiro;
}
          
      public double retiro() {
          if (saldo > retiro) {
             retiro = ( saldo - retiro); 
             saldo = retiro; 
          }else
              retiro = 0;
      return retiro;  
    }
      
         public void setExtrapida(double extrapida){
    this.extrapida = extrapida;
}
      
       public void extrapida() {
           if (extrapida > saldo*0.20) {
               System.out.println("No puede sacar mas del 20% de su saldo");
           }else
               System.out.println("Su saldo ahora es: " +(saldo-extrapida));
     // return extrapida;  
    }
}
