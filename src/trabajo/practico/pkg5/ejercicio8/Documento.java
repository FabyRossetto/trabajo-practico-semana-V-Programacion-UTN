/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio8;

/**
 *
 * @author Faby
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;//composicion

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital();
    }
    
    
}
