
package poo8;
import static java.lang.String.valueOf;
import java.util.Scanner;

public class Cadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    public String texto1;  //aún siendo public, se pueden usar los get y los set
    private String texto2;  // no estoy usando este atributo
    private String letra;
    private String simbolo;
    private int largo1;
    private int largo2;
    private String s1;
    private String s2;
  //  char ch;
    
    

    public Cadena() {
    }

    public Cadena(String texto1, String texto2, String letra, int largo1, int largo2, char ch) {
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.letra = letra;
        this.largo1 = largo1;
        this.largo2 = largo2;
        //this.ch = ch;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }
 
 
    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String  letra) {
        this.letra = letra;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    
    
    public void mostrarVocales () {
        int vocales =0;
        for (int i = 0; i < texto1.length(); i++) {
              if(texto1.charAt(i) == 'a' || texto1.charAt(i) == 'e' || texto1.charAt(i) == 'i' || texto1.charAt(i) == 'o' || texto1.charAt(i) == 'u' ) {
                vocales = vocales+1;      
            }          
        }
           System.out.println("se han encontrado " +vocales +" vocales"   );      
            }
     
    public void invertir (){
        char [] invertir = texto1.toCharArray();
        int cont;
        for (cont = texto1.length()-1 ; cont >= 0; cont--) {
            System.out.print("" +invertir[cont]); 
           
        }    
        System.out.println("" );
    }
    
     
    public void mostrarLetra () {
            
          int contletra = 0;
         for (int j = 0; j < texto1.length(); j++) {
             
           if( letra.equals (texto1.substring(j,j+1))  ) {
              contletra = contletra +1; 
              
           }  
        }
       System.out.println("se ha encontrado la letra ---" +letra + "--- " + contletra +" veces"); 
            
    }   
    
    public void compararFrase () {
                  // Compare the two strings.   
        
        int S = s1.compareTo(s2);
        // Show the results of the comparison.  
        if (S < 0) 
        { System.out.println("\"" + s1 + "\"" + "  lexicográficamente primero que  " + "\"" + s2 + "\"");
        } else if (S == 0) {
            System.out.println("\"" + s1 + "\"" + "  lexicográficamente igual a  " + "\"" + s2 + "\"");
        } else if (S > 0) {
            System.out.println("\"" + s1 + "\"" + "  lexicográficamente segundo que " + "\"" + s2 + "\"");
        }         
    }
 
public void concatenarFrase () {
    System.out.println("las dos frases concatenadas: " +s1.concat(s2));
}

 public void reemplazarLetra () {
     
      System.out.println("Frase 1 con letra reemplazada: " + s1.replace("a", simbolo) ); 
      System.out.println("Frase 2 con letra reemplazada: " + s2.replace("a", simbolo) ); 
}
 
 public void contieneLetra () {
     
       boolean bandera = false;
          
         for (int j = 0; j < texto1.length(); j++) {             
           if( letra.equals (texto1.substring(j,j+1))  ) {         
              bandera = true;
           }  
        }
       
        System.out.println("Método contiene(String letra -" +letra +"-) verdadero/falso ------>" +bandera);     
 }
 
}

