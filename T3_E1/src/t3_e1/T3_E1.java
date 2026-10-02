/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e1;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class T3_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner (System.in);//hago un escaneo
        System.out.println ("Por favor, introduzca un numero: ");
        num=entrada.nextInt();//leo los datos introducidos
        if (num<0){
            System.out.println ("El número introducido es negativo");
            
    }
        else {
            System.out.println ("El número introducido es positivo");
        }
    }
    
}
