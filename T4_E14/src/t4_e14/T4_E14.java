/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_e14;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class T4_E14 {

    public static int pedirNumero(){
        int numero;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Por favor introduzca un numero mayor q 0");
        numero= entrada.nextInt();
        return numero;
    }
    
    public static void comprobacion (int numero){
        if (numero<0){
            System.out.println("Error, el numero introducido debe ser mayor q 0");
            
        }
    }
    public static void calculos ( int numero){
        int aux=3;
        System.out.println("los multiplos de 3, entre 1 y " + numero + " son: ");
        do{
        System.out.println(aux);
         aux=aux + 3;
            
            
            
         
        }while (aux<=numero);
    }
        

    public static void main(String[] args) {
        int numero;
        numero=pedirNumero();
        comprobacion(numero);
            if (numero<0){
            do{
            numero=pedirNumero();
            comprobacion(numero);  
            }while(numero<0);
        }
        calculos(numero); 
        
    }
}
    

