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

//Programa que calcule el diametro, circunferencia y área de un círculo
// Por instrucciones no se utilizan variables para cada calculo
public class Ejercicio2_28 {
    public static void main(String[] args) {
        
        //DEclaro mis variables
        int radio;
        float diametro;
        float circunferencia;
        float area;
        
        //Declaro mi objeto entrada
        Scanner entrada = new Scanner(System.in);
        
        //Solicito al usuario el radio y lo guardo en la variable
        System.out.print("Ingrese el radio: ");
        radio = entrada.nextInt();
        /*
        diametro = radio*2; //Calculo el diametro
        
        circunferencia = (float) (2*(Math.PI)* radio); //Calculo circunferencia
        
        area = (float) (Math.PI*(Math.pow(radio, 2))); // Calculo área
        
        System.out.println(circunferencia);
        System.out.println(diametro);
        System.out.println(area);
        */
        
        
        System.out.printf("La circunferencia es igual a %f\n",2*(Math.PI)*radio);
        System.out.printf("El diametro es: %f\n", (float)(radio*2));
        System.out.printf("El área es: %f\n", Math.PI*(Math.pow(radio, 2)));
        
        
        
        
        
    }
}
