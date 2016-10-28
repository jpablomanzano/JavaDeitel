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

//Calcular si un número es par o impar

public class Ejercicio2_25 {

    public static void main(String[] args) {
        
        //Declar mis variables
        
        int numero = 0;
        
        //Declaro mi objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese su número: ");//Solicito número al usuario
        numero = entrada.nextInt();
        
        
        if (numero%2==0){
            System.out.println("Es par");
        }else{
            
            System.out.println("Es impar");
        }
           
        
        
        
    }
    
    
    
}
