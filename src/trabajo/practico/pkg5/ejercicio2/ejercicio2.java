/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio2;


/**
 *
 * @author Faby
 */
public class ejercicio2{

   
    public static void main(String[] args) { 
        
        
      Bateria bateria= new Bateria("modelo",3000);
      Celular celu= new Celular("123654789","Samsung","A31",bateria);
      Usuario usuario= new Usuario("Fabiana","123456");
      usuario.setCelular(celu);
      
      System.out.println(usuario);
        
    }
    
}
