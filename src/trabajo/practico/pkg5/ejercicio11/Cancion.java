/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio11;

/**
 *
 * @author Faby
 */
public class Cancion {
    private String titulo;
    private Artista artista;//asociacion unidireccional

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
    
    
    
    
}
