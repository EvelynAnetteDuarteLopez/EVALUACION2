/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_vocales;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA2_13_VOCALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner captu = new Scanner(System.in);
       String cadena;
       int count = 0, i;
       char letra;
       System.out.println("ingresa la frase:");
       cadena = captu.nextLine();
       
       for(i=0; i<cadena.length(); i++){
           letra = Character.toLowerCase(cadena.charAt(i));
           if(letra == 'a'|| letra== 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u'){
               count++;
           }
               
       }
       System.out.println("la cantidad de vocales en la frase es:" + count);
       
    }
    
}
