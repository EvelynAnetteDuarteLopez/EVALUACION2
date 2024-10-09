/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         int num;
         String texto;
       
        Scanner captu = new Scanner(System.in);
        System.out.println("intoduce el numero");
        num = captu.nextInt();
        captu.nextLine();
        System.out.println("introduce el texto");
        texto = captu.nextLine();
        captu.nextLine();
        
        for(int i = 0; i < num;++i){
            System.out.println(texto);
        }
            
    }
    
}
