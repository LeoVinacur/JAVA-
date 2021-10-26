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
public class Yates extends BarcosMotor {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Integer camarotes;

    public Yates() {
    }

    public Yates(Integer camarotes) {
        this.camarotes = camarotes;
    }

    public Yates(Integer camarotes, Integer potencia, String nombrePersona, Integer DNI, byte diaI, byte mesI, byte anioI, byte diaII, byte mesII, byte anioII, String nombreBarco, Integer eslora, Integer diasAlquiler) {
        super(potencia, nombrePersona, DNI, diaI, mesI, anioI, diaII, mesII, anioII, nombreBarco, eslora, diasAlquiler);
        this.camarotes = camarotes;
    }

 

    public void AlquilerYates() {
      super.AlquilerBarco();
        System.out.println(" ");
        System.out.println("En caso de Yate, ingrese el número de camarotes del yate");
        camarotes = leer.nextInt();
     //   System.out.println("camarotes: " + camarotes);
        System.out.println(" ");
        System.out.println("El precio del alquiler del Yate " + super.getNombreBarco()
              +" es: $" +((super.diasAlquiler*super.eslora*10)+super.potencia+camarotes) +" por los " 
                + super.diasAlquiler + " días");
    }
 
}
