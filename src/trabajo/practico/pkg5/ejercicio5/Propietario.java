/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio5;

/**
 *
 * @author Faby
 */
public class Propietario {
    private String nombre;
    private String DNI;
    private Computadora compu;//asociacion bidireccional

    public Propietario(String nombre, String DNI) {
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

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
        if(compu!=null&& compu.getPropietario()!=this){
            compu.setPropietario(this);
        }
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", DNI=" + DNI ;
    }

    
}

    
