/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_29;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class T3_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, intentos = 0; // declaro las variables
        int aleatorio = (int) (Math.random() * 100) + 1; // numero aleatorio entre 1 y 100

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Introduzca un numero entre 1 y 100"); // pido un numero

            num = entrada.nextInt(); // leo los datos introducidos
            intentos++; // cuento los intentos que hace para adivinar

            if (num < aleatorio) {
                System.out.println("El numero es mayor, por favor introduzca un nuevo numero");
            } else if (num > aleatorio) {
                System.out.println("El numero es menor, por favor introduzca un nuevo numero");
            } else {
                System.out.println("Enhorabuena has acertado el numero en " + intentos + " intentos");
            }

        } while (aleatorio != num);
    }
}