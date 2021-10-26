/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4interface;
import java.util.Scanner;
/**
 *Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class FormasGeometricas implements calculosFormas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected double radio;
    protected double base;
    protected double alto;
    
    
    @Override
    public void calcularAreaCirculo() {
        System.out.println("Ingrese el radio del círculo");
        radio = leer.nextDouble();
        System.out.println("El áreal del círculo es: " + Math.round(pi *(radio*radio) * 100d) / 100d); 
    }

    @Override
    public void calcularPerimetroCirculo() {
        System.out.println("El perímetro del círculo es: " + Math.round(pi *(radio+radio) * 100d) / 100d );    
    }

    @Override
    public void calcularAreaRectangulo() {
         System.out.println("Ingrese la base y la altura del rectángulo"); 
         base = leer.nextDouble();
         alto = leer.nextDouble();
         System.out.println("El área del rectángulo es: " + base*alto);
    }

    @Override
    public void calcularPerimetroRectangulo() {
        System.out.println("El preímetro de un rectángulo es: " +(base + alto) * 2);     
    }

  
}
