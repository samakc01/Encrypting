/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos2dosem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daniel.makoszay
 */
public class Reto1 {
    
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner (System.in); 
        System.out.println("Introduce tu frase: ");
        String frase = in.nextLine();
        convertir_a_f conversion = new convertir_a_f(frase);
        
        
        
        String frase_f = conversion.a_f();
        System.out.println(frase_f);
        
        regresar_f regreso = new regresar_f (frase_f);
        
        
        System.out.println(regreso.de_f());
      
    }
    
}
