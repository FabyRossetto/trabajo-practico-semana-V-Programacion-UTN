/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio4;

/**
 *
 * @author Faby
 */
public class Cliente {
    private String nombre;
    private String DNI;
    private TarjetaDeCredito tarjeta;//asociacion bidireccional

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    
}
