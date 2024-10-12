/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica6;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String cade = "";
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce un numero");
        num = captu.nextInt();
        captu.nextLine();
        
        for(int i = 1; i <= num; i++){
            cade = cade + "*";
            System.out.println(cade);
        }
        for(int i = 5; i >=1; i--){
            cade = "";
            for(int j = 1; j <= i; j++){
                cade = cade + "*";
            }
            System.out.println(cade);
        }
        
        
    }
    
}
