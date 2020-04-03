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
public class Reto2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserte frase: ");
        String[] frase = in.nextLine().split(" ");

        String rev = "";
        String rev2 = "";
        
        for (int i = 0; i < frase.length ; i++){
            for (int j = frase[i].length() - 1; j >= 0; j--) {
            char letra = frase[i].charAt(j);
            rev += letra;
            }  
            rev += " "; 
        }
        
        System.out.println(rev);
        String[] frase2 = rev.split(" ");

        for (int i = 0; i < frase2.length ; i++){
            for (int j = frase2[i].length() - 1; j >= 0; j--) {
            char letra = frase2[i].charAt(j);
            rev2 += letra;
            }  
            rev2 += " "; 
        }
        System.out.println(rev2);
        
    }

}
