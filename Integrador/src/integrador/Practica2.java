/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class Practica2 {
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
    
    public static Boolean parCieloPiso (int numEnt , double numReal , long numLargo){
       boolean par = numEnt % 2 == 0;
       boolean proxAnt = Math.round(numReal) == Math.floor(numReal);
       boolean posCero = numLargo >= 0;
       
       return par && proxAnt && posCero;
        
    }
    
}
