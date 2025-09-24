/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio2;

/**
 *
 * @author Faby
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;//agregacion
    private Usuario usuario;//asociacion bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        
        // Mantener bidireccionalidad
        usuario.setCelular(this);
    }
    
    
}
