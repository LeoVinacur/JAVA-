package poo3;

import java.util.Scanner;

/**
 *
 */
public class Operacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int num1;
    private int num2;
    private int suma;
    private int resta;
    private int multiplicar;
    private double dividir;

    //constructor sin parametros
    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
   //  do {
         if (num1 != 0) {
            this.num1 = num1;         
       } else {
            System.out.println("Ingrese un número distinto de 0");
           this.num1 = leer.nextInt();
      
        }       
      // } while (num1 == 0);
    }

    public void setNum2(int num2) {
        if (num2 != 0) {
            this.num2 = num2;
        } else {
            System.out.println("Ingrese un número distinto de 0");
            this.num2 = leer.nextInt();
            System.out.println("Y ahora ingrese el otro número");
        }
        
    }

    public int suma() {
      //  suma = (num1 + num2);
        return (num1 + num2);
    }

    public int resta() {
      //  resta = (num1 - num2);
        return (num1 - num2);
    }

    public int multiplicar() {

        multiplicar = (num1 * num2);
        return multiplicar;
    }

    public double dividir() {

        dividir = (num1 / num2);
        return dividir;
    }

}
