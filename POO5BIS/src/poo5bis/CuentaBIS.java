/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5bis;
import java.util.Scanner;

public class CuentaBIS {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numcuenta ;
    private int dni;
    private double saldo;
    Double getSaldo;
   

    public CuentaBIS() {
    }

    public CuentaBIS(int numcuenta, int dni, double saldo) {
        this.numcuenta = numcuenta;
        this.dni = dni;
        this.saldo = saldo;
        
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

    @Override
    public String toString() {
        return "CuentaBIS{" + "leer=" + leer + ", numcuenta=" + numcuenta + ", dni=" + dni + ", saldo=" + saldo + ", getSaldo=" + getSaldo + '}';
    }
       
    
}
