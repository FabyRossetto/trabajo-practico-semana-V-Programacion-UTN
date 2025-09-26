/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio14;

/**
 *
 * @author Faby
 */
public class Proyecto {
    private String nombre;
    private int duraciónMinutos;

    public Proyecto(String nombre, int duraciónMinutos) {
        this.nombre = nombre;
        this.duraciónMinutos = duraciónMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuraciónMinutos() {
        return duraciónMinutos;
    }

    public void setDuraciónMinutos(int duraciónMinutos) {
        this.duraciónMinutos = duraciónMinutos;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracion en Minutos=" + duraciónMinutos + '}';
    }

   
    
    
    
    
}
