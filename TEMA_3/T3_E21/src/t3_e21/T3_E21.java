/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e21;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class T3_E21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, num2, resultado, x = 3; // declaro las variables

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero que quiera dividir");
        num = entrada.nextDouble(); // leo los datos introducidos
        System.out.println("Por favor, introduzca un numero que divide al anterior");
        num2 = entrada.nextDouble(); // leo los datos introducidos

        try {
            resultado = num / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            resultado = 0;
        }

        System.out.println("El resultado de la division es: " + resultado);
    }
}