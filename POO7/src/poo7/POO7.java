 
package poo7;
import java.util.Scanner;
/**
 *7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
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
 */
public class POO7 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
     
      System.out.println("Ingrese la cantidad de pacientes a cargar");
       
    //   Persona cantidad;
    // int cantidad = (leer.nextInt());
     int total = leer.nextInt ();
      //int [] persona = new int  [total];
        String persona[] = new String[6] ;
             
        for (int i = 1; i < total-1; i++) {
         System.out.println("Ingrese nombre de la Personass"  +i +", Edad, Género (M/F/O), Peso, Altura");
     Persona persona1 = new Persona (leer.next(), leer.nextInt(),leer.next(), leer.nextDouble(),leer.nextDouble());
       }
      
    System.out.println("Ingrese nombre de la Persona 1, Edad, Género (M/F/O), Peso, Altura");
 Persona persona1 = new Persona (leer.next(), leer.nextInt(),leer.next(), leer.nextDouble(),leer.nextDouble());
  persona1.sexo();
      
 System.out.println("Ingrese nombre de la persona 2, Edad, Género (M/F/O), Peso, Altura");
   Persona persona2 = new Persona (leer.next(), leer.nextInt(),leer.next(), leer.nextDouble(),leer.nextDouble());   
   persona2.sexo();/**
    System.out.println("Ingrese nombre de la persona 3, Edad, Género (M/F/O), Peso, Altura");
   Persona persona3 = new Persona (leer.next(), leer.nextInt(),leer.next(), leer.nextDouble(),leer.nextDouble());
   persona3.sexo();
    System.out.println("Ingrese nombre de la persona 4, Edad, Género (M/F/O), Peso, Altura");
   Persona persona4 = new Persona (leer.next(), leer.nextInt(),leer.next(), leer.nextDouble(),leer.nextDouble());
      persona4.sexo();
 **/
     System.out.println(persona1.toString());
     persona1.mayor();
     persona1.icm();
        System.out.println(" ");
        
     System.out.println(persona2.toString());
     //persona2.mayor();
     persona2.icm();
        System.out.println(" ");
      
        
        
       //System.out.println(" La suma de las edades es: " +(persona1.edad+persona2.edad));
            
   //  total.promedio();  esto esta relacionado con lo de arriba: Persona total = new Persona (leer.nextInt());
    // promediofinal.promedioicm();
      
       
       
    
// TODO code application logic here
    }
    
}
