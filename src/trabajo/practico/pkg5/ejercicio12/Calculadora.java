/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio12;

/**
 *
 * @author Faby
 */
public class Calculadora {
    
    public void cancular(Impuesto impuesto){
        System.out.println("El impuesto a pagar del contribuyente " + impuesto.getContribuyente().getNombre()+ ", CUIL: " + impuesto.getContribuyente().getCuil()+ " es de : $ " +  impuesto.getMonto());
    }
}
