/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e24;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class T3_E24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int x=3,y=0,z=0,correcto=0;
        Scanner entrada = new Scanner (System.in);
        while(correcto==0){
            try{
                System.out.println("Por favor,introduzca un numero mayor que 1");
                y=entrada.nextInt();//leo los datos introducidos
                if (y>1){
                    correcto=1;
                }
                else{
                    System.out.println("Error: el numero tiene que ser mayor que 1");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Error: tienes que introducir un numero, no letras");
                entrada.next();
            }
        } 
        do {
            System.out.println(x);
            x=x+3;
            z=z+1;
            
        } while(x<y);
        System.out.println(z);
    }
}