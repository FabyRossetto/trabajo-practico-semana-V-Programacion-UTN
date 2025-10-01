/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio8;

import java.time.LocalDate;
import trabajo.practico.pkg5.*;



/**
 *
 * @author Faby
 */
public class ejercicio8{

   
    public static void main(String[] args) { 
        
      Usuario usuario= new Usuario("Fabiana","faby@gmail");
      Documento documento = new Documento("Contrato","arrendamiento entre partes","hTr@485Jm",LocalDate.of(2025, 10, 01),usuario);
        System.out.println(documento);  
    }
    
}
