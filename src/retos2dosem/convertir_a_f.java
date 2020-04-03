/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos2dosem;

/**
 *
 * @author daniel.makoszay
 */
public class convertir_a_f {
    
    String frase;
    
    
    public convertir_a_f (String frase){
        this.frase = frase;
    }
            
    public String a_f(){
        String [] arrA = frase.split(" ");
        String [][] arrB = new String [15][10];
        String [] arrF = new String [15]; 
        String fraseF = "";

        String vocales = "aeiouAEIOU";
        
        int indice_palabras = 0;
        int indice_silabas = 0;
        for ( String ss : arrA) {
            int x = 0;
            while (x < ss.length()) {
                if (vocales.indexOf(ss.charAt(x)) >= 0) { // Detecta vocal sola
                    arrB[indice_palabras][indice_silabas] = Character.toString(ss.charAt(x)) + "f" + Character.toString(ss.charAt(x));
                    x ++;
                } else if (x+1 < ss.length() && vocales.indexOf(ss.charAt(x+1)) >= 0) { // Detecta consonante mas vocal 
                    arrB[indice_palabras][indice_silabas] = Character.toString(ss.charAt(x)) + Character.toString(ss.charAt(x+1)) + "f" + Character.toString(ss.charAt(x+1));
                    x ++;
                    x ++;
                } else { // Detecta consonante sola
                    arrB[indice_palabras][indice_silabas] = Character.toString(ss.charAt(x));
                    x ++;
                }
                indice_silabas ++;
            }
            indice_palabras ++;
            indice_silabas = 0;
        }

        for (int i=0; i<arrB.length; i++) { // Une las siglas
            arrF[i] = "";
            for (int j=0; j<arrB[i].length; j++){
                if (arrB[i][j] != null) {
                    arrF[i] += arrB[i][j];
                }
            }
        }
        
        for (String ss : arrF) { // Une la oración 
            fraseF += ss + " ";
        }
        return fraseF;
    }
}
