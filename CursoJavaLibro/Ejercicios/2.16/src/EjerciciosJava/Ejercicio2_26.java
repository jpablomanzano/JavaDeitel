/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJava;

import java.util.Scanner;

/**
 *
 * @author juanpablomanzanomunoz
 */

/*Programa que valida 2 números enteros y determina si el primero es múltilplo del segundo
    y lo imprime en pantalla
*/
public class Ejercicio2_26 {
    
    public static void main(String[] args) {
        
        int x; //Fist number
        int y; //SEcond numer
        
        //Declaro mi objeto scanner
        Scanner entrada = new Scanner(System.in);
        
        //Solicito los números y asigno a su respectiva variable
        System.out.print("Ingrese el primer número: ");
        x = entrada.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        y = entrada.nextInt();
        
        if(x%y==0){
            System.out.println("El primero es múltiplo del segundo");
        }else{
           System.out.println("El primero no es múltiplo del segundo");

        }
    }
    
}
