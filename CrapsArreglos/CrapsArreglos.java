import java.util.Random;

public class CrapsArreglos
{
    //Objeto Random para numeros aleatorios
    private static final Random numerosAleatorios = new Random();

    //constantes con los valores expresados en palabras
    private static final int DOS_UNO = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    private enum Estado {CONTINUA, GANO, PERDIO}; //enum que guardara el estado del juego


    public static void main(String[] args)
    {
        int turno; // guardara el turno
        Estado estadoJuego;
        int[] arregloGanados = new int[21];
        int[] arregloPerdidos = new int[21];
        int sumaGanados = 0;
        int sumaPerdidos = 0;

        // ciclo for que llevará el conteo del millon de juegos
        for (int i = 0; i < 1000000; i++)
        {
            int miPunto = 0; //inicializo miPunto
            turno = 0; // inicializo el turno para que en cada juego empiece en 0

            int sumaDados = tirarDados(); //tiro dados para iniciar el juego

            //Decido la continuidad del juego por el resultado de mis dados
            switch (sumaDados)
            {
                //si cae 7 u 11 el jugador gana
                case SIETE:
                case ONCE:
                    estadoJuego = Estado.GANO;
                    arregloGanados[turno]++; //sumo a mi arreglo de ganados el turno que corresponda
                    sumaGanados++; //sumo a mis juegos ganados
                    break;

                //si el cae 1, 2, 3, 12 el jugador pierde
                case DOS_UNO:
                case TRES:
                case DOCE:
                    estadoJuego = Estado.PERDIO;
                    arregloPerdidos[turno]++; // sumo a mi arreglo de perdidos el turno que corresponda
                    sumaPerdidos++; //sumo a mis juegos perdidos
                    break;

                //el juego continua
                default:
                    estadoJuego = Estado.CONTINUA;
                    miPunto = sumaDados; // asigno a mi puntuacion el valor de los dados
                    turno++; //sumo 1 a mi turno
                    System.out.printf("El punto es %d\n", miPunto);
                    break;

            }//fin switch

            //Ciclo while que controla la continuidad de mi juego
            while (estadoJuego == Estado.CONTINUA)
            {
                sumaDados = tirarDados(); //vuelvo a tirar dados
                turno++; //sumo 1 a mis puntos

                //si mi turno es mas de 20 lo setearé en 20 para sumarlo a mi arreglo
                if (turno > 20)
                {
                    turno = 20;
                }

                //Si igualo el tiro de dados a mi punto inicial gano
                if (sumaDados == miPunto)
                {
                    estadoJuego = Estado.GANO;
                    arregloGanados[turno]++;
                    sumaGanados++;
                }
                else
                {   //si obtengo 7 pierdo
                    if (sumaDados == SIETE)
                    {
                        estadoJuego = Estado.PERDIO;
                        arregloPerdidos[turno]++;
                        sumaPerdidos++;
                    }
                }

                //imprimo resultado del juego
                if (estadoJuego == Estado.GANO)
                {
                    System.out.printf("El jugador gana\n");
                }
                else
                {
                    System.out.printf("El jugador pierde\n");
                }

            } //fin while

        }//fin for

        //imprimo total de juegos ganados y perdidos
        System.out.printf("El total de ganados es %d\n", sumaGanados);
        System.out.printf("El total de perdidos es %d\n", sumaPerdidos);

        //imprimo mis resultados

        System.out.printf("Juegos ganados: \n");

        System.out.printf("Turno\tFrecuencia\n");

        int a = 0;

        for (int j = 0; j < arregloGanados.length; j++)
        {
            System.out.printf("%5d\t%10d\n", j + 1, arregloGanados[j]);
            a += arregloGanados[j];

        }
        System.out.println(a);

    }// fin main

    //metodo para tirar dados
    public static int tirarDados()
    {
        int dado1 = numerosAleatorios.nextInt(6) + 1;
        int dado2 = numerosAleatorios.nextInt(6) + 1;

        int suma = dado1 + dado2;

        System.out.printf("El jugador tiró %d + %d = %d.\n", dado1, dado2, suma);

        return suma;


    }
}
