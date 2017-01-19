/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJava;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author juanpablomanzanomunoz
 */

//Programa que imprime patrón de damas mediante asteriscos

public class Ejercicicio2_27 
{   
     //Creo mi objeto random
    private static final Random numerosAleatorios = new Random();

    //Inicio main
    public static void main(String[] args)
    {
        //objeto scaner
        Scanner input = new Scanner(System.in);

        int numeroAEvaluar; // guarda el la respuesta correcta
        int respuesta; //guarda la respuesta del usuario
        int contadorPreguntas = 1;
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        int continuar = 1;
        
        while (continuar == 1) 
        {            
            System.out.print("Bienvenido al asistente de la multiplicacion, presione 1 para continuar y 2 para salir: ");
            respuesta = input.nextInt();

            if (respuesta == 1)
            {
              while (contadorPreguntas <= 10)
              {
                  numeroAEvaluar = preguntar();
                  respuesta = input.nextInt();

                  if (respuesta == numeroAEvaluar)
                  {
                      respuestaCorrecta();
                      contadorCorrectas++;
                  }
                  else
                  {
                    respuestaIncorrecta();
                    contadorIncorrectas++;
                  }

                  contadorPreguntas++;
              }

              if (contadorCorrectas > 7.5)
              {
                System.out.println("Esta listo para el siguiente nivel.");
              }
              else
              {
                System.out.println("Por favor pida ayuda adicional a su profesor.");
              }

              System.out.println(contadorCorrectas);
              System.out.println(contadorIncorrectas);

            }
            else
            {
              System.out.println("Hasta luego!");
              break;
            }
        }

    } //fin main


    public static int preguntar()
    {
     int num1;
     int num2;
     int multiplicacion;

     num1 = 1 + numerosAleatorios.nextInt(10);
     num2 = 1 + numerosAleatorios.nextInt(10);

    System.out.printf("¿Cuánto es %d por %d?: ", num1, num2);

    multiplicacion = num1 * num2;

    return multiplicacion;
    }

    //Método que imprime un mensaje según sea el caso
    public static void respuestaCorrecta()
    {
        //Respuesta guarda un número aleatorio del 0 al 3
        int respuesta = numerosAleatorios.nextInt(3);

        //Evaluo a respuesta y segun sea el valor imprimo
        switch(respuesta)
        {
            case 0:
                System.out.println("Muy bien!");
                break;
            case 1:
                System.out.println("Excelente!");
                break;
            case 2:
                System.out.println("Buen trabajo!");
                break;
            case 3:
                System.out.println("Sigue así!");
                break;
        }
    }

    public static void respuestaIncorrecta()
    {
        int respuesta = numerosAleatorios.nextInt(3);

        switch(respuesta)
        {
            case 0:
                System.out.println("No, Por favor intenta de nuevo: ");
                break;
            case 1:
                System.out.println("Incorrecto. Intenta una vez más: ");
                break;
            case 2:
                System.out.println("No te rindas! Intenta de nuevo: ");
                break;
           case 3:
                System.out.println("No. Sigue intentando: ");
                break;
        }
    }
}
