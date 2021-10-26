/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

import java.util.Scanner;

/**
 * 3. Crear una clase llamada Operacion que tenga como atributos privados
 * numero1 y numero2. A continuación, se deben crear los siguientes métodos: a)
 * Método constructor con todos los atributos pasados por parámetro. b) Metodo
 * constructor sin los atributos pasados por parámetro. c) Métodos get y set. 17
 * d) Método para crearOperacion(): que le pide al usuario los dos números y los
 * guarda en los atributos del objeto. e) Método sumar(): calcular la suma de
 * los números y devolver el resultado al main. f) Método restar(): calcular la
 * resta de los números y devolver el resultado al main g) Método multiplicar():
 * primero valida que no se haga una multiplicación por cero, si fuera a
 * multiplicar por cero, el método devuelve 0 y se le informa al usuario el
 * error. Si no, se hace la multiplicación y se devuelve el resultado al main h)
 * Método dividir(): primero valida que no se haga una división por cero, si
 * fuera a pasar una división por cero, el método devuelve 0 y se le informa al
 * usuario el error se le informa al usuario. Si no, se hace la división y se
 * devuelve el resultado al main
 */
public class POO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Operacion objeto = new Operacion();
  
        
        System.out.println("Ingrese dos números para hacer operaciones");
         objeto.setNum1(leer.nextInt());
                  
        System.out.println("Y ahora ingrese el otro número"); 
          objeto.setNum2(leer.nextInt());
                   
            System.out.println("La suma de los números es: " + objeto.suma());
            System.out.println("La resta de los números es: " + objeto.resta());
            System.out.println("La multiplicacion de los números es: " + objeto.multiplicar());
            System.out.println("La división de los números es: " + objeto.dividir());
            // TODO code application logic here
        }

    }

