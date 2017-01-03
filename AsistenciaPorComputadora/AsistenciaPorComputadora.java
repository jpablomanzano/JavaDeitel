//Programa que asiste a un alumno de primaria para aprender a multiplicar.
//Si la respuesta es correcta pregunta de nuevo, si la respuesta es erronea pide que lo intente de nuevo

import java.util.Scanner;
import java.util.Random;

public class AsistenciaPorComputadora
{

    //Creo mi objeto random
    private static final Random numerosAleatorios = new Random();
    private enum Estado {CONTINUA, TERMINA} //enum para evaluar si se continua la prueba o no

    //Inicio main
    public static void main(String[] args)
    {
        //objeto scaner
        Scanner input = new Scanner(System.in);

        int numeroAEvaluar; // guarda el la respuesta correcta
        int respuesta; //guarda la respuesta del usuario
        Estado miEstado = Estado.CONTINUA; // guarda el estado de continuidad del test


        System.out.println("Bienvenido al asistente de la multiplicación. Presione -1 para salir.");
        
        //Ciclo termina hasta que el usuario presione -1
        while (miEstado == Estado.CONTINUA)
        {

            numeroAEvaluar = preguntar(); //Ejecuto metodo preguntar y el valor de retorno lo guardo en numeroAEvaluar
            respuesta = input.nextInt(); // Asigno la respuesta del usuario

            //Evaluo si es -1 y termino el programa
            if (respuesta == -1)
            {
                miEstado = Estado.TERMINA; //Cambio el estado a termina
                System.out.println("Hasta luego"); //Despido el programa
            }
            //Si no es -1 entonces continua el programa
            else
            {
                //Evaluo si la respuesta es correcta
                if (respuesta == numeroAEvaluar)
                {
                    respuestaCorrecta(); // Ejecuto el método respuestaCorrecta
                }
                else  //Si la respuesta no es correcta
                {
                    //Mientras la respuesta sea incorrecta se sigue preguntando
                    while (respuesta != numeroAEvaluar)
                    {
                        respuestaIncorrecta(); //Ejecuto metodo respuestaIncorrecta
                        respuesta = input.nextInt(); // Asigno la respuesta a variable
                    }
                    respuestaCorrecta(); //Ejecuto metodo respuestaCorrecta
                }

                miEstado = Estado.CONTINUA;
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
