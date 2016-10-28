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
public class Ejercicio2_24 {
    
    public static void main(String[] args) {
        
        //Declaro mi objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Declaro mis variables
        int numero1; //Primer número
        int numero2; // SEgundo numero
        int numero3; //Tercer número
        int numero4; //Cuarto 
        int numero5; //Quinto
        
        
        //Solicito mis 5 números
        
        System.out.print("Ingrese el primer número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        numero3 = entrada.nextInt();
        
        System.out.print("Ingrese el cuarto número: ");
        numero4 = entrada.nextInt();
        
        System.out.print("Ingrese el cuarto número ");
        numero5 = entrada.nextInt();
        
        
        //Comparo para validar mayores
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero3 && numero1 > numero5)
            System.out.printf("El mayor es el %d\n",numero1);
        
        if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5)
            System.out.printf("El mayor es el %d\n",numero2);
        
        if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5)
            System.out.printf("El mayor es el %d\n",numero3);
            
        if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5)
            System.out.printf("El mayor es el %d\n",numero4);
        
        if (numero5 > numero1 && numero5 > numero2 && numero5 > numero3 && numero5 > numero4)
            System.out.printf("El mayor es el %d\n",numero5);
        
        
        // Comparo para validar menores
        if (numero1 < numero2 && numero1 < numero3 && numero1 < numero3 && numero1 < numero5)
            
            System.out.printf("El menor es el %d\n",numero1);
        
        if (numero2 < numero1 && numero2 < numero3 && numero2 < numero4 && numero2 < numero5)
            System.out.printf("El menor es el %d\n",numero2);
        
        if (numero3 < numero1 && numero3 < numero2 && numero3 < numero4 && numero3 < numero5)
            System.out.printf("El menor es el %d\n",numero3);
        
        if (numero4 < numero1 && numero4 < numero2 && numero4 < numero3 && numero4 < numero5)
            System.out.printf("El menor es el %d\n",numero4);
        
        if (numero5 < numero1 && numero5 < numero2 && numero5 < numero3 && numero5 < numero4)
            System.out.printf("El menor es el %d\n",numero5);
        
        
        
        
    }
    
}
