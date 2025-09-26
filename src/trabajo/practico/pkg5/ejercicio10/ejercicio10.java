/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio10;

import java.time.LocalDateTime;


/**
 *
 * @author Faby
 */
public class ejercicio10{

   
    public static void main(String[] args) { 
        CuentaBancaria cuenta =new CuentaBancaria("456789",2500,"467",LocalDateTime.of(2023, 5, 10, 14, 30));
        Titular titular= new Titular("pepe","123456");
        
        titular.setCuenta(cuenta);
        
        System.out.println(titular);
    }
    
}
