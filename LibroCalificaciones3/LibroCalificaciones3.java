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
          "Escriba el indicador de fin de archivo para terminar la entrada: ",
          "En UNIX,Linux/Mac OS X escriba <Ctrl> d y después oprima Intro",
          "En Windows escriba <Ctrl> z y después oprima Intro");

    }
}