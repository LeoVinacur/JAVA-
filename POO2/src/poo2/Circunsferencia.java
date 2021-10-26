/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;
import java.util.Scanner;
 
public class Circunsferencia {
    
private double radio  ;  
private double area;
private double perimetro;

 
//constructor sin parámetros
    public Circunsferencia() {
    }
  
    //constructor con parámetros
       //constructor con parámetros
    public Circunsferencia(int radio) {
     this.radio = radio;   
    }
    
    public double getRadio(){
   return radio;
}
    
     public void setRadio(int radio){
   this.radio = radio;
}

    public double area() {
      area = (3.14 * radio * radio);
      return area;  
    }
     public double perimetro() {
       perimetro = (2 * 3.14 * radio);
      return perimetro;  
    }
}


