//Grafico de tortuga
//ejercicio 7.21 Java-Deitel
import java.util.Scanner;

public class GraficoDeTortuga{

      private static int[][] tablero = new int[20][20]; //creo mi tablero
      private static Scanner entrada = new Scanner(System.in); //objeto scanner
      private static int columna = 0; // guardara  la posicion en mi columnas
      private static int linea = 0; //guardara posicion de mi linea
      private static int pluma = 0; //guardara si la pluma esta alzada o no
      private enum Direccion {NORTE, SUR, ESTE, OESTE} // Estado de la direccion
      private static int centinela = 0; // centinela para continuar o no

      // Creo mi enum para guardar direccion de la trayectoria de la tortuga
      private static Direccion direccion;


      public static void main(String[] args) {

          direccion = Direccion.SUR; //inicializo mi direccion hacia el sur

          //ciclo while para validar continuacion del programa
          while (centinela != 9){

              centinela = entrada.nextInt(); //capturo mi movimiento

              //opciones de mi movimiento
              switch (centinela){

                  case 1:
                      pluma = 0; //la pluma se alza
                      break;

                  case 2:
                      pluma = 7; //la pluma baja
                      break;

                  case 3:

                      //switch anidado para cambiar la direccion de la trayectoria hacia la derecha
                      switch (direccion){

                          case SUR:
                              direccion = Direccion.OESTE; //si estoy hacia el sur giro al oeste
                              break;

                          case NORTE:
                              direccion = Direccion.ESTE; //si estoy hacia el norte giro hacia el este
                              break;

                          case ESTE:
                              direccion = Direccion.SUR; //si estoy hacia el este giro hacia el sur
                              break;

                          case OESTE:
                              direccion = Direccion.NORTE; //si estoy hacia el oeste hacia el norte
                              break;
                      } //fin switch girar izquierda

                      break;

                  case 4:
                      // ahora para girar a la derecha
                      switch (direccion) {

                          case SUR:
                              direccion = Direccion.ESTE;
                              break;

                          case NORTE:
                              direccion = Direccion.OESTE;
                              break;

                          case ESTE:
                              direccion = Direccion.NORTE;
                              break;

                          case OESTE:
                              direccion = Direccion.SUR;
                              break;

                      }
                      break;

                  case 5:
                      avanzar(); //ejecuto mi método avanzar
                      break;

                  case 6:
                      mostrarDatos(); //imprimo mi arreglo con el desplazamiento de la tortuga
                      break;


                  default:
                      System.out.println("No ingresó un comando valido, intente nuevamente: ");
              } //fin switch

          } //fin while


      } //fin main


      //metodo para avanzar
      public static void avanzar() {

          System.out.print("Ingrese los lugares a avanzar: ");
          int avanzar = entrada.nextInt();

          switch (direccion){

              case SUR:

                  for (int i = 0 ; i < avanzar; i++)
                  {
                      linea++;
                      tablero[linea][columna] = pluma;

                  }

                  break;

              case NORTE:

                  for (int i = 0; i < avanzar; i++)
                  {
                      linea--;
                      tablero[linea][columna] = pluma;
                  }

                  break;

              case ESTE:

                  for (int i = 0; i < avanzar; i++){

                      columna++;
                      tablero[linea][columna] = pluma;

                  }

                  break;

              case OESTE:

                  for (int i = 0; i < avanzar; i++){

                      columna--;
                      tablero[linea][columna] = pluma;
                  }

                  break;



          } //fin switch


      } //fin avanzar

      //metodo para mostrar mis datos
      public static void mostrarDatos()
      {

          for (int i = 0; i < tablero.length; i++)
          {
              for (int j = 0; j < tablero[i].length; j++)
              {
                  System.out.printf("%d ", tablero[i][j]);
              }

              System.out.println();
          }

      } //fin mostrarDatos

}
