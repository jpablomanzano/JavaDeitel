/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author juanpablomanzanomunoz
 */
public class JavaApplication1 {

    // Programa que calcula la suma, resta, multiplicacion y division de 2 numeros 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int suma;
        int resta;
        int division;
        int multiplicacion;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2;
        
        resta = numero1 - numero2;
        
        division = numero1 / numero2;
        
        multiplicacion = numero1 * numero2;
        
        System.out.printf("El resultado de la suma es: %d\n", suma);
        System.out.printf("El resultado de la resta es: %d\n", resta);
        System.out.printf("El resultado de la division es: %d\n", division);
        System.out.printf("El resultado de la multiplicacion es: %d\n", multiplicacion);
       
        
        /*
        Scanner entrada = new Scanner(System.in);
        
        int numero1; //Creo mi variable para mi primer numero
        int numero2; //Variable segundo número
        int numero3; // variable para tercer numero
        int resultado; // Variable para almacenar la suma de numero1 y numero2
        
        System.out.print("Escriba el primer número: ");//Indicador
        numero1 = entrada.nextInt(); //Guardo la captura en mi variable asignada
        
        System.out.print("Escriba el segundo número: ");//Indicador
        numero2 = entrada.nextInt(); // Guardo en la variable asignada
        
        System.out.print("Escriba el tercer número: "); // Indicador
        numero3 = entrada.nextInt(); //asigno a numero 3
        
        resultado = numero1 * numero2 * numero3; //Calculo el producto y lo asigno a resultado
        
   
        System.out.printf("El resultado de multiplicar %d por %d y %d, es igual a %d\n",
                            numero1, numero2, numero3, resultado);
        
        System.out.printf("x =");
        
        
        
        */
     
    }//fin metodo main
    
   
    
}//Fin clase suma
