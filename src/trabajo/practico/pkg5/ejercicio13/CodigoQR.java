/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio13;

/**
 *
 * @author Faby
 */
public class CodigoQR {

    
    private String valor;
    private Usuario usuario;//asociacion unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    
    public String getValor() {
        return valor;
    }
    
    
    
    
}
