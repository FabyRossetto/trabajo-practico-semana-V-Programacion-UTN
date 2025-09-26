/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio1;

/**
 *
 * @author Faby
 */
public class Titular {
    private String nombre;
    private String DNI;
    private Pasaporte pasaporte;//asociacion bidireccional

    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if(pasaporte!=null&&pasaporte.getTitular()!=this){
            pasaporte.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", DNI=" + DNI + ", pasaporte=" + pasaporte + '}';
    }

    
    
    
}
