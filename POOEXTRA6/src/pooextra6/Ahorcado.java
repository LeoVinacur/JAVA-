package pooextra6;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String frase;
    public int cont;

    public Ahorcado() {
    }

    public Ahorcado(String frase) {
        this.frase = frase;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void CreaFrase() {
        System.out.println("Ingrese una palabra para jugar a El ahorcado");

        String frase = leer.next().toLowerCase();
        System.out.println("prueba de Frase: --" + frase + "--");

        int n = frase.length();

        String[] vectorFrase = new String[n];
        String[] vectorAdivinar = new String[n];

        /////relleno del vector con la frase
        for (int i = 0; i < n; i++) {
            vectorFrase[i] = frase.substring(i, i + 1);

        }
        //// relleno el vector de adivinar, con guiones bajos
        for (int i = 0; i < n; i++) {
            vectorAdivinar[i] = "_";

        }
        /////Aquí se muestra el resultado de llenar el vector
        System.out.println("Relleno del Vector con la palabra");
        for (int i = 0; i < n; i++) {
            System.out.print("[ " + vectorFrase[i] + " ]");
        }
        System.out.println(" ");

        System.out.println("JUEGO");
        System.out.println("ADIVINE UNA LETRA, Solo tiene 5 vidas");
        System.out.println(" ");
        int vidas = 5;

        do {
            int cont = 0;
            System.out.println("Ingrese una letra");
            String letra = leer.next();

            for (int i = 0; i < n; i++) {
                /// for (int j = 0; j < n; j++) {
 
                    
             
                //if (letra.equals(vectorFrase[i]) && letra.equals(vectorFrase[j]) ) { /// esta también sirve
                if (vectorFrase[i].equals(letra)) { //contains(letra))/// && vectorFrase [j].contains(letra)
                    vectorAdivinar[i] = letra;
                    //   vectorAdivinar[j] = letra;             
                    cont = 1;
                } 
            }
            //}

            if (cont == 1) {
                System.out.println("Ud. ha encontrado una letra");

            } else {
                vidas = vidas - 1;
                System.out.println("Ud. NO ha acertado NINGUNA letra, y le quedan " + vidas + " vidas");
            }

            for (int i = 0; i < n; i++) {
                System.out.print("[ " + vectorAdivinar[i] + " ]");

            }
            System.out.println(" ");

            if (Arrays.equals(vectorFrase, vectorAdivinar)) {
                System.out.println("FELICITACIONES!!! Ud. Ha adivinado la palabra!!");
            }
        } while (!Arrays.equals(vectorFrase, vectorAdivinar) && vidas > 0);

    }

}
