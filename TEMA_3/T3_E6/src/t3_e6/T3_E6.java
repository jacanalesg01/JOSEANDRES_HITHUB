/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e6;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class T3_E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           float num1;
        Scanner entrada = new Scanner (System.in);//hago un escaneo
        System.out.println ("Por favor, introduzca su nota:  ");
        num1=entrada.nextFloat();//leo los datos introducidos
        
        if (num1>0 && num1<4.99){// hago una operación para determinar cual es la nota
            
            System.out.println ("La nota es suspenso");//muestro el resultado en pantalla
            
    }
        else if(num1>4.99&& num1<6.99) {// hago una operación para determinar cual es la nota
            System.out.println ("La nota es bien" );//muestro el resultado en pantalla
        }
        else if(num1>6.99&& num1<8.99) {// hago una operación para determinar cual es la nota
            System.out.println ("La nota es notable" );//muestro el resultado en pantalla
        }
        else if(num1>8.99&& num1==10) {// hago una operación para determinar cual es la nota
            System.out.println ("La nota es sobresaliente" );//muestro el resultado en pantalla
        }
        else if(num1<0 || num1>10) {
            System.out.println ("Error, debes introducir un numero entre el 0 y el 10" );//muestro el resultado en pantalla
        }
        
      
       
    }
    
}
