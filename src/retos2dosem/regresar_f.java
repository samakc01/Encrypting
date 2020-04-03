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
public class regresar_f {
    String frase;
    
    public regresar_f (String frase){
        this.frase = frase; 
    }
    
    public String de_f(){
        String [] arrA = frase.split(" ");
        
         
        String fraseF = "";
        
        
        
        for (String ss : arrA) {
            ss = ss.replace("afa","a");
            ss = ss.replace("efe","e");
            ss = ss.replace("ifi","i");
            ss = ss.replace("ofo","o");
            ss = ss.replace("ufu","u");
            fraseF += ss + " ";
        }
        return fraseF;
    }
}
