/* 
 */
package poo5;
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
public class POO5 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CuentaBancaria c1 = new CuentaBancaria(); 
        System.out.println("Ingrese número de cuenta");
        c1.setNumcuenta(leer.nextInt()) ;
        System.out.println("Ingrese DNI");
        c1.setDni(leer.nextInt());
        System.out.println("Ingrese el saldo actual");
        c1.setSaldo(leer.nextInt());
        
        System.out.println("El número de cuenta es: " +c1.getNumcuenta());
        System.out.println("El DNI del usuario es: " +c1.getDni());
        System.out.println("El saldo actual de la cuenta es: " +c1.getSaldo());
        
        System.out.println("Cuanto dinero quiere ingresar en la cuenta?");
         c1.setIngreso(leer.nextInt());
        System.out.println("El saldo actualizado es: " +c1.ingreso());
       
        System.out.println(" ");
        System.out.println("Cuanto dinero quiere retirar de la cuenta?");
         c1.setRetiro(leer.nextInt());
        System.out.println("Su saldo actualizado es: " +c1.retiro());
         
        System.out.println(" ");
        System.out.println("Extracción Rápida. Ingrese un valor que desee retirar");
         c1.setExtrapida(leer.nextInt());
         
          c1.extrapida();
        
        
        // TODO code application logic here
    }
    
}
