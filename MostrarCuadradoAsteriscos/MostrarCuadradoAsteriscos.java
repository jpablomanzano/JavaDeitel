/* Aplicacion que dibuja un cuadrado de asteriscos
a partir de un número
 que el usuario proporciona */
 import java.util.Scanner;

 public class MostrarCuadradoAsteriscos
 {
   public static void main(String[] args)
   {

     int numero;
     Scanner input = new Scanner(System.in);

     System.out.print("Ingrese el número de lados del cuadrado: ");
     numero = input.nextInt();

     cuadradoAsteriscos(numero);

   }

   public static void cuadradoAsteriscos(int lado)
   {
     
      //Ciclo for de altura
      for (int i = 1;  i<= lado; ++i)
      {
        //Ciclo for de ancho
        for (int j = 1; j<= lado; ++j)
        {
          System.out.print("*");
        }
        System.out.println();
      }
   }
 }
