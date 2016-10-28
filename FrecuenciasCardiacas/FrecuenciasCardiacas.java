public class FrecuenciasCardiacas{

  //Variables
  private String nombrePaciente;
  private String apellidoPaciente;
  private int diaNacimiento;
  private int mesNacimiento;
  private int anioNacimiento;

  //Constructor de mi clase
  public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int year){

    nombrePaciente = nombre;
    apellidoPaciente = apellido;
    diaNacimiento = dia;
    mesNacimiento = mes;
    anioNacimiento = year;

  }


  //EStablecer y obtener nombrePaciente
  public void establecerNombrePaciente(String nombre){
    nombrePaciente = nombre;
  }

  public String obtenerNombrePaciente(){
    return nombrePaciente;
  }

  //Establecer y obtener apellidoPaciente
  public void establecerApellidoPaciente(String apellido){
    apellidoPaciente = apellido;
  }

  public String obtenerApellidoPaciente(){
    return apellidoPaciente;
  }

  //Establecer y obtener diaNacimiento
  public void establecerDiaNacimiento(int dia){

      diaNacimiento = dia;
  }

  public int obtenerDiaNacimiento(){
    return diaNacimiento;
  }

  //EStablecer y obtener mesNacimiento
  public void establacerMesNacimiento(int mes){
    mesNacimiento = mes;
  }

  public int obtenerMesNacimiento(){
    return mesNacimiento;
  }

  //Establecer y obtener anioNacimiento
  public void establecerAnioNacimiento(int year){
    anioNacimiento = year;
  }

  public int obtenerAnioNacimiento(){
    return anioNacimiento;
  }

  //Formo fecha de nacimiento en String
  public String formarFechaNacimiento(){
    String fechaNacimiento;
    fechaNacimiento = Integer.toString(obtenerDiaNacimiento())+"/" + Integer.toString(obtenerMesNacimiento())+"/"+Integer.toString(obtenerAnioNacimiento());

    return fechaNacimiento;
  }

  //calcular la edad de mi paciente
  public int calcularEdadPaciente(){

    int edadPaciente;

    edadPaciente = 2016 - anioNacimiento;

    return edadPaciente;
  }

  //Calcular frecuencia maxima
  public int calcularFrecuenciaMaxima(){

    int frecuenciaMaxima;

    frecuenciaMaxima = 220 - calcularEdadPaciente();

    return frecuenciaMaxima;

  }


  //Calculo mi rango mínimo y máximo de frecuencia esperada
  public double calcularfrecuenciaEsperadaMinima(){

    double frecuenciaEsperadaMinima;

    frecuenciaEsperadaMinima = calcularFrecuenciaMaxima() * .5;


    return frecuenciaEsperadaMinima;

  }

  public double calcularfrecuenciaEsperadaMaxima(){


    double frecuenciaEsperadaMaxima;

    frecuenciaEsperadaMaxima = calcularFrecuenciaMaxima() * .85;

    return frecuenciaEsperadaMaxima;

  }







}
