/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio7;

/**
 *
 * @author Faby
 */
public class Conductor {
   private String nombre;
   private String licencia;
   private Vehiculo auto;//asociacion bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
         if(auto!=null&& auto.getConductor()!=this){
            auto.setConductor(this);
        }
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", licencia=" + licencia;
    }
    
    

   
}
