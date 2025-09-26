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
    
    //dependencia de creacion
    public void generar(String valor,Usuario usuario){
       
        CodigoQR QR= new CodigoQR(valor);
        QR.setUsuario(usuario);
        System.out.println("El QR creado para " + usuario.getNombre() + " es " + QR.getValor());
         
    }
}
