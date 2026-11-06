/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_e26;

import java.util.Scanner; // Necesario para leer del teclado

/**
 *
 * @author josea
 */
public class T4_E26 {

    public static boolean esPrimo(int numero) { // Recibe un número y devuelve true si es primo
        boolean primo = true; // Supone que es primo hasta que se demuestre lo contrario
        if (numero < 2) { // El 0, el 1 y los negativos no son primos
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) { // Prueba divisores desde el 2 hasta el número anterior
                if (numero % i == 0) { // Si el resto es 0, i es un divisor...
                    primo = false; // ...y por tanto no es primo
                }
            }
        }
        return primo; // Devuelve el resultado al main
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Para leer del teclado
        int numero; // Número que escribe el usuario
        System.out.println("Introduzca un numero entero:");
        numero = entrada.nextInt(); // Lee el número
        if (esPrimo(numero)) { // Llama al método; equivale a esPrimo(numero) == true
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }

}