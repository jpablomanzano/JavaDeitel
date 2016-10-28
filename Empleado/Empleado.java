public class Empleado{

	private String primerNombreEmpleado;
	private String apellidoPaternoEmpleado;  
	private double sueldoEmpleado;


	public Empleado(String primerNombre, String apellidoPaterno, double sueldo){

		primerNombreEmpleado = primerNombre;
		apellidoPaternoEmpleado = apellidoPaterno;

		if (sueldo >= 0) {

			sueldoEmpleado = sueldo;
			
		}
	}

	public void establecerPrimerNombreEmpleado(String primerNombre){

		primerNombreEmpleado = primerNombre;

	}

	public String obtenerPrimerNombreEmpleado(){

		return primerNombreEmpleado;
	}

	public void establecerApellidoPaternoEmpleado(String apellidoPaterno){

		apellidoPaternoEmpleado = apellidoPaterno;

	}

	public String obtenerApellidoPaternoEmpleado(){

		return apellidoPaternoEmpleado;
	}

	public void establecerSueldoEmpleado(double sueldo){

		sueldoEmpleado = sueldo; 
	}

	public double obtenerSueldoEmpleado(){

		return sueldoEmpleado;
	}
}
