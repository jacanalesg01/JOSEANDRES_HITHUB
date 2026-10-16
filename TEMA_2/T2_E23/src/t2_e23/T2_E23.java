/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2_e23;
import java.util.Scanner;// importo el escanner
/**
 *
 * @author josea
 */
public class T2_E23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio,unidades,total;//declaro las varibles
        Scanner entrada = new Scanner (System.in);//hago un escaneo
        System.out.println ("Por favor,introduzca el precio del modelo del ordenador que desea comprar: ");
        precio=entrada.nextDouble();//leo los datos introducidos
        System.out.println ("¿Cuántas unidades quiere llevarse?" );
        unidades=entrada.nextDouble();//leo los datos introducidos
        total=precio * unidades;//hago el calculo del precio total
         System.out.println ("El precio total de su compra es de:"+ total + "Euros.");
        
    }
    
}
