
package poo7bis;
import java.util.Scanner;
 
public class PersonaBis {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String nombre;
    public int edad;
    public String genero;
    public double peso;
    public double altura;
    public int numeroPacientes;
    public double icm;
    public double icmalto ;
    public double icmnormal ;
    public double icmbajo  ;
    public  int mayor;
    public int menor;
    
    public PersonaBis() {
    }

    public PersonaBis(String nombre, int edad, String genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    
    
      public void imc (){
      icm = (  Math.round(peso /(altura*altura)*100.0)/100.0 );
      if (icm <20) {
          System.out.println("Su ICM es: " +icm +"; y se encuentra por debajo del peso ideal");
         // icmbajo = icmbajo+1;
      }
        if (icm >= 20 && icm <= 25 ) {
          System.out.println("su ICM es: " +icm + "; y se encuentra dentro de su peso ideal"); 
          // icmnormal = icmnormal+1;
          }
        if (icm >25) {
          System.out.println("Su ICM es: " +icm +"; y se encuentra por encima del peso ideal");
        //   icmalto = icmalto+1;
      }
  }
      
  
    public void imprimirpaciente(){
   
          System.out.println("El paciente " +nombre  + " es del género "
                  + genero + ", y tiene " + edad+ " años de edad");    
 
  }
     
     
     
}
