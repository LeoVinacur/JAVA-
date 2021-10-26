/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
/** 
 */
public class Practica {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public int prisioneroDulce (int inicio, int cantidadCaramelos, int cantidadLadrones){
     int podrido = 0;
     if(cantidadLadrones==1){
         podrido = inicio;
         return podrido;
     }
     int posic;
     posic = (cantidadCaramelos%cantidadLadrones);
     podrido = ((inicio+posic)-cantidadLadrones)-1;
     
        if (podrido<0) {
            podrido = podrido*-1;
        }
        return podrido;
    }
    
    public List<String> mediasAmigas(List<String> pasajeros){
        HashSet<String> amigas = new HashSet();
        
        Collections.sort(pasajeros);
        
        for (int i = 0; i < pasajeros.size()-1; i++) {
            for (int j = i+1; j < pasajeros.size(); j++) {
                if (pasajeros.get(i).equals(pasajeros.get(j))) {
                amigas.add(pasajeros.get(j));  
//Esto de abajo "else etc" sirve para mostrar un array list con todos los elementos del array
// mostrando UN solo de los elementos duplicados si es que hubiera algún duplicado
// También muestra los elementos sin duplicar
              }   else
                   amigas.add(pasajeros.get(j));    
//                 
          }
        }
         
        ArrayList<String> pares = new ArrayList(amigas);
        return pares;
    }
    
    public Boolean numeroCapicua(Integer num){
        String cadena = "",invertida="";
        
        if (num<-9) {
           num = num*-1;
            cadena = String.valueOf(num);
          invertida = new StringBuilder(cadena).reverse().toString();
        }else if (num<10 && num>-10){
            return true;         
        }else if (num>10) {
          cadena = String.valueOf(num);
          invertida = new StringBuilder(cadena).reverse().toString();
        }
        return invertida.equals(cadena);
    }
    
    //////otro numero capicua
    //NUMERO CAPICUA
        public Boolean otroCapicua (Integer num1){
            
       boolean bandera;
     
        Integer num2 = Math.abs(num1);
       // System.out.println(num2);
        
        String numCadena = String.valueOf(num2);
        
        StringBuilder tt = new StringBuilder(numCadena);
        
        numCadena = tt.reverse().toString();
    
        int num3 = Integer.parseInt(numCadena);
        
        if (num2 == num3){
           // System.out.println("Es capicua");
            bandera= true;
        } else{
           // System.out.println("No es capicua");
            bandera = false;
        }
        return bandera;
 }
        
        public int OtroLadrondeCaramelos(int inicio, int cantidadCaramelos, int cantidadLadrones){
         
            int rta = inicio+(cantidadCaramelos%cantidadLadrones)-cantidadLadrones-1; 
       
            
            if (cantidadLadrones ==1) {
                rta = inicio;
            }
            if (rta<0) {
              rta = rta *-1;  
            }
            if (rta>cantidadLadrones && rta>0) {
                rta = inicio-rta;
            }
            if (rta>cantidadLadrones && rta<0) {
                rta = inicio+rta;
            }
            
        return rta;   
            
        }
        public   Boolean parCieloPiso (int numEnt , double numReal , long numLargo){
       boolean par = numEnt % 2 == 0;
       boolean proxAnt = Math.round(numReal) == Math.floor(numReal);
       boolean posCero = numLargo >= 0;
       
       return par && proxAnt && posCero;
        
    }
        
        public static  String geringoso(String palabra){
        
        String solucion = palabra.toLowerCase();
        
        solucion = solucion.replaceAll("a", "apa").replaceAll("e", "epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u", "upu");
        
        return solucion;
        
    }
        
        public static String inversa(String palabra){
    String invertida = palabra.toLowerCase();
    
    invertida = new StringBuilder(invertida).reverse().toString();
    
    return invertida;
}

        public String otraInversa (String palabra){
         String aux = "";
         
            String invertir = palabra.toLowerCase();
            
            for (int i = 0; i < invertir.length(); i++) {
             aux  = invertir.charAt(i)+ aux ;   
            }
         return aux ;
            
        }

        
}
