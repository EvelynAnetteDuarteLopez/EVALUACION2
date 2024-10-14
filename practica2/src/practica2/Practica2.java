/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("ingrese numero entero");
        num1 = captu.nextInt();
        captu.nextLine();
        
        System.out.println("ingrese numero entero");
        num2 = captu.nextInt();
        captu.nextLine();
        
        int nmayor = Math.max(num1, num2);
        int nmenor = Math.min(num1, num2);
        System.out.println("forma descendente");
        for(int i = nmayor;i>=0; i-- ){
            System.out.println(i);
            
        }
        System.out.println("forma ascendente");
        for(int i = 0; i <= nmayor; i++){
            System.out.println(i);
        }
        
        
    }
    
}
