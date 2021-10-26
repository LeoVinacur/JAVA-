 
package poo7bis;
import java.util.Scanner;
 /**
 7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 **/
public class POO7BIS {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numeroPacientes;
        String nombre;
        int edad;
        String genero ; 
        double peso;
        double altura;
        int mayor =0;
        int menor =0;
        double icm;
        double icmalto =0;
        double icmnormal=0 ;
        double icmbajo =0 ;
     
        System.out.println("Ingrese la cantidad de pacientes que desea ingresar");
        numeroPacientes = leer.nextInt();
        
        PersonaBis pacientes[] = new PersonaBis [numeroPacientes];
        
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println("Ingrese el nombre del paciente Nº " +(i+1));  
            nombre= leer.next();
      
           do {                 
            System.out.println("Ingrese el género del paciente Nº " +(i+1));
              genero = leer.next();

            if  (!genero.equalsIgnoreCase ("M") && !genero.equalsIgnoreCase ("F") ) {               
               System.out.println("La opción de genero elegida, no es una respuesta correcta");
            }  
         } while (!genero.equalsIgnoreCase ("M") && !genero.equalsIgnoreCase ("F") );
          
          
            System.out.println("Ingrese la edad del paciente Nº " +(i+1));
            edad=leer.nextInt();
             
        if (edad >18) {
        //  System.out.println("El paciente es mayor de edad"  ); 
          mayor = (mayor +1);
        }else
         // System.out.println("El paciente es menor de edad");
            menor = menor+1;  
           
            System.out.println("Ingrese el peso del paciente Nº " +(i+1));
            peso = leer.nextDouble();
            
            System.out.println("Ingrese la altura del paciente Nº " +(i+1));
            altura=leer.nextDouble(); 
            
            
          icm = (  Math.round(peso /(altura*altura)*100.0)/100.0 );
      if (icm <20) {
        //  System.out.println("Su ICM es: " +icm +"; y se encuentra por debajo del peso ideal");
          icmbajo = icmbajo+1;
      }
        if (icm >= 20 && icm <= 25 ) {
        //  System.out.println("su ICM es: " +icm + "; y se encuentra dentro de su peso ideal"); 
           icmnormal = icmnormal+1;
          }
        if (icm >25) {
       //  System.out.println("Su ICM es: " +icm +"; y se encuentra por encima del peso ideal");
           icmalto = icmalto+1;
      }
            
           pacientes[i] = new PersonaBis (nombre , edad , genero , peso , altura);
        }
           // mayor = MayorDeEdad(pacientes );
           // System.out.println(pacientes[mayor].mostrarDatos() );
        System.out.println(" ");
           System.out.println("El porcentaje de personas mayores de edad es: " +mayor*100/numeroPacientes +"%"); 
          System.out.println(" ");
           System.out.println("El porcentaje de personas menores de edad es: " +menor*100/numeroPacientes +"%"); 
          System.out.println(" ");
          System.out.println("Calculos de Personas según su IMC:"); 
          System.out.println("IMC Bajo " +Math.round(icmbajo*100/numeroPacientes) +" % de pacientes; " + " IMC NORMAL " +Math.round(icmnormal*100/numeroPacientes) +" % de pacientes; " +" IMC ALTO " +Math.round(icmalto*100/numeroPacientes) +" % de pacientes");
        System.out.println(" ");
        
          for (int i = 0; i < pacientes.length; i++) {
             pacientes[i].imprimirpaciente();
             pacientes[i].imc();
             System.out.println(" ");
        }
          System.out.println("Prueba de un solo paciente - Datos del paciente 1");
          pacientes[0].imprimirpaciente();
          pacientes[0].imc();
        //System.out.println("El porcentaje de mayores de edad es: " +mayor/numeropacientes );
    
    }   
    
}
