/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo10;
import java.util.Scanner;
import java.util.Arrays;
/**
10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
public class POO10 {
     
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
   ///// VER ESTE VIDEO     
   //// https://www.youtube.com/watch?v=XrqJ8YoW4pI
         
int[] vectorA = new int[50]; //DECLARO EL VECTOR A DE 50
double[] vectorB = new double[20]; //DECLARO EL VECTOR B DE 20
Arreglos mostrar = new Arreglos(); //creacion de objeto solo para usar con el void de la Class Arreglos
/// Lleno el vectorA con números aleatorios, en dos filas de 25
System.out.println("Arreglo A impreso en dos filas de 25 números");
for (int i = 0; i < 24; i++) {
vectorA[i] =  (int) (Math.random() * 100);  
System.out.print("[ " +vectorA[i] +"]"); 
}
        System.out.println("");
 for (int i = 25; i < 50; i++) {
vectorA[i] =  (int) (Math.random() * 100);  
System.out.print("[ " +vectorA[i] +"]");
 } 
        System.out.println(" ");
        System.out.println(" ");
 // ordeno el vectorA, de menor a mayor y luego lo muestro ordenado, en dos filas de 25       
        System.out.println("Arreglo A impreso en dos filas, pero de menor a mayor");
 Arrays.sort(vectorA);
      for (int i = 0; i < 24; i++) {   
System.out.print("[ " +vectorA[i] +"]"); 
}
        System.out.println(" ");
 for (int i = 25; i < 50; i++) {
System.out.print("[ " +vectorA[i] +"]");
 }
        System.out.println(" "); 
        System.out.println(" ");
 // Llenar Vector B con los primeros números del Vector A 
        System.out.println("Arreglo B lleno con los primeros 10 números del Arreglo A");  
 for (int i = 0; i < 9; i++) {
        vectorB[i] =  vectorA[i];  
     System.out.print("[ " +vectorB[i] +"]");
     //   También se puede copiar un vector de otro, de esta manera:
      //vectorB[] = Arrays.copyOf(vectorA ,5);   
        
} 
     for (int i = 10; i < 20; i++) {
        vectorB[i] =0.5 ;  
     System.out.print("[ " +vectorB[i] +"]");
     //   También se puede llenar un vector con un valor, de esta manera:
    //Arrays.fill(vectorA ,5);   
           
} 
        System.out.println(" ");
        System.out.println(" ");
     System.out.println("Arreglo B completo, con los primeros 10 números del Arreglo A");  
        System.out.println("Y los segundos 10 números, con el valor 0.5");
        System.out.println("Nota: Los números son doubles para poder rellenar con el 0.5" );
     for (int i = 0; i < 20; i++) {
        
     System.out.print("[ " +vectorB[i] +"]");
     
     //   También se puede copiar un vector de otro, de esta manera:
      //vectorB[] = Arrays.copyOf(vectorA ,5);   
        
} 
        System.out.println(" ");
        System.out.println(" ");
     /// METODO binarySearch - Sirve para buscar un elemento determinado en un arreglo.
     ///El método devuelve la posición del elemento buscado
     // int posicion = Arrays.binarySearch(VectorA , 5)
       /// System.out.println("El elemtnto se encuentra en la posición: " +posicion);
        System.out.println("Void traído de la Clase Arreglos, solo como prueba");
        System.out.println("creé el objeto -mostrar- solo para usarlo aquí");
       mostrar.ArregloA ();
       
   ///Metodo para ver si dos arreglos son iguales:
   /// if (Arrays.equals(VectorA , VectorB)){
   /// sout "los arreglos son iguales" etc.
   
   
  /// VER VIDEO  https://www.youtube.com/watch?v=XrqJ8YoW4pI
    
    
    
    
    }
    
    
    
}
