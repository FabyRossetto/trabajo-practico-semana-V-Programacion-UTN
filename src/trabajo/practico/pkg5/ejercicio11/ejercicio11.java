/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio11;


import trabajo.practico.pkg5.ejercicio11.Artista;
import trabajo.practico.pkg5.ejercicio11.Cancion;
import trabajo.practico.pkg5.ejercicio11.Reproductor;

/**
 *
 * @author Faby
 */
public class ejercicio11{

   
    public static void main(String[] args) { 
        
        Artista artista= new Artista(" Shakira "," pop");
        Cancion cancion = new Cancion(" pies descalsos");
        cancion.setArtista(artista);
        Reproductor repro= new Reproductor();
        
        repro.reproducir(cancion);
        
        
        
    }
    
}
