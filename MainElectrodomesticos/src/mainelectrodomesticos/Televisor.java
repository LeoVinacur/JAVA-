/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainelectrodomesticos;
 
public class Televisor extends ElectroServicios {
    
     ElectroServicios t = new ElectroServicios();
      ElectroDomesticos h = new ElectroDomesticos ();
      
    protected boolean TDT = false;
    protected String rta;
    protected int pulgadas;
    protected double auxPulgadas = 1;
    protected double auxTDT = 0;

    public Televisor() {
    }

    public Televisor(boolean TDT, int pulgadas) {
        this.TDT = TDT;
        this.pulgadas = pulgadas;
    }

    public Televisor(boolean TDT, int pulgadas, String nombre, Double precio, String color, String consumoEnergetico, Double peso) {
        super(nombre, precio, color, consumoEnergetico, peso);
        this.TDT = TDT;
        this.pulgadas = pulgadas;
    }
    
    
    public void CrearTelevisor (){
        System.out.println(" ");
        System.out.println("Carga de datos de Televisor");
     t.crearElectro();
        System.out.println("Cuantas pulgadas tiene el televisor?");
        pulgadas = leer.nextInt();
        
        if (pulgadas >40) {
        auxPulgadas = 1.3;  
            System.out.println("Porcentaje de aumento por superar las 40 pulgadas: " +((auxPulgadas*100)-100) +"%"); 
           
        }
        
        System.out.println("Tiene TDT?  s/n ");
        rta = leer.next();
        if (rta.equalsIgnoreCase("s")) {
         TDT = true;
         auxTDT = 500;
            System.out.println("Aumento de precio por tener TDT:" +auxTDT);
        }
        
        PrecioTelevisor();
        
    }
    
    public void PrecioTelevisor (){
        System.out.println(" ");
        
      h.setPrecio((t.PrecioFinal()+auxTDT)*auxPulgadas) ;
        System.out.println("Aumento sobre el precio base del TV, contemplando"); 
        System.out.println("el consumo, el peso, las pulgadas, y si tiene o no TDT es: " +h.getPrecio());
    }

    @Override
    public String toString() {
        return "Televisor{ color= " +t.Color() +  ", TDT=" + TDT + ", pulgadas=" + pulgadas  + " consumo = " +t.Consumo()+ "}";
    }
    
    
}
