/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e27;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class T3_E27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, num2, menu, resultado, x = 3; // declaro las variables

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero");
        num = entrada.nextInt(); // leo los datos introducidos
        System.out.println("Por favor, introduzca otro numero");
        num2 = entrada.nextInt(); // leo los datos introducidos

        do {
            System.out.println("Introduzca 1 si quiere realizar una suma"); // pido un numero para gestionar el menu
            System.out.println("Introduzca 2 si quiere realizar una resta");
            System.out.println("Introduzca 3 si quiere realizar una multiplicación");
            System.out.println("Introduzca 4 si quiere realizar una division");
            System.out.println("Introduzca 5 si quiere salir del programa");
            menu = entrada.nextInt(); // leo los datos introducidos

            if (menu < 1 || menu > 5) {
                System.out.println("Error introduzca un numero entre 1 y 5");
            }

            switch (menu) {
                case 1: // suma
                    resultado = num + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2: // resta
                    resultado = num - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3: // multiplicacion
                    resultado = num * num2;
                    System.out.println("El resultado del producto es: " + resultado);
                    break;
                case 4: // division
                    try {
                        resultado = num / num2;
                        System.out.println("El resultado de la division es: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage()); // si se divide entre 0 sale este mensaje
                    }
                    break;
                case 5: // salir
                    System.out.println("Has salido del programa");
                    break;
            }
        } while (menu != 5);
    }
}