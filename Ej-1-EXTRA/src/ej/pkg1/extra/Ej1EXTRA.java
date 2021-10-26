/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg1.extra;

import java.util.Scanner;

/**
 * 1 EXTRA. Dado un tiempo en minutos, calcular su equivalente en días y horas.
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
 * equivalente: 1 día, 2 horas.
 */
public class Ej1EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una cantidad de minutos");
        int minutos = leer.nextInt();

        int dias = minutos / 1440;
        minutos %= 1440;
        int horas = minutos / 60;
        minutos %= 60;

        System.out.println("Los " + minutos + " ingresados, equivalen a:");
        System.out.println(dias + " días, " + horas + " horas, y " + minutos + " minutos");

        // TODO code application logic here
    }

}
