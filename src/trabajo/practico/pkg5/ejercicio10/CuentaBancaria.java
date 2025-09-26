/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio10;

import java.time.LocalDateTime;

/**
 *
 * @author Faby
 */
public class CuentaBancaria {
    private String cbu;
    private int saldo;
    private ClaveSeguridad clave;//composicion
    private Titular titular;// asociacion bidireccional

    public CuentaBancaria(String cbu, int saldo, String codigo, LocalDateTime ultimaMod) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo,ultimaMod);
        
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCuenta()!= this){
           titular.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave  + '}';
    }
    
    
    
    
    
}
