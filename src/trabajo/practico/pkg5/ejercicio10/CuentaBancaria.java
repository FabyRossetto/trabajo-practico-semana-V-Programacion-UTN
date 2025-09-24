/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio10;

/**
 *
 * @author Faby
 */
public class CuentaBancaria {
    private String cbu;
    private int saldo;
    private ClaveSeguridad clave;//composicion
    private Titular titular;// asociacion bidireccional

    public CuentaBancaria(String cbu, int saldo, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad();
        this.titular = titular;
    }
    
    
}
