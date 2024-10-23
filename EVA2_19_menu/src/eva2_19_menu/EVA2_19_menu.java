/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_menu;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA2_19_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu[];
        int precios[];
        Scanner captu = new Scanner(System.in);
        int cant;
        System.out.println("cuantos productos tendra el menu: ");
        cant = captu.nextInt();
        captu.nextLine();
        menu = new String[cant]; //tamaño del arreglo (cant)
        precios = new int [cant];
        for(int i = 0; i < menu.length; i++){
            System.out.println("Nombre del producto: ");
            menu[i] = captu.nextLine();
            System.out.println("precio:");
            precios [i] = captu.nextInt();
            captu.nextLine();
            
        }
         for(int i = 0; i < menu.length; i++){
            System.out.println(i + "-" + menu[i] + "$" + precios[i]);
    
        }
    }
    
}
