/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio9;

import java.time.LocalDate;
import java.time.LocalTime;
import trabajo.practico.pkg5.*;



/**
 *
 * @author Faby
 */
public class ejercicio9{

   
    public static void main(String[] args) { 
      Profesional doctor= new Profesional(" Marcos Sanchez "," Clinico ");
      Paciente paciente = new Paciente("Pedro", "Osde");
      CitaMedica nuevaCita = new CitaMedica(LocalDate.of(2025, 10, 31),LocalTime.of(12, 30, 00));
      nuevaCita.setDoctor(doctor);
      nuevaCita.setPaciente(paciente);
        
        System.out.println(nuevaCita);
    }
    
}
