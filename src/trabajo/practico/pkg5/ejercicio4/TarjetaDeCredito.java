/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio4;

import java.util.Date;

/**
 *
 * @author Faby
 */
public class TarjetaDeCredito {
    private String numero;
    private Date fechaDeVencimiento;
    private Banco banco;// agregacion
    private Cliente cliente;//asociacion bidireccional

    public TarjetaDeCredito(String numero, Date fechaDeVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.banco = banco;
        this.cliente = cliente;
        
        cliente.setTarjeta(this);
    }
    
    
}
