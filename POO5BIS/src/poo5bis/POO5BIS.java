/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5bis;
import java.util.Scanner;
/**
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
 
public class POO5BIS {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
       CuentaServicioBIS cs = new CuentaServicioBIS ();
        
        //Cuenta c = cs.crearCuenta();  
        cs.crearCuenta();
       cs.mostrarDatos();
        
        System.out.println();
        
        cs.ingresarDinero();
        System.out.println();
        cs.mostrarDatos();
        cs.menu();
        
        // TODO code application logic here
    }
    
}
