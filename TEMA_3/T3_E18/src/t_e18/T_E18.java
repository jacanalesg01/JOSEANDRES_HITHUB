/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t_e18;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class T_E18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             String password1;
             int x=3;//declaro las varibles
             do{
            Scanner entrada = new Scanner (System.in);
            System.out.println("Por favor,introduzca su contraseña");
            password1 = entrada.next();//leo los datos introducidos
            if (password1.equals("password")){
           System.out.println("enhorabuena, su contraseña es correcta");
           break;
            }
            else if(!password1.equals("password")){
            System.out.println("contraseña equivocada");
            x++;
            }

            
       }while(x<6);
    }
    
}
