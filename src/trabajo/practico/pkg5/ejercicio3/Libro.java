/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio3;

/**
 *
 * @author Faby
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;//asoaciacion unidireccional
    private Editorial editorial;// agregacion

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    
    
}
