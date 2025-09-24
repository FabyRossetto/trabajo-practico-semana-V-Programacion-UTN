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
}
