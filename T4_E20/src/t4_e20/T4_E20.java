/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_e20;

import java.util.Scanner; // Necesario para leer del teclado

/**
 *
 * @author josea
 */
public class T4_E20 {

    static final String CAPITAL = "Madrid"; // Constante: respuesta correcta de la 1ª pregunta
    static final String DESCUBRIDOR = "Cristobal Colon"; // Constante: respuesta correcta de la 2ª pregunta

    public static int pregunta1() { // Hace la 1ª pregunta y devuelve los puntos (5 o 0)
        Scanner entrada = new Scanner(System.in); // Para leer del teclado
        System.out.print("1ª PREGUNTA: ¿Cual es la capital de España?: ");
        String respuesta = entrada.nextLine(); // Lee la respuesta completa (nextLine admite espacios)
        int puntos = 0; // Empieza sin puntos
        if (respuesta.equalsIgnoreCase(CAPITAL)) { // Compara textos con equals, ignorando mayúsculas
            System.out.println("Muy bien, respuesta correcta.");
            puntos = 5; // Acierto: suma 5
        } else {
            System.out.println("No es correcto. La respuesta correcta seria " + CAPITAL);
        }
        return puntos; // Devuelve los puntos al main
    }

    public static int pregunta2() { // Hace la 2ª pregunta y devuelve los puntos (5 o 0)
        Scanner entrada = new Scanner(System.in);
        System.out.print("2ª PREGUNTA: ¿Quien descubrio America?: ");
        String respuesta = entrada.nextLine();
        int puntos = 0;
        if (respuesta.equalsIgnoreCase(DESCUBRIDOR)) {
            System.out.println("Muy bien, respuesta correcta.");
            puntos = 5;
        } else {
            System.out.println("No es correcto. La respuesta correcta seria " + DESCUBRIDOR);
        }
        return puntos;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota; // Nota final: 0, 5 o 10
        System.out.println("EXAMEN DE CULTURA GENERAL");
        nota = pregunta1(); // Guarda los puntos de la 1ª pregunta
        nota = nota + pregunta2(); // Suma los puntos de la 2ª
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }

}