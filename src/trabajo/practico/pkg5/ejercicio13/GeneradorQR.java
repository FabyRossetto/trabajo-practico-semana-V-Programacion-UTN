/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio13;

/**
 *
 * @author Faby
 */
public class GeneradorQR {
    
    
    public void generar(String valor,Usuario usuario){
        Usuario usu= new Usuario(usuario.getNombre(),usuario.getEmail());
        CodigoQR QR= new CodigoQR(valor);
        
        System.out.println("El QR creado para " + usu + "es " + QR);
         // si no hago el toString en las otras clases va a salir la referencia
    }
}
