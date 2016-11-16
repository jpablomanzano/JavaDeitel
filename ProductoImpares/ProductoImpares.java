//Programa que imprime el producto de los números impares del 1 al 15

public class ProductoImpares
{
  public static void main(String[] args) {

    //declaro variable que almanecará mi producto en 1
    int producto = 1;

    //Ciclo for que iterará hasta que i sea 15
    for (int i = 0; i <= 15; ++i)
    {
      //Si el módulo es diferente a cero entra al calculo del producto
      if (i % 2 != 0)
      {
        //Multiplico el producto almacenado por el número impar
        producto *= i;
        System.out.println(i); //Imprimo i como prueba de que se calcula correctamente
      }
    }
    System.out.printf("El producto es %,d\n",producto); 

  }
}
