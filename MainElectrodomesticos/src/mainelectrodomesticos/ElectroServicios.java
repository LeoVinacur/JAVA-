/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainelectrodomesticos;

/**
 *
 * @author mzeballos
 */
public class ElectroServicios extends ElectroDomesticos {

   public ElectroServicios() {
    }

    public ElectroServicios(String nombre, Double precio, String color, String consumoEnergetico, Double peso) {
        super(nombre, precio, color, consumoEnergetico, peso);
    }
   
   ElectroDomesticos t = new ElectroDomesticos ();
    
    // String nombre;
//    Double precio ;
//    String color;
//    char consumoEnergético; 
//    Double peso;
   
   double auxPeso = 0;
   double auxConsumo = 0;
    
    public void ComprobarConsumo (){
        System.out.println("Indique el consumo del producto: Letras de la A a la F"); 
        String consumo  = leer.next();
        
        if (consumo.equalsIgnoreCase("A")){  
           t.setConsumoEnergetico(consumo);    
           auxConsumo = 1000;
        }  
        if (consumo.equalsIgnoreCase("B")){  
           t.setConsumoEnergetico(consumo);    
           auxConsumo = 800;
        }  
       if (consumo.equalsIgnoreCase("C")){  
           t.setConsumoEnergetico(consumo);    
           auxConsumo = 600;
        }  
        if (consumo.equalsIgnoreCase("D")){  
           t.setConsumoEnergetico(consumo);    
           auxConsumo = 500;
        }  
        if (consumo.equalsIgnoreCase("E")){  
           t.setConsumoEnergetico(consumo);    
           auxConsumo = 300;
        }  
         if (consumo.equalsIgnoreCase("F")){  
           t.setConsumoEnergetico(consumo);    
           auxConsumo = 100;
        }  
        if (!consumo.equalsIgnoreCase("A")  && !consumo.equalsIgnoreCase("B") && !consumo.equalsIgnoreCase("C")&& !consumo.equalsIgnoreCase("D")&& !consumo.equalsIgnoreCase("E") && !consumo.equalsIgnoreCase("F") ) {
           System.out.println("La letra no es correcta, se le asignará una F"); 
           t.setConsumoEnergetico("F");  
            auxConsumo = 100;
        }
         System.out.println("El consumo ingresado es: " +t.getConsumoEnergetico());
         System.out.println("Aumento por el consumo: " +auxConsumo);
         t.setPrecio(auxConsumo);
    }
    
    public void ComprobarColor (){
        //blanco, negro, rojo, azul y gris
          System.out.println("Indique el color del producto"); 
        String color  = leer.next();
        if (color.equalsIgnoreCase("blanco")  || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")|| color.equalsIgnoreCase("azul")|| color.equalsIgnoreCase("gris") ) {
           t.setColor(color);            
        }   else {
           System.out.println("El color no es correcto, se le asignará color Blanco");
           t.setColor("Blanco");
        } 
         System.out.println("El color asignado es :" +t.getColor());
    }
    
    public String Consumo(){
        return t.getConsumoEnergetico();
    }
    public String Color (){
        return t.getColor();
    }
    
    public void ComprobarPeso(){
 
        System.out.println("Cual es el peso del producto?");
        peso = leer.nextDouble();
     
         if (peso <20) {
         auxPeso = 100;   
        }
          if (peso >=20 && peso<50) {
         auxPeso = 500;   
        }
           if (peso >=50 && peso<80 ) {
         auxPeso = 800;   
        }
         if (peso >28) {
         auxPeso = 1000;   
        }
         System.out.println("Aumento por peso del producto: " +auxPeso);
         t.setPrecio(t.getPrecio()+auxPeso);
       
        }
        
   
    public double PrecioFinal (){
       // System.out.println(" ");
       // System.out.println("Aumento por precio y consumo: " + t.getPrecio());
        return t.getPrecio();
       // System.out.println(auxPeso+auxConsumo);     
      //  t.setPrecio(auxPeso+auxConsumo);
   
    }
    
    public void crearElectro (){
        
      ComprobarConsumo ();
      ComprobarColor ();
      ComprobarPeso();  
      PrecioFinal();
        
    }
         
    
}
