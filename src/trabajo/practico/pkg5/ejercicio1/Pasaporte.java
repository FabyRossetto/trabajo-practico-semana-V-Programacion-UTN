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

    public Pasaporte(String numero, Date fechaDeEmision, Titular titular) {
        this.numero = numero;
        this.fechaDeEmision = fechaDeEmision;
        this.titular = titular;
        this.foto = new Foto();
        
        
         // Mantener la bidireccionalidad consistente
        titular.setPasaporte(this);
    }
    
    
}
