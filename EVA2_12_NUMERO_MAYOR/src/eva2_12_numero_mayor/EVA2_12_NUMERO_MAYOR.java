/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_numero_mayor;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA2_12_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int numM = -9999;
        Scanner captu = new Scanner(System.in);
        while(true){
            System.out.println("captura el numero");
            num = captu.nextInt();
            captu.nextLine();
            if(num > numM){
                numM = num;
                
            }
            if(num >= 1 && num <= 1)
                break;
        }
        
        System.out.println("numM es "+ numM);
        
        
    }
    
}
