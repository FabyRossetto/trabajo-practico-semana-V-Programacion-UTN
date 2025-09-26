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
    //dependencia de creacion
    public void exportar(String formato, Proyecto proyecto){
        Render ren= new Render(formato);
        ren.setProyecto(proyecto);
        System.out.println(" Render: " + ren );
    }
}
