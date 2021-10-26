 
package pooextra4;
import java.util.Scanner;
 
public class Nif {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int documento;
    
    
     String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public Nif() {
    }

    public Nif(int documento) {
        this.documento = documento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }
      
      public void obtenerLetra(){
        int resto;
        resto = documento % 23;
        System.out.println("DNI COMPLETO: "+documento+"-"+letras[resto]);
    }
     
}
