public class LibroCalificaciones{

  private String nombreDelCurso; //Nombre del curso para este LibroCalificaciones
  private String nombreInstructor;//Nombre del instructor

  //Creo un constructor, el nombre del constructor es el nombre de la clase
  //Este constructor es con parametros ya que sin ellos se crea un null
  public LibroCalificaciones(String nombre, String nombreProfesor){

    nombreDelCurso = nombre;
    nombreInstructor = nombreProfesor;

  }

  //Método para establecer el nombre del curso
  public void establecerNombreDelCurso(String nombre){

    nombreDelCurso = nombre;//Almacena el nombre del curso

  }
  //Metodo para obtener el nombre del curso
  public String obtenerNombreDelCurso(){
    return nombreDelCurso;
  }

  public void establecerNombreDelInstructor(String nombreProfesor){
    nombreInstructor = nombreProfesor;
  }

  public String obtenerNombreDelInstructor(){

    return nombreInstructor;
  }


  //Metodo para mostar mensaje
  public void mostrarMensaje(){

    System.out.printf("Bienvenido al curso de %s.\nESte curso es presentado por: %s\n",
                      obtenerNombreDelCurso(), obtenerNombreDelInstructor());

  }

}
