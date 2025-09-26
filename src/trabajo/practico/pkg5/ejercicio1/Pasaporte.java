/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio1;

import java.util.Date;

/**
 *
 * @author Faby
 */
public class Pasaporte {
    private String numero;
    private Date fechaDeEmision;
    private Titular titular;// asociacion bidireccional
    private Foto foto; //composicion

    public Pasaporte(String numero, Date fechaDeEmision,String imagen,String formato) {
        this.numero = numero;
        this.fechaDeEmision = fechaDeEmision;
        this.foto = new Foto(imagen,formato);
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(Date fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte()!=this){
            titular.setPasaporte(this);
        }
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaDeEmision=" + fechaDeEmision + ", foto=" + foto + '}';
    }

    
    
    
    
    
    
    
}
