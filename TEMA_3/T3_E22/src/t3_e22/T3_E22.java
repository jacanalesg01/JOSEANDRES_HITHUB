/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e22;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author josea
 */
public class T3_E22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num = 0, num2 = 0, resultado, x = 3; // declaro las variables
        int correcto;

        Scanner entrada = new Scanner(System.in);

        // Primer número
        correcto = 0;
        while (correcto == 0) {
            try {
                System.out.println("Por favor, introduzca un numero que quiera sumar");
                num = entrada.nextDouble(); // leo los datos introducidos
                correcto = 1;
            } catch (InputMismatchException e) {
                System.out.println("Error: tienes que introducir un numero, no letras");
                entrada.next();
            }
        }

        // Segundo número
        correcto = 0;
        while (correcto == 0) {
            try {
                System.out.println("Por favor, introduzca un segundo numero que quiera sumar");
                num2 = entrada.nextDouble(); // leo los datos introducidos
                correcto = 1;
            } catch (InputMismatchException e) {
                System.out.println("Error: tienes que introducir un numero, no letras");
                entrada.next();
            }
        }

        resultado = num + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}