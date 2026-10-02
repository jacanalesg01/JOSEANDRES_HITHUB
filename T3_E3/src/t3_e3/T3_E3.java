/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e3;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class T3_E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3,R;
        Scanner entrada = new Scanner (System.in);//hago un escaneo
        System.out.println ("Por favor, introduzca el primer numero:  ");
        num1=entrada.nextInt();//leo los datos introducidos
        System.out.println ("Ahora, introduzca un segundo numero: ");
        num2=entrada.nextInt();//leo los datos introducidos
        System.out.println ("Por último, introduzca un tercer numero:  ");
        num3=entrada.nextInt();//leo los datos introducidos
        
        if (num1>num2&&num1>num3){// comparo los numeros para ver cual es mayor
            R=num1*num2;
            System.out.println ("El número mayor de los introducidos es el "+num1);//muestro el resultado en pantalla
            
    }
        else if(num2>num1&&num2>num3){// comparo los numeros para ver cual es mayor
        
            System.out.println ("El número mayor de los introducidos es el "+num2);//muestro el resultado en pantalla
        }
        
        else if(num3>num2&&num3>num2){// comparo los numeros para ver cual es mayor
        
            System.out.println ("El número mayor de los introducidos es el "+num3);//muestro el resultado en pantalla
        
        }
    }
    
}
