/* Aplicacion que dibuja un cuadrado de cualquier caracter
a partir de un número
 que el usuario proporciona */
 import java.util.Scanner;

 public class MostrarCuadradoCualquierCaracter
 {
   public static void main(String[] args)
   {

     int numero;
     char caracter;
     Scanner input = new Scanner(System.in);

     System.out.print("Ingrese el número de lados del cuadrado: ");
     numero = input.nextInt();

     System.out.print("Ingrese el caracter a mostrar: ");
     caracter = input.next().charAt(0);

     cuadradoAsteriscos(numero,caracter);

   }

   public static void cuadradoAsteriscos(int lado, char caracterSeleccionado)
   {

      //Ciclo for de altura
      for (int i = 1;  i<= lado; ++i)
      {
        //Ciclo for de ancho
        for (int j = 1; j<= lado; ++j)
        {
          System.out.print(caracterSeleccionado);
        }
        System.out.println();
      }
   }
 }
