import java.util.Scanner;

public class PruebaLibroCalificaciones{

  public static void main(String[] args) {


    //Declaro mi objeto Scanner
    Scanner entrada = new Scanner(System.in);


    //Declaro mi objeto miLibroCalificaciones de tipo LibroCalificaciones
    LibroCalificaciones miLibroCalificaciones1 = new LibroCalificaciones("Programación con Java", "Juan Pablo Manzano");
    LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones("Programacion con Swift", "Armando Rubio");

    miLibroCalificaciones1.mostrarMensaje();

    //Muestra el nombre inicial del nombre del curso, a través de mi método obtenerNombreDelCurso
    System.out.printf("El nombre inicial del curso 1 es: %s y es presentado por %s\n", miLibroCalificaciones1.obtenerNombreDelCurso(), miLibroCalificaciones1.obtenerNombreDelInstructor());
    System.out.printf("El nombre inicial del curso 2 es: %s y es presentado por %s\n", miLibroCalificaciones2.obtenerNombreDelCurso(), miLibroCalificaciones2.obtenerNombreDelInstructor());



    //Pide y lee el nombre del curso
    System.out.print("Ingrese el nombre del curso: ");
    String elNombre = entrada.nextLine();
    System.out.print("Ingrese el nombre del profesor: ");
    String elNombreInstructor = entrada.nextLine();


    //Através de mi método establecerNombreDelCurso guardo variable el elNombre como nombreDelCurso
      miLibroCalificaciones1.establecerNombreDelCurso(elNombre);
      miLibroCalificaciones1.establecerNombreDelInstructor(elNombreInstructor);

      miLibroCalificaciones1.mostrarMensaje();


    System.out.println(); //Imprimo línea en blanco




  }

}
