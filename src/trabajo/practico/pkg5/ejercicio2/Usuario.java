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

    public Usuario(String nombre, String DNI) {
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

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario()!=this){
            celular.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", DNI=" + DNI + ", celular=" + celular + '}';
    }
    
    
   
}
