/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio2;

/**
 *
 * @author Faby
 */
public class Usuario {
    private String nombre;
    private String DNI;
    private Celular celular;//asociacion bidireccional
    
    
    public void setCelular(Celular celular) {
        this.celular = celular;
    }
}
