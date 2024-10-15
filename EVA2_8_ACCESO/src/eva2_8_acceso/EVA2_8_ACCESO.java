/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_acceso;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_8_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, pwd;
        Scanner captu = new Scanner(System.in);
        //PANTALLA DE VALIDACION: USUARIO Y CONTRASEÑA
        do{
            System.out.println("usuario:");
        usuario = captu.nextLine();
        System.out.println("contraseña:");
        pwd = captu.nextLine();
        }while(!(usuario.equals("admin") && pwd.equals("1234")));
         //!--> operador logico de negacion: NOT
         //PROGRAMA PRINCIPAL
        System.out.println("PROGRAMA PRINCIPAL");
        
         
        
    }
    
}
