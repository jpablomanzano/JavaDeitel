public class CalculadoraSalario{
  //VAriables
  private String nombreEmpleado; //Nombre empleado
  private String apellidoPaternoEmpleado; //Apellido Paterno empleado
  private String apellidoMaternoEmpleado; //Apellido Materno
  private int horasTrabajadas; //Numero de horas trabajadas de empleado
  private double cuotaHoraTrabajada; // Cuota por hora a pagar del empleado
  private double sueldoEmpleado; // Sueldo a pagar al empleado

  //Constructor de mi clase
  public CalculadoraSalario(String nombre, String apellidoPaterno, String apellidoMaterno, int horas, double cuota){

    nombreEmpleado = nombre;
    apellidoPaternoEmpleado = apellidoPaterno;
    apellidoMaternoEmpleado = apellidoMaterno;
    horasTrabajadas = horas;
    cuotaHoraTrabajada = cuota;

  }
  //Establecer y obtener nombreEmpleado
  public void establecerNombreEmpleado(String nombre){
    nombreEmpleado = nombre;
  }
  public String obtenerNombreEmpleado(){
    return nombreEmpleado;
  }

  //Establecer y obtener apellidoPaternoEmpleado
  public void establecerApellidoPaterno(String apellidoPaterno){
    apellidoPaternoEmpleado = apellidoPaterno;
  }
  public String obtenerApellidoPaterno(){
    return apellidoPaternoEmpleado;
  }

  //Establecer y obtener apellidoMaternoEmpleado
  public void establecerApellidoMaterno(String apellidoMaterno){
    apellidoMaternoEmpleado = apellidoMaterno;
  }
  public String obtenerApellidoMaterno(){
    return apellidoMaternoEmpleado;
  }

  //Establecer y obtener horasTrabajadas
  public void establecerHorasTrabajadas(int horas){
    horasTrabajadas = horas;
  }
  public int obtenerHorasTrabajadas(){
    return horasTrabajadas;
  }

  //Establecer y obtener cuotaHoraTrabajada
  public void establecerCuotaHoraTrabajada(double cuota){
    cuotaHoraTrabajada = cuota;
  }
  public double obtenerCuotaHoraTrabajada(){
    return cuotaHoraTrabajada;
  }

  //Método para establecer el sueldo del empleado(sueldoEmpleado)
  public double calcularSueldoEmpleado(){
    //Si el trabajador trabajó más de 40 hrs se agrega el 50% más por hora
    if (horasTrabajadas > 40 ) {
      sueldoEmpleado = (float) horasTrabajadas * (cuotaHoraTrabajada * 1.5);
    } else {
      sueldoEmpleado = (float) horasTrabajadas * cuotaHoraTrabajada;
    }

    return sueldoEmpleado;
  }

}
