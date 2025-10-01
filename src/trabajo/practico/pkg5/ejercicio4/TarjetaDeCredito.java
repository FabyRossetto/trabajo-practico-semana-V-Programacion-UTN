/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio4;

import java.time.LocalDate;

/**
 *
 * @author Faby
 */
public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaDeVencimiento;
    private Banco banco;// agregacion
    private Cliente cliente;//asociacion bidireccional

    public TarjetaDeCredito(String numero, LocalDate fechaDeVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.banco = banco;
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente!=null&& cliente.getTarjeta()!=this){
            cliente.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaDeVencimiento=" + fechaDeVencimiento + ", banco=" + banco +  '}';
    }
    
    
    
    
}
