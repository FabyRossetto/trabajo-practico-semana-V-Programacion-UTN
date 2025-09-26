/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio14;

import trabajo.practico.pkg5.*;
import trabajo.practico.pkg5.ejercicio11.Artista;
import trabajo.practico.pkg5.ejercicio11.Cancion;
import trabajo.practico.pkg5.ejercicio11.Reproductor;

/**
 *
 * @author Faby
 */
public class ejercicio14{

   
    public static void main(String[] args) { 
        
      Proyecto proyecto = new Proyecto("X",12);
      EditorVideo editor = new EditorVideo();
      editor.exportar("mp4", proyecto);
        
        
    }
    
}
