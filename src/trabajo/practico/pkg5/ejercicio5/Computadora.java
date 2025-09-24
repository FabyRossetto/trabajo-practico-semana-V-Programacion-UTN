/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio5;

/**
 *
 * @author Faby
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;//composicion
    private Propietario propietario;//asociacion bidireccional

    public Computadora(String marca, String numeroSerie, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre();
        this.propietario = propietario;
        
        propietario.setCompu(this);
    }

   
    
    
}
