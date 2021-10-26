/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extraalquilerbarcos;
import java.util.Scanner;
/**
 *
 * @author mzeballos
 */
public class Ej1ExtraAlquilerBarcos {

    /**Ej. 1 Extra 
     * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Alquiler alq = new Alquiler ();
        Veleros vel = new Veleros ();
        BarcosMotor bm = new BarcosMotor ();
        Yates y = new Yates ();
        
//         alq.Alquiler();
//        vel.AlquilerVelero();
//       bm.AlquilerBarco();
        y.AlquilerYates(); 
        
        // TODO code application logic here
    }
    
}
