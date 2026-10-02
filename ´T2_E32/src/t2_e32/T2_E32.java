/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2_e32;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class T2_E32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero,billetes50,billetes20,billetes10,billetes5,monedas2,monedas1;//declaro las variables
        Scanner entrada = new Scanner (System.in);//hago un escaneo
        System.out.println ("Por favor, indique una cantidad de dinero: ");
       dinero = entrada.nextInt();//leo los datos introducidos
        billetes50=dinero/50;//determino la cantidad de billetes q necesito de cada
        billetes20=(dinero%50)/20;
        billetes10=((dinero%50)%20)/10;
        billetes5=(((dinero%50)%20)%10)/5;
        monedas2=((((dinero%50)%20)%10)%5)/2;
        monedas1=(((((dinero%50)%20)%10)%5)%2)/1;
        System.out.println(dinero + " Euros se descomponen en: " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " +
billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 euros y " + monedas1 + " monedas de 1 euro");//imprimo el resultado en pantalla
        
    }
    
}
