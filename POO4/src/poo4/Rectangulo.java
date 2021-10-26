/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;
import java.util.Scanner;
 
public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double base;
    private double altura;
    private double area;
    private double perimetro;

 //constructor sin parámetros
    public Rectangulo() {
    }
  
     
       //constructor con parámetros
    public Rectangulo(int base, int altura) {
     this.base= base; 
     this.altura= altura;
    }
      public void setBase(double base){
   this.base= base;
}                
      public void setAltura(double altura){
   this.altura= altura;
}  
      public double area() {
      area = (base * altura);
      return area;  
    }
      public double perimetro() {
      perimetro = (base+base+altura+altura);
      return perimetro;  
    }
      
      ////metodo customer https://www.youtube.com/watch?v=MdfDt0rBWEE&t=915s
      
      public void imprimirRectangulo(){
            
          for (int i = 0; i <= base; i++) {
              for (int j = 0; j <= altura; j++) {
                  if ((i == base) || (i == 0) || (j == altura) || (j == 0) ){  
                      System.out.print(" * ");
                  }  else 
                      System.out.print("   ");
                  
              } 
              System.out.println(" ");
          }
                System.out.println(" "); 
      }
      
}
