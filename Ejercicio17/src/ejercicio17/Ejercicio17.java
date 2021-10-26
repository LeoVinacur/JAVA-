/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;
import java.util.Scanner ;
/**
 *17. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sca = new Scanner(System.in);
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
        
         int cont1 = 0;
         int cont2 = 0;
         String cadena ;
         String clave = ("&&&&&");
         
         do { 
         System.out.println("Ingrese una cadena de 5 carácteres");
         cadena = leer.nextLine();
        int largo = cadena.length();
        /// System.out.println("prueba de longitud de cadena: " +largo);
        
          if (largo != 5 ){
       System.out.println("La cadena no tiene 5 carácteres"  );
          cont1 = (cont1 + 1); 
        // break;
          }
          else if (! cadena.substring(0,1).equals("x") && ! cadena.substring(4,5).equals("o") && !cadena.equals(clave) ){
       System.out.println("La cadena es incorrecta");
           cont1 = (cont1 + 1); 
         //  break;
          }
          else if (cadena.substring(0,1).equals("x") &&  cadena.substring(4,5).equals("o")){
       System.out.println("La cadena es correcta");  
         cont2 = (cont2 +1);
       //  break;
        }
          else if  (cadena.equals(clave)){
         System.out.println("La clave es correcta"  );
        //a break;
         }
         } while (!cadena.equals(clave));
       
         
       System.out.println("La cantidad de intentos incorrectos fue : " +cont1);
       System.out.println("La cantidad de cadenas correctas fue: " +cont2);
         
         
        // TODO code application logic here
    
    
}
}

