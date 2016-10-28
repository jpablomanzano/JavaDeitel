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
public class Ejercicio2_17 {
    
    public static void main(String[] args) {
        
        //Declaro mis variables
        int numero1;
        int numero2;
        int numero3;
        int suma;
        int promedio;
        int producto;
        int mayor = 0;
        int menor = 0;
        
        //Declaro mi objeto scanner,entrada.
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Ingrese el primer número: "); //Indicador
        numero1 = entrada.nextInt(); //Asigno el primer numero
        
        System.out.print("Ingrese el segundo número: "); // Indicador
        numero2 = entrada.nextInt(); //Asigno el segundo número
        
        System.out.print("Ingrese el tercer número: "); //Indicator
        numero3 = entrada.nextInt(); // Asigno el tercer numero
        
        suma = numero1 + numero2 + numero3;
        promedio = suma / 3;
        producto = numero1 * numero2 * numero3;
        
        //Comparo los números para saber el menor
        if (numero1 < numero2 && numero1 < numero3) {
            
            menor = numero1;
            
        } else if (numero2 < numero1 && numero2 < numero3) {
            
            menor = numero2;
            
        } else if (numero3 < numero1 && numero3 < numero2) {
            
            menor = numero3;
        }
        
        
         //Comparo los números para saber el mayor
         if (numero1 > numero2 && numero1 > numero3) {
            
            mayor = numero1;
            
        } else if (numero2 > numero1 && numero2 > numero3) {
            
            mayor = numero2;
            
        } else if (numero3 > numero1 && numero3 > numero2) {
            
            mayor = numero3;
        }
        
        
         
        System.out.printf("La suma es igual a: %d\n", suma);
        System.out.printf("El promedio es igual a: %d\n", promedio);
        System.out.printf("El producto es igual a: %d\n", producto);
        System.out.printf("El mayor es: %d\n", mayor);
        System.out.printf("El menor es: %d\n", menor);
        
    }
    
}
