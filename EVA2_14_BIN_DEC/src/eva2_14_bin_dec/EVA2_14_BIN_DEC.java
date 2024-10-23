/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_bin_dec;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_BIN_DEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce un numero decimal");
        int numero;
        numero = captu.nextInt();
        String binario = "";
        while(numero > 0){
            binario = numero % 2 + binario;
            numero = numero /2;
        }
        System.out.println("el numero binario es " + binario);
    }
    
}
