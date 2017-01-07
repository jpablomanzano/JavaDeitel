//Programa que asiste a un alumno de primaria para aprender a multiplicar.
//Si la respuesta es correcta pregunta de nuevo, si la respuesta es erronea pide que lo intente de nuevo

import java.util.Scanner;
import java.util.Random;

public class AsistenciaPorComputadora
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
          System.out.println(contadorCorrectas);
          System.out.println(contadorIncorrectas);

        }
        else
        {
          System.out.println("Hasta luego!");
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
                System.out.print("No, Por favor intenta de nuevo: ");
                break;
            case 1:
                System.out.print("Incorrecto. Intenta una vez más: ");
                break;
            case 2:
                System.out.print("No te rindas! Intenta de nuevo: ");
                break;
            case 3:
                System.out.print("No. Sigue intentando: ");
                break;
        }
    }
}
