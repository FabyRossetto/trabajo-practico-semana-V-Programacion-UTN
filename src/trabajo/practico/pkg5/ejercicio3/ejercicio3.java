/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg5.ejercicio3;



/**
 *
 * @author Faby
 */
public class ejercicio3{

   
    public static void main(String[] args) { 
      Autor autor = new Autor("Galeano","Uruguaya");
      Editorial edi = new Editorial("Planeta","San Matin 223");
      Libro libro = new Libro("El libro de los abrazos", "789654123",edi);
      libro.setAutor(autor);
      
      System.out.println(libro);
        
        
    }
    
}
