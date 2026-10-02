/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e5;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class T3_E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int num1;
        Scanner entrada = new Scanner (System.in);//hago un escaneo
        System.out.println ("Por favor, introduzca el primer numero:  ");
        num1=entrada.nextInt();//leo los datos introducidos
        
        if (num1%2==0){// hago una operación paraa saber si el número es par
            
            System.out.println ("El número:"+num1+"es par.");//muestro el resultado en pantalla
            
    }
        else {
            System.out.println ("El número:"+num1+ "es impar." );//muestro el resultado en pantalla
        }
        
      
       
    }
    
}
