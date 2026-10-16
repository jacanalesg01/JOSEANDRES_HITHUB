/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e9;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class T3_E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4, x; // declaro las variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero");
        num1 = entrada.nextInt(); // leo los datos introducidos
        System.out.println("Por favor, introduzca un segundo numero");
        num2 = entrada.nextInt(); // leo los datos introducidos
        System.out.println("Por favor, introduzca un tercer numero");
        num3 = entrada.nextInt(); // leo los datos introducidos
        System.out.println("Por favor, introduzca un cuarto numero");
        num4 = entrada.nextInt(); // leo los datos introducidos

        do {
            if (num2 < num1) { // intercambio num1 y num2
                x = num1;
                num1 = num2;
                num2 = x;
            }
            if (num3 < num2) { // intercambio num2 y num3
                x = num2;
                num2 = num3;
                num3 = x;
            }
            if (num4 < num3) { // intercambio num3 y num4
                x = num3;
                num3 = num4;
                num4 = x;
            }
        } while (!(num1 <= num2 && num2 <= num3 && num3 <= num4));

        System.out.println("Los numeros ordenados son: " + num1 + " " + num2 + " " + num3 + " " + num4);//imprimo el resultado en pantalla
    }
}