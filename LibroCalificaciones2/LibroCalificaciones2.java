//Programa que obtiene informacion del curso y calcula el promedio

//Importo mi biblioteca Scanner
import java.util.Scanner;

//Declaro el nombre de mi clase
public class LibroCalificaciones2
{

  //Declaro variable para asignar el nombre del curso
  private String nombreDelCurso;

  //Metodo constructor que asigna el nombre de curso a mi variable nombreDelCurso
  public LibroCalificaciones2(String nombre)
  {

    nombreDelCurso = nombre; //Asigno mi parámetro a mi variable

  } //Fin del método constructor

  //Metodo para establecer el nombre del curso
  public void establecerNombreDelCurso(String nombre)
  {

    nombreDelCurso = nombre;

  }//Fin del metodo establecerNombreDelCurso


  //Método para obtenerNombreDelCurso
  public String obtenerNombreDelCurso()
  {

    return nombreDelCurso;
  }//Fin del método obtenerNombreDelCurso

  public void mostrarMensaje(){

      System.out.printf("Bienvenido al libro de calificaciones para \n %s\n", obtenerNombreDelCurso());
  }

  public void determinarPromedioClase()
  {
      
    //Creo mi objeto Scanner para recibir datos
      Scanner entrada = new Scanner(System.in);


    //Variables
    int total; //Recibirá cada una de las calificaciones
    int contadorCalif; //Contará las calificaciones registradas
    int calificacion; //Recibirá la calificacion registrada por el usuario
    double promedio; //Recibirá el calculo del promedio

    
    //Fase de inicialización

    total = 0;
    contadorCalif = 0;
      
    //Pido entrada y lee calificación del usuario
      
    System.out.print("Escriba calificación o -1 para terminar: ");
    calificacion = entrada.nextInt();

    //Inicia mi ciclo while
    while (calificacion != -1)
    {
        total = total + calificacion; //Suma al total la calificación capturada

        contadorCalif = contadorCalif + 1; // Sumo en uno a mi contador
        
        //Solicito nuevamente calificación y la asigno a la variable
        System.out.print("Escriba calificación o -1 para terminar: ");
        calificacion = entrada.nextInt();
        

    } //Fin de while

      
      if (contadorCalif != 0){
          
          promedio = (double) total/ contadorCalif;
          
          //Imprimo mi promedio
          System.out.printf("El promedio de la clase %s es %.2f \n", obtenerNombreDelCurso(), promedio);

      }
      else {
          
          System.out.println("No se ingreso ninguna calificación");
          
      }
      
      

  }//Fin de mi método


}//Fin de clase
