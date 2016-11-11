import java.util.Scanner;

public class LibroCalificaciones3{
    private String nombreDelCurso;

    private int total;
    private int contadorCalif;
    private int aCuenta;
    private int bCuenta;
    private int cCuenta;
    private int dCuenta;
    private int eCuenta;
    private int fCuenta;

    public LibroCalificaciones3 (String nombre)
    {
      nombreDelCurso = nombre;
    }

    public void establecerNombreDelCurso(String nombre)
    {
      nombreDelCurso = nombre;
    }

    public String obtenerNombreDelCurso()
    {
      return nombreDelCurso;
    }

    public void mostrarMensaje()
    {

      System.out.printf("Bienvenido al libro de calificaciones para \n%s!\n\n", obtenerNombreDelCurso());

    }

    public void introducirCalif()
    {
      Scanner input = new Scanner ( System.in );

      int calificacion;

      System.out.printf("%s\n%s\n   %s\n   %s\n",
          "Escriba las calificaciones enteras en el rango de 0 a 100",
          "Escriba el indicador de fin de archivo para terminar la entrada.",
          "En UNIX,Linux/Mac OS X escriba <Ctrl> d y después oprima Intro.",
          "En Windows escriba <Ctrl> z y después oprima Intro.");

          while(input.hasNext())
          {
            calificacion = input.nextInt();
            total += calificacion;
            contadorCalif = contadorCalif + 1;

            incrementarContadorCalif(calificacion);
          }
    }

    private  void incrementarContadorCalif(int calificacion)
    {
      switch (calificacion / 10 )
      {
        case 9: //Calificaciones entre 90 y 100
        case 10:
          ++aCuenta;
          break;

        case 8:
          ++bCuenta;
          break;

        case 7:
          ++cCuenta;
          break;

        case 6:
          ++dCuenta;
          break;

        case 5:
          ++eCuenta;
          break;

        default:
          ++fCuenta;
          break;
      }
    }
      public void mostrarReporteCalif()
      {
        System.out.println("\nReporte de calificaciones: ");

        if (contadorCalif != 0) {
          double promedio = (double) total / contadorCalif;

          System.out.printf("El total de las %d calificaciones introducidas es %d\n", contadorCalif, total);
          System.out.printf("El promedio de la clase es: %.2f\n", promedio);
          System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
            "Numero de estudiantes que recibieron cada calificacion:",
            "A:", aCuenta,
            "B:", bCuenta,
            "C:", cCuenta,
            "D:", dCuenta,
            "E:", eCuenta,
            "F:", fCuenta);
        }
        else
        {
          System.out.println("No se introdujeron calificaciones.");
        }
      }
    }
