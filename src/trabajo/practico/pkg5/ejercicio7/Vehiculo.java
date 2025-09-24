/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio7;

/**
 *
 * @author Faby
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;//agregacion
    private Conductor conductor;//asociacion bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        
        conductor.setAuto(this);
    }
    
    
    
}
