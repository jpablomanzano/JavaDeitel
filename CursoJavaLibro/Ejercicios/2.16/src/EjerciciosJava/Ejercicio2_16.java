/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJava;

import java.util.Scanner;



//Programa que pida al usuario dos numeros enteros, que los compara y muestre el mas grande
public class Ejercicio2_16 {

    /**
     *
     * @param args
     */
    //Creo método main
    public static void main(String[] args) {
        //Declaro mis variables

        int numero1;
        int numero2;
        

        //Creo mi objeto entrada

        Scanner entrada = new Scanner(System.in);

        //Solicito al usuario el primer número
        System.out.print("Ingrese el primer número: ");
        numero1 = entrada.nextInt(); //Asigno a mi variable la captura

        //Solicito mi segundo número
        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada.nextInt(); // Asigno a mi variable la captura

        if(numero1 > numero2) 
            System.out.printf("%d es mas grande\n", numero1);

        if (numero1 < numero2)
            System.out.printf("%d es mas grande\n", numero2);

        if (numero1 == numero2)
            System.out.println("Los numeros son iguales");
        

       
    



    }
}