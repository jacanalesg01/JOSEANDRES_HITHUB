/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2__22;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class T2__22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double lado,perimetro,area,h;//declaro las varibles
    Scanner entrada = new Scanner (System.in); //hago un escaner
    System.out.println("Por favor,introduzca la medida de un lado");
    lado= entrada.nextDouble();//leo los datos introducidos
    System.out.println("Por favor,introduzca la altura del triangulo");
    h= entrada.nextDouble();//leo los datos introducidos
    perimetro= 3*lado;
    area =(lado * h)/2; //calculo aera 
    System.out.println("El área de un triángulo de lado: " + lado + " es: " + area);
    System.out.println("El perimetro de un triángulo de lado: " + lado + " es: " + perimetro);
    }

    }
    
