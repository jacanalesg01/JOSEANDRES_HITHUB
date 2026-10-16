/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2.e24;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class T2E24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double P,LM,BD,ED,SI,FOL,media;
         Scanner entrada = new Scanner (System.in);//hago un escaneo
        System.out.println ("Por favor, introduzca la nota de Programación: ");
        P=entrada.nextDouble();//leo los datos introducidos
        System.out.println ("Introduzca la nota de Lenguajes de Marcas:" );
        LM=entrada.nextDouble();//leo los datos introducidos
        System.out.println ("Introduzca la nota de Bases de Datos:" );
        BD=entrada.nextDouble();//leo los datos introducidos
        System.out.println ("Introduzca la nota de Entornos de Desarrollo:");
        ED=entrada.nextDouble();//leo los datos introducidos
        System.out.println ("Introduzca la nota de Sistemas Informáticos:" );
        SI=entrada.nextDouble();//leo los datos introducidos
        System.out.println ("Por último, introduzca la nota de Formación y Orientación Laboral:" );
        FOL=entrada.nextDouble();//leo los datos introducidos
        media=(P+LM+BD+ED+SI+FOL)/6;
         System.out.println ("Su nota media del curso es de:"+media );
        
    }
    
}
