/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos2dosem;

import java.util.Scanner;

/**
 *
 * @author daniel.makoszay
 */
public class Reto3 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Valor de a: ");
        double a = Double.parseDouble(in.nextLine());
        System.out.println("Valor de b: ");
        double b = Double.parseDouble(in.nextLine());
        System.out.println("Valor de c: ");
        double c = Double.parseDouble(in.nextLine());
        

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        if (Double.isNaN(x1) || Double.isNaN(x2)){
            System.out.println("La respuesta arroja valores imaginarios");
        } else System.out.println("Los valores son: " + x1 + ", " + x2);
        
        long roundx1 = Math.round (x1);
        long roundx2 = Math.round(x2);
        int resultado; 
        if (Math.abs(roundx1) > Math.abs(roundx2)){
            resultado = (int) Math.abs(roundx1);
        }else 
           resultado = (int) Math.abs(roundx2); 
        
        System.out.println(resultado);
    }
    
   
   
}
