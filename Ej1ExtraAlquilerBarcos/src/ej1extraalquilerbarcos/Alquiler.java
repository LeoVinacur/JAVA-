/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extraalquilerbarcos;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *Ej. 1 Extra 
     * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación
 */
public class Alquiler {
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
    protected String nombrePersona;
    protected Integer DNI;
    protected  byte diaI;
    protected  byte mesI;
    protected  byte anioI;
    protected  byte diaII;
    protected  byte mesII;
    protected  byte anioII;
    protected String nombreBarco;
    protected Integer eslora;
    protected Integer diasAlquiler;

    public Alquiler() {
    }

    public Alquiler(String nombrePersona, Integer DNI, byte diaI, byte mesI, byte anioI, byte diaII, byte mesII, byte anioII, String nombreBarco, Integer eslora, Integer diasAlquiler) {
        this.nombrePersona = nombrePersona;
        this.DNI = DNI;
        this.diaI = diaI;
        this.mesI = mesI;
        this.anioI = anioI;
        this.diaII = diaII;
        this.mesII = mesII;
        this.anioII = anioII;
        this.nombreBarco = nombreBarco;
        this.eslora = eslora;
        this.diasAlquiler = diasAlquiler;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public byte getDiaI() {
        return diaI;
    }

    public void setDiaI(byte diaI) {
        this.diaI = diaI;
    }

    public byte getMesI() {
        return mesI;
    }

    public void setMesI(byte mesI) {
        this.mesI = mesI;
    }

    public byte getAnioI() {
        return anioI;
    }

    public void setAnioI(byte anioI) {
        this.anioI = anioI;
    }

    public byte getDiaII() {
        return diaII;
    }

    public void setDiaII(byte diaII) {
        this.diaII = diaII;
    }

    public byte getMesII() {
        return mesII;
    }

    public void setMesII(byte mesII) {
        this.mesII = mesII;
    }

    public byte getAnioII() {
        return anioII;
    }

    public void setAnioII(byte anioII) {
        this.anioII = anioII;
    }

    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(Integer diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

  
    
    public void Alquiler (){
        
        System.out.println("Ingrese el nombre del cliente y su DNI");
        nombrePersona = leer.next();
        DNI = leer.nextInt();
         
        System.out.println("Ingrese la fecha del inicio del alquiler");
       System.out.println("Ingrese un dia(2 digitos)");   
        byte diaI = leer.nextByte();
        System.out.println("Ingrese un mes(2 digitos)");   
        byte mesI = leer.nextByte();
        System.out.println("Ingrese un anio(4 digitos)");   
        int anioI = leer.nextInt(); 
        
        System.out.println(" ");
         System.out.println("Ingrese la fecha del fin del alquiler");
        System.out.println("Ingrese un dia(2 digitos)");   
        byte diaII = leer.nextByte();
        System.out.println("Ingrese un mes(2 digitos)");   
        byte mesII = leer.nextByte();
        System.out.println("Ingrese un anio(4 digitos)");   
        int anioII = leer.nextInt();
        
         LocalDate fechaI= LocalDate.of(anioI, mesI, diaI);  
         LocalDate fechaII= LocalDate.of(anioII, mesII, diaII);
          
         Period periodoT = Period.between(fechaI, fechaII);
         System.out.println("\n Dias de alquiler totales: " +periodoT.getYears() + " años, " + periodoT.getMonths() + " meses, y "+ periodoT.getDays() +" días");  
       
        diasAlquiler =  (periodoT.getMonths()+ periodoT.getDays());
         
      //  System.out.println("\n Dias de alquiler totales (de nuevo): " + diasAlquiler);
         System.out.println("Ingrese el nombre del barco que quiere alquilar");
          nombreBarco = leer.next();
           
         System.out.println("Ingrese la eslora del barco");
         eslora = leer.nextInt();
         
    }
            
    
    
}
