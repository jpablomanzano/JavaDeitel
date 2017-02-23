//Paso de arreglos y elementos individuales de un arreglo a un método

public class PasoArreglo
{
  public static void main(String[] args) {

    int[] arreglo = {4, 5, 6, 7, 9};

    System.out.println("Efectos de pasar una referencia a un arreglo:\n" +
            "Los valores del arreglo son:");

    for (int valor : arreglo)
    {
        System.out.printf("   %d", valor);
    }

    modificarArreglo(arreglo);
    System.out.println("\n\nLos nuevos valores del arreglo modificado son:");

    for (int numero : arreglo)
    {
        System.out.printf("   %d", numero);
    }

    System.out.println();

    modificarElemento(arreglo[1]);
    System.out.printf("El valor del elemento arreglo[1] después de modificarElemento es: %d\n", arreglo[1]);
  }

  public static void modificarArreglo(int[] arreglo2)
  {
    for (int contador = 0; contador < arreglo2.length; contador++)
    {
        arreglo2[contador] *= 2;
    }
  }

  public static void modificarElemento(int elemento)
  {
    elemento *= 2;

    System.out.printf("El elemento modificado es: %d\n", elemento);
  }
}
