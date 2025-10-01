/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio7;



/**
 *
 * @author Faby
 */
public class ejercicio7{

   
    public static void main(String[] args) { 
        
        Motor Volvo = new Motor("V6","456789");
        Conductor conductor = new Conductor("Fabiana","B2");
        Vehiculo automovil = new Vehiculo("AAA 111","Kuga",Volvo);
        automovil.setConductor(conductor);
        
        System.out.println(automovil);
        
    }
    
}
