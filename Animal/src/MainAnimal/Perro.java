/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainAnimal;

/**
 *
 * @author mzeballos
 */
public class Perro extends Animal {
    
      

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
       super(nombre, alimento, edad, raza);
    }
    
    public void alimentacion (){
        System.out.println("El perro come DogChow");
    }

    
  
    
}
