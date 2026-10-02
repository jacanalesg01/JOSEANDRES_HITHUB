/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2_22;
import java.util.Scanner;//importo el scanner para leer datos de pantalla
/**
 *
 * @author josea
 */
public class T2_22 {
    public static void main(String[] args) {
    double lado,perimetro,area;//declaro las varibles
    Scanner entrada = new Scanner (System.in); //hago un escaner
    System.out.println("Por favor,introduzca la medida de un lado");
    lado= entrada.nextDouble();//leo los datos introducidos
    perimetro= 3*lado;
    area =0.43301270189 * lado * lado; //calculo aera 
    System.out.println("El área de un triángulo de lado: " + lado + " es: " + area);
    System.out.println("El perimetro de un triángulo de lado: " + lado + " es: " + perimetro);
    }

}
