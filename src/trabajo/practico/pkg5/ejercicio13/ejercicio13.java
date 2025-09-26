/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio13;



/**
 *
 * @author Faby
 */
public class ejercicio13{

   
    public static void main(String[] args) { 
        
      Usuario usuario = new Usuario("Faby","hola@gmail");
      
      GeneradorQR QR = new GeneradorQR();
      QR.generar("tienda", usuario);
      
     
    }
    
}
