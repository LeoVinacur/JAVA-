/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9.servicios;
import  poo9.Matematica;  //importacion desde el main
 
//import POO9.entidades.Matematica ;


    public class MatematicaServicios {
         Matematica operaciones ;
    public int num1;
    public int num2;

    public MatematicaServicios() {
        this.operaciones = new Matematica (num1, num2);
    }
 
     
         public void devolverMayor(){  
      
        if (num1 > num2) {
            System.out.println("El -" +num1 +"- es mayor que el " +num2);    
        }else 
            System.out.println("El -" +num2 +"- es mayor que el " +num1);       
    }
    }
  
    
 
