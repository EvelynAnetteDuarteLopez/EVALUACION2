/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce una cadena");
        cade = captu.nextLine();
        
        for(int i = 0; i < cade.length(); i++){
            char caracter = cade.charAt(i);
            if(caracter == 'A' || caracter == 'E' ||
            caracter == 'I' ||caracter == 'O' ||caracter == 'U');
            System.out.println(cade.charAt(i));
            
        }
    }
    
}
