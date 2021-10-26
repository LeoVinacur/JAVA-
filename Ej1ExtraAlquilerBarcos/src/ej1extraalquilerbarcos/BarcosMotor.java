/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extraalquilerbarcos;
import java.util.Scanner;
/**
 * 
 */
public class BarcosMotor extends Alquiler {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");  
    
    protected Integer potencia;

    public BarcosMotor() {
    }

    public BarcosMotor(Integer potencia) {
        this.potencia = potencia;
    }

    public BarcosMotor(Integer potencia, String nombrePersona, Integer DNI, byte diaI, byte mesI, byte anioI, byte diaII, byte mesII, byte anioII, String nombreBarco, Integer eslora, Integer diasAlquiler) {
        super(nombrePersona, DNI, diaI, mesI, anioI, diaII, mesII, anioII, nombreBarco, eslora, diasAlquiler);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
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
    
     ///Alquiler alq = new Alquiler();
     
    public void AlquilerBarco (){
        super.Alquiler();
        System.out.println("Ingrese la potencia en CV del Barco");
        potencia = leer.nextInt();
        
        System.out.println(" ");
               System.out.println("El precio del alquiler del barco " + super.getNombreBarco() 
            +" es: $" +((super.diasAlquiler*super.eslora*10)+potencia) +" por los " 
               +super.diasAlquiler + " días");
    }
    
}
