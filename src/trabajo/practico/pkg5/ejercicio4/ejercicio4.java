/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio4;

import java.time.LocalDate;
import trabajo.practico.pkg5.*;
import trabajo.practico.pkg5.ejercicio11.Artista;
import trabajo.practico.pkg5.ejercicio11.Cancion;
import trabajo.practico.pkg5.ejercicio11.Reproductor;

/**
 *
 * @author Faby
 */
public class ejercicio4{

   
    public static void main(String[] args) { 
        
      Banco banco= new Banco("La Nacion","30-6598967-23");
      TarjetaDeCredito tarjeta= new TarjetaDeCredito("23569874", LocalDate.of(2026, 12, 31), banco);
      Cliente cliente = new Cliente("pepe","123456");
      cliente.setTarjeta(tarjeta);
        
        System.out.println(cliente);
    }
    
}
