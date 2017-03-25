//programa que utiliza instrucción en la línea de comandos para inicializar un arreglo

public class InicArregloLineaComandos
{
  public static void main(String[] args)
  {
    //comprueba si el número de elementos del args es 3
    if (args.length != 3)
    {
        System.out.println(
        "Error: Vuelva a escribir el comando completo\n" +
        "El tamaño del arreglo, el valor inicial y el incremento");
    }
    else
    {
      //obtiene el tamaño del arreglo del primer argumento de línea de comandos
      int longitudArreglo = Integer.parseInt(args[0]);
      int[] arreglo = new int[longitudArreglo]; // crea el arreglo

      // obtiene el valor inicial y el incremento del arreglo

      int valorInicial = Integer.parseInt(args[1]);
      int incremento = Integer.parseInt(args[2]);

      //Calcula el valor para cada elemento del arreglo
      for (int contador = 0; contador < arreglo.length; contador++)
      {
          arreglo[contador] = valorInicial + incremento * contador;
      }

      System.out.printf("%s%8s\n", "Indice", "Valor");

      for (int contador = 0; contador < arreglo.length; contador++)
      {
          System.out.printf("%5d%8d\n", contador, arreglo[contador]);

      }
    }
  }
}
