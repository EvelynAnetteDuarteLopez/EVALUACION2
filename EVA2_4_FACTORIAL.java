/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_factorial;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fact, valor;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura la factorial");
        valor = captu.nextInt();
        captu.nextLine();
        int acum = 1;
        for(int i = 1; i <= valor; i++){
            acum = acum * i;
        }
        System.out.println("factorial de" + valor + "=" +  acum);
              
    }
    
}
