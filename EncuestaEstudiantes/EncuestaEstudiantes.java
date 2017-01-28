//Programa que cuenta el número de repeticiones de las respuestas de un grupo de estudiantes


public class EncuestaEstudiantes
{
  public static void main(String[] args)
    {
      //Arreglo que contiene las respuestas de los estudiantes
        int[] respuestas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

        //Arreglo para contar la frecuencia que cada respuesta tuvo
        int[] frecuencia = new int[6];

        //Ciclo for para contar las respuestas
        for (int respuesta = 0; respuesta < respuestas.length; respuesta++)
        {
            //Prueba que todas las respuestas sean válidas
            try
            {
                ++frecuencia[respuestas[respuesta]];

            } //Catch por si alguna respuesta  está fuera del rango
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.printf(" respuestas[%d] = %d\n\n", respuesta, respuestas[respuesta]);

            }

        }

        System.out.printf("%s %10s\n", "Calificacion", "Frecuencia");

        for (int calificacion    = 1; calificacion < frecuencia.length; calificacion++) {
                System.out.printf("%6d %10d\n", calificacion, frecuencia[calificacion]);
            }
    }
}
