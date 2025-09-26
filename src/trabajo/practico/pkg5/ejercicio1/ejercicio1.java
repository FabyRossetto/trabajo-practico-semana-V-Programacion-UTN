/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio1;

import java.util.Date;


public class ejercicio1{

   
    public static void main(String[] args) { 
        
        Pasaporte pasaporte = new Pasaporte("1234",new Date(),"foto","jpg");
        //el new Date() le pasa la fecha actual
        Titular titular= new Titular("Fabiana","123456");
        titular.setPasaporte(pasaporte);
        
        System.out.println(titular);
    }
    
}
