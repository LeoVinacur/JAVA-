/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5tris.Entidades;

/**
 * 
 */
public class Cuenta {
private Integer numcuenta;
private Integer dni;  // este es el documento
private Double saldo;

    public Cuenta() {
    }

    public Cuenta(Integer numcuenta, Integer dni, Double saldo) {
        this.numcuenta = numcuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Integer getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(Integer numcuenta) {
        this.numcuenta = numcuenta;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numcuenta=" + numcuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }







}
