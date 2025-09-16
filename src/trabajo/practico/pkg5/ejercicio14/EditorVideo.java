/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio14;

/**
 *
 * @author Faby
 */
public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto){
        Render ren= new Render(formato);
        Proyecto pro= new Proyecto(proyecto.getNombre(),proyecto.getDuraciónMinutos());
        System.out.println(" Render: " + ren + "\n Proyecto: " + pro);
    }
}
