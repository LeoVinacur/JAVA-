/* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
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
package poo5bis;
import java.util.Scanner;
 
public class CuentaServicioBIS {
    Scanner leer = new Scanner(System.in);  
    
    
       CuentaBIS t = new CuentaBIS ();
    
    public void crearCuenta (){
      
        
        System.out.println("Ingresar número de cuenta");   
        int numcuenta = leer.nextInt();
        System.out.println("Ingrese DNI");
        int dni = leer.nextInt();
        System.out.println("Saldo inicial");
        double saldo = leer.nextDouble();
        
        t.setNumcuenta(numcuenta);
        t.setDni(dni);
        t.setSaldo(saldo);
       
     
        
       // return new Cuenta (numcuenta, dni, saldo);
    }
    
    public void mostrarDatos () {
           System.out.println("Numero de Cuenta: " +t.getNumcuenta());
        System.out.println("DNI: " +t.getDni());
        System.out.println("Saldo: " +t.getSaldo());
        
    }
    
      public double ingresarDinero ( ){
          
        System.out.println("Cuanto dinero quiere ingresar?");
        double ingreso = leer.nextDouble();
        t.setSaldo(t.getSaldo()+ingreso);
        
        return t.getSaldo() ;
    }
      
      public double retirarDinero ( ){
          System.out.println("Cuanto dinero quiere retirar?");
          double retiro = leer.nextDouble ();
            t.setSaldo(t.getSaldo()-retiro);
            return t.getSaldo();
      }
      
      public void menu ( ) {
       
          System.out.println("opciones");
          
      }
    
}
