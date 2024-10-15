/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_9_ACCESO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario="", pwd="";
        Scanner captu = new Scanner(System.in);
        //PANTALLA DE VALIDACION: USUARIO Y CONTRASEÑA
        while(!(usuario.equals("admin") && pwd.equals("1234"))){
            System.out.println("usuario:");
        usuario = captu.nextLine();
        System.out.println("contraseña:");
        pwd = captu.nextLine();
        }
         //!--> operador logico de negacion: NOT
         //PROGRAMA PRINCIPAL
        System.out.println("PROGRAMA PRINCIPAL");
    }
    
}
