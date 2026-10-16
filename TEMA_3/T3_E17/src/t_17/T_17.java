/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t_17;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class T_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double num,resultado,x=3;//declaro las varibles
             do{
           
            Scanner entrada = new Scanner (System.in);
            System.out.println("Por favor,introduzca un numero para calcular su raiz cuadrada");
            num=entrada.nextDouble();//leo los datos introducidos
            if (num>0){
           resultado = Math.sqrt(num);
           System.out.println("El resultado de la raiz es: "+resultado);
           
            }
            else if(num<0){
            System.out.println("Eror, por favor introduzca un numero positivo");
            }
            else if(num>0){
            resultado = Math.sqrt(num);
            System.out.println("El resultado de la raiz es: "+resultado);
           
            }
            
       }while(x==3);
    }
    
}
