/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio4;

/**
 *
 * @author Faby
 */
public class Cliente {
    private String nombre;
    private String DNI;
    private TarjetaDeCredito tarjeta;//asociacion bidireccional

    public Cliente(String nombre, String DNI) {
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

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if(tarjeta!=null&&tarjeta.getCliente()!=this){
            tarjeta.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", DNI=" + DNI + ", tarjeta=" + tarjeta + '}';
    }
    

    

    
}
