package t4_e17;

import java.util.Scanner;

public class T4_E17 {

    public static char random() { // Genera una letra minúscula aleatoria (a-z)
        int valor = (int) (Math.random() * (122 - 97 + 1)) + 97; // Número aleatorio entre 97 ('a') y 122 ('z')
        return (char) valor; // (char) convierte el número ASCII en su letra
    }

    public static char pedirLetra() { // Pide una letra al usuario y la devuelve
        char letra;
        Scanner entrada = new Scanner(System.in); // Para leer del teclado
        System.out.println("Intente adivinar la letra (a-z): ");
        letra = entrada.next().charAt(0); // No existe nextChar(): se lee texto y se coge el primer carácter
        return letra; // Devuelve la letra al main
    }

    public static boolean comprobacion(char letra, char valor) { // Compara la letra del usuario con la secreta
        boolean correcto = false; // Empieza en "no acertado"
        if (letra == valor) { // Si son iguales...
            correcto = true; // ...ha acertado
        } else if (letra < valor) { // Si la del usuario tiene menor código ASCII...
            System.out.println("La letra secreta esta DESPUES en el alfabeto"); // ...la secreta va más adelante
        } else { // Si no es igual ni menor, es mayor...
            System.out.println("La letra secreta esta ANTES en el alfabeto"); // ...la secreta va más atrás
        }
        return correcto; // true si acertó, false si no
    }

    public static void resultado(boolean acierto, int intentos) { // Muestra el mensaje final
        if (acierto) { // Equivale a acierto == true
            System.out.println("¡Enhorabuena has acertado!");
            System.out.println("Intentos necesarios: " + intentos); // Muestra el total de intentos
        } else {
            System.out.println("Has fallado, vuelve a intentarlo :)");
        }
    }

    public static void main(String[] args) {
        char letraSecreta; // Letra que genera el ordenador
        char letraUsuario; // Letra que escribe el usuario
        boolean acierto = false; // Indica si ha acertado
        int contador = 0; // Cuenta los intentos

        letraSecreta = random(); // Se genera una sola vez, antes del bucle

        do { // Se ejecuta al menos una vez
            letraUsuario = pedirLetra(); // Pide la letra
            contador++; // Suma un intento
            acierto = comprobacion(letraUsuario, letraSecreta); // Primero la del usuario, luego la secreta (mismo orden que los parámetros)
            resultado(acierto, contador); // Muestra el mensaje
        } while (!acierto); // Repite mientras NO haya acertado
    }
}