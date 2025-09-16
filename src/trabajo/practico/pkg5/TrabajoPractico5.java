/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5;

import trabajo.practico.pkg5.ejercicio11.Cancion;
import trabajo.practico.pkg5.ejercicio11.Reproductor;

/**
 *
 * @author Faby
 */
public class TrabajoPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion = new Cancion(" pies descalsos");
        Reproductor repro= new Reproductor();
        
        repro.reproducir(cancion);
        
        
        
    }
    
}
