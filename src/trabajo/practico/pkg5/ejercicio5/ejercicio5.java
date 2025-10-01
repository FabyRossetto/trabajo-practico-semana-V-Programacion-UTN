/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio5;


/**
 *
 * @author Faby
 */
public class ejercicio5{

   
    public static void main(String[] args) { 
        
      Propietario duenio= new Propietario("Fabiana","123456");
     Computadora compu= new Computadora("hp","789456","hibrid","Southbridge");
     compu.setPropietario(duenio);
     
        System.out.println(compu);
        
    }
    
}
