/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio6;

import java.time.LocalDate;
import java.time.LocalTime;



/**
 *
 * @author Faby
 */
public class ejercicio6{

   
    public static void main(String[] args) { 
        
      Cliente numero1 = new Cliente("pepe","261598745");
      Mesa redonda = new Mesa(26,2);
        
      Reserva reserva = new Reserva(LocalDate.of(2025, 12, 31),LocalTime.of(22,30,00),redonda);
      reserva.setCliente(numero1);
      
        System.out.println(reserva);
    }
    
}
