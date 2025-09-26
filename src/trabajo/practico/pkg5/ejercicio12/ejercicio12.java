/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio12;



/**
 *
 * @author Faby
 */
public class ejercicio12{

   
    public static void main(String[] args) { 
        
      Contribuyente contribuyente = new Contribuyente("pepe","456987");
      Impuesto imp = new Impuesto(300);
      imp.setContribuyente(contribuyente);
      
      Calculadora calculadora= new Calculadora();
      calculadora.cancular(imp);
    }
    
}
