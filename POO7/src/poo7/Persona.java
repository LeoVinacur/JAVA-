/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;
import java.util.Scanner;
/**
 
 */
public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    public String nombre;
    public int edad;
    public String sexo;
    public double peso;
    public double altura;
    public double icm;
    public double icmalto ;
    public double icmnormal ;
    public double icmbajo  ;
    public double mayor =0 ;
    public double menor ;
    public double promediomayor;
    public double promedioicm;
    public double promedio;
    public int cantidad;
    
   
     
/*
    public Persona(int cantidad) {
        this.cantidad = cantidad;
    }

    public Persona() {
    }
 
   */ 
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;     
    }
    /*
    public Persona(double icm, double icmalto, double icmnormal, double icmbajo, double mayor, double menor, double promediomayor, double promedioicm) {
        this.icm = icm;
        this.icmalto = icmalto;
        this.icmnormal = icmnormal;
        this.icmbajo = icmbajo;
        this.mayor = mayor;
        this.menor = menor;
        this.promediomayor = promediomayor;
        this.promedioicm = promedioicm;
    }
*/
 
    
    public void sexo () {
        if (sexo.equals("M") || sexo.equals("F") ) {
           // sexo =leer.next();         
        }else
            System.out.println("La opción de sexo elegida, no es una respuesta correcta"); 
  
} 
  public void icm (){
      icm = (  Math.round(peso /(altura*altura)*100.0)/100.0 );
      if (icm <20) {
          System.out.println("Su ICM es: " +icm +"; y se encuentra por debajo del peso ideal");
          icmbajo = icmbajo+1;
      }
        if (icm >= 20 && icm <= 25 ) {
          System.out.println("su ICM es: " +icm + "; y se encuentra dentro de su peso ideal"); 
           icmnormal = icmnormal+1;
          }
        if (icm >25) {
          System.out.println("Su ICM es: " +icm +"; y se encuentra por encima del peso ideal");
           icmalto = icmalto+1;
      }
  }

   
  public void mayor () {
        //mayor =0 ;
       // menor = 0;
       int acumuadorEdad [] ={0};
       int aux []  ={1};
      if (edad>18) {
          System.out.println("El paciente es mayor de edad"  ); 
          mayor = mayor +1;
           { mayor++; }  
       System.out.println("acumula" +(acumuadorEdad[1]+aux[1]));
      }else
          System.out.println("El paciente es menor de edad");
            menor = menor+1;
                { menor++; }
        //        System.out.println(menor);
       //Aquí habría que hacer la cuenta del promedio de mayores de edad. Pero no toma la acumulación
                
  }
  
   public double promedio () {
       System.out.println("El promedio de personas mayores de edad es: " +(cantidad/4*100)); 
       System.out.println("valor mayor " +mayor);
       return promedio;
 }
  
   
 
  public String toString (){
  return " " 
          +"El paciente " +nombre  + " es del sexo "  
          + sexo + ", y tiene " + edad+ " años de edad, por lo tanto es "     
          +(edad > 18 ? "esta dentro del "+100/4 +" % de personas mayores de edad"  : "esta dentro del "+100/4 +" % de personas menores de edad");
  ///esta mal la cuenta 100/4, porque realmente es 100/4 para todos.
  }

    
    
   
}
