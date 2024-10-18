/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_validar_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11_VALIDAR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diaSem;
        Scanner captu = new Scanner(System.in);
        while(true){
        System.out.println("Captura el numero del dia (1 a 7):");
        diaSem = captu.nextInt();
        captu.hasNextLine();
        
        if(diaSem >=1 && diaSem <= 7 )
            break;
        }
        switch(diaSem){
            case 1:
                System.out.println("Domingo");
                break;//interumpe el switch
                case 2:
                System.out.println("Lunes");
                break;//interumpe el switch
                case 3:
                System.out.println("Martes");
                break;//interumpe el switch
                case 4:
                System.out.println("Miercoles");
                break;//interumpe el switch
                case 5:
                System.out.println("Jueves");
                break;//interumpe el switch
                case 6:
                System.out.println("Viernes");
                break;//interumpe el switch
                case 7:
                System.out.println("Sabado");
                break;//interumpe el switch
                
                default:
                
        }
      
    }
    
}
