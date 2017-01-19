public class SumaArreglo
{
  public static void main(String[] args)
  {
      //Creo mi arreglo
      int[] c = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

      //Variable que almacenará el total del arreglo
      int total = 0;

      //Ciclo  for  irá recorriendo el arreglo y sumando el elemento de i en total
      for (int i = 0; i < c.length; i++)
      {
          total += c[i];
      }

      //Imprimo valores
      System.out.println(c.length); //Tamaño del arreglo
      System.out.println(total); //Total del arreglo
  }
}
