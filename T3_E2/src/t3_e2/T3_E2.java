/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e2;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class T3_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1,num2,R;
        Scanner entrada = new Scanner (System.in);//hago un escaneo
        System.out.println ("Por favor, introduzca un numero: ");
        num1=entrada.nextInt();//leo los datos introducidos
        System.out.println ("Por favor, introduzca un numero: ");
        num2=entrada.nextInt();//leo los datos introducidos
        if (num1>10){
            R=num1*num2;
            System.out.println ("La operación que se realizó es producto y el resultado es: "+R);
            
    }
        else {
            R=num1+num2;
            System.out.println ("La operación que se realizó es suma y el resultado es: "+R);
        }
    }
    
}
