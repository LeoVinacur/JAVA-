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
public class Lavadora extends ElectroServicios {
    
   protected int carga ;
   protected double auxCarga = 0;
   
   ElectroServicios j = new ElectroServicios();
   ElectroDomesticos h = new ElectroDomesticos ();
   
    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, String nombre, Double precio, String color, String consumoEnergetico, Double peso) {
        super(nombre, precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
   public void CrearLavadora (){
       System.out.println(" ");
       System.out.println("Carga de datos de Lavadora");
      j.crearElectro();
       System.out.println("Que capacidad de carga tiene la lavadora?");
       carga = leer.nextInt();
       
       if (carga>30) {
        auxCarga = 500;   
       }
       
       PrecioLavadora();
    
   } 
   
   public void PrecioLavadora (){
     
     System.out.println("Aumento sobre el precio base de la lavadora de acuerdo "
             + "a Consumo, Peso y Carga");    
       h.setPrecio(j.PrecioFinal()+ auxCarga);
       System.out.println(h.getPrecio());
      
   }

    @Override
    public String toString() {
        return "Lavadora{ color= " +j.Color() + " carga= " + carga 
                + "Kg., consumo= " + j.Consumo() + " precio: " + (j.PrecioFinal()+auxCarga) + '}';
    }
   
   
    
}
