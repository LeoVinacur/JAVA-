/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class Integrador {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Practica prac = new Practica();
        Practica2 p2 = new Practica2();
        
      ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A","E" ,"A","B","C","D","A","C","D","A"}));
      
      System.out.println(prac.mediasAmigas(medias));
//        
//        System.out.println(practica.prisioneroDulce(0, 10, 2 ));
//        
//        System.out.println(practica.numeroCapicua(-12521));
//        
//       System.out.println(practica.otroCapicua(12521));
//     
//        System.out.println(practica.OtroLadrondeCaramelos(0,10,6));
   
//        System.out.println(practica.parCieloPiso(4 , 1.4  , 6 ));
//        
//      System.out.println(practica.geringoso("gato"));
//        
//       // System.out.println(practica.inversa("inversa"));
//       
//        System.out.println(practica.otraInversa("computadora"));
        // TODO code application logic here
    }
    
}
