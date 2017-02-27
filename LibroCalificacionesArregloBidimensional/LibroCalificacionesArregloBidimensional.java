
public class LibroCalificacionesArregloBidimensional 
{
	private String nombreCurso; //Guarda el nombre del curso
	private int [][] calificaciones; // arreglo bidimensional de calificaciones de estudiantes
	
	public LibroCalificacionesArregloBidimensional(String nombre, int[][] arregloCalificaciones) 
	{
		nombreCurso = nombre;
		calificaciones = arregloCalificaciones;
	}
	
	public void establecerNombreCurso(String nombre)
	{
		nombreCurso = nombre;
	}
	
	public String obtenerNombreCurso()
	{
		return nombreCurso;
	}
	
	public void mostrarMensaje()
	{
		System.out.printf("Bienvenido al libro de calificaciones para \n%s!\n\n", 
				obtenerNombreCurso());
	}
	
	public void procesarCalificaciones()
	{
		imprimirCalificaciones();
		
		System.out.printf("\n%s %d\n%s %d\n\n", 
				"La calificacion más baja es", obtenerMinima(),
				"La calificacion más alta es", obtenerMaxima());
		
		imprimirGraficoBarras();
	}
	
	public double obtenerPromedio(int[] conjuntoCalificaciones)
	{
		int total = 0;
		
		for (int calificacion : conjuntoCalificaciones) 
		{
			total += calificacion;
		}
		
		return (double) total / conjuntoCalificaciones.length;
	}
	
	public int obtenerMinima()
	{
		int califBaja = calificaciones[0][0];
		
		//itera por cada fila del arreglo calificaciones
		for (int[] califEstudiante : calificaciones) {
			
			//itera por cada elemento de la fila actual
			for (int i : califEstudiante) {
				
				//si el elemento es menor que califBaja lo asigna a califBaja
				if (i < califBaja) 
				{
					califBaja = i;
				}
			}
			
		}
		
		return califBaja;
	}
	
	public int obtenerMaxima()
	{
		int califAlta = calificaciones[0][0];
		
		for (int[] califEstudiantes : calificaciones) {
			
			for (int i : califEstudiantes) {
				
				if (i > califAlta) 
				{
					califAlta = i;
				}
			}
		}
		
		return califAlta;
	}
	
	public void imprimirGraficoBarras()
	{
		System.out.println("Distribucion de calificaciones en general: ");
		
		int[] frecuencia = new int[11];
		
		for (int[] calificacionEstudiante : calificaciones) 
		{
			for (int calificacion : calificacionEstudiante) 
			{
				++frecuencia [ calificacion / 10 ];
			}
		}
		
		for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
			
			//imprime etiquetas de las barras ( " 00-09" , "10-19"...)
			
			if (cuenta == 10) 
			{
				System.out.printf("%5d: ", 100);
			}
			else {
				System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9 );
			}
			
			for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void imprimirCalificaciones()
	{
		System.out.println("Las calificaciones son:\n");
		System.out.print("             ");//Alinea encabezados de columnas 
		
		//Ciclo for para crear un encabezado para cada una de las pruebas:
		
		for (int pruebas = 0; pruebas < calificaciones[0].length; pruebas++) 
		{
			System.out.printf("Prueba %d ", pruebas + 1);
		}
		
		System.out.println();
		
		//Imprime filas/columnas de texto que representan el arreglo calificaciones
		for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) 
		{
			System.out.printf("Estudiante %2d", estudiante + 1);
			
			for (int prueba : calificaciones[estudiante]) 
			{
				System.out.printf("%8d", prueba);
			}
			
			double promedio = obtenerPromedio(calificaciones[estudiante]);
			
			System.out.printf("%9.2f\n", promedio);
		}
	}
	
	
}
