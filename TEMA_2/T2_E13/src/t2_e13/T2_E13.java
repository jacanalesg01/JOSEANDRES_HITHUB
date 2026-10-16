/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2_e13;

/**
 *
 * @author josea
 */
public class T2_E13 {

    /**
     * @nombre:Jose Andres
     */
    public static void main(String[] args) {
     int num1=23;
     int num2=54;//declaro la variable
     int x=0; //introduco una tercera variable
     System.out.println("La variable num1 contiene el valor " +num1+ "y la variable num2 contiene el valor "+num2);//la muestro en pantalla
     x=num1;
     num1=num2;
     num2=x;
         
     System.out.println("La variable num1 contiene el valor " +num1+ "y la variable num2 contiene el valor "+num2);
    }
    
}
