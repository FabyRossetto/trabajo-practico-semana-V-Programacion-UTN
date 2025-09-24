/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio6;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Faby
 */
public class Reserva {
    private Date fecha;
    private LocalTime hora;
    private Cliente cliente;//asociacion unidireccional
    private Mesa mesa;//agregacion

    public Reserva(Date fecha, LocalTime hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
    
    
}
