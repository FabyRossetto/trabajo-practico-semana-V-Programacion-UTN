/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio9;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Faby
 */
public class CitaMedica {
    private LocalDate fecha;
    private LocalTime hora;
    private Paciente paciente;//asociacion unidireccional
    private Profesional doctor;//asociacion unidireccional

    public CitaMedica(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getDoctor() {
        return doctor;
    }

    public void setDoctor(Profesional doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", PACIENTE: " + paciente + ", DOCTOR: " + doctor + '}';
    }
    
    
    
    
}
