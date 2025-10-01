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

    public Computadora(String marca, String numeroSerie,String modelo,String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modelo,chipset);
        
    }

   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    public void setPlaca(PlacaMadre placa) {
        this.placa = placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario!=null&& propietario.getCompu()!=this){
            propietario.setCompu(this);
        }
    }
 @Override
    public String toString() {
        return "Computadora: " + "marca=" + marca + ", numero de Serie=" + numeroSerie + ", placa:" + placa + ", propietario:" + propietario;
    }
   
    
    
}
