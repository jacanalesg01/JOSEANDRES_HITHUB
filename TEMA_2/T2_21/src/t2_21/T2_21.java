/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2_21;
import java.util.Scanner;//importo el scanner para leer datos de pantalla
/**
 *
 * @author josea
 */
public class T2_21 {

    public static void main(String[] args) {
      double segundos,dias,h,minutos,s = 0;// nombro las variables
      Scanner entrada = new Scanner (System.in); //hago un escaner
      System.out.println("Por favor,introduzca un numero de segundos");
      segundos= entrada.nextDouble();//leo los datos introducidos
      h = segundos / 3600;
      dias = h / 24;
      minutos = h * 60;
      System.out.println(segundos + " segundos hacen un total de: " + dias + " dias, " + h + "horas, " + minutos + " minutos y " + s + " segundos.");
      
    }
    
}
