/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_e16;

/**
 *
 * @author josea
 */
public class T3_E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=21,num=0;//declaro las variables
        System.out.println("Los números impares existentes entre el número 20 y el 160 son: " );
     while(x<160){//creo un bucle q me escriba los numeros
         
         System.out.println(x);
         x=x+2;
         num++;
              }
     System.out.println("La cantidad de números impares impresos han sido:"+num);

    }
    
}
