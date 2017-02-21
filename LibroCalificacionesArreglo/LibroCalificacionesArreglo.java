public class LibroCalificacionesArreglo 
{
    private String nombreDelCurso;
    private int[] calificaciones;
    
    public LibroCalificacionesArreglo(String nombre, int[] nombreCurso)
    {
        nombreDelCurso = nombre;
        calificaciones = nombreCurso;
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
    
    public void procesarCalificaciones()
    {
        imprimirCalificaciones();
        
        System.out.printf("\n El promedio de la clase es %.2f\n", obtenerPromedio());
        
        System.out.printf("La calificacion mas baja es %d.\nLa calificacion mas alta es %d\n\n", obtenerMinima(), obtenerMaxima());
        
        imprimirGraficoBarras();
    }
    
    public double obtenerPromedio()
    {
        int total = 0;
        
        for (int calificacion : calificaciones) {
            total = total + calificacion;
        }
        
        return (double) total / calificaciones.length;
    }
    
    public int obtenerMinima()
    {
        int minima = calificaciones[0];
        
        for (int calificacion : calificaciones) 
        {
            if (calificacion < minima) 
            {
                minima = calificacion;
            }
        }
        
        return minima;
    }
    
    public int obtenerMaxima()
    {
        int maxima = calificaciones[0];
        
        for (int calificacion : calificaciones) {
            
            if (calificacion > maxima) {
                
                maxima = calificacion;
            }
        }
        
        return maxima;
    }
            
    public void imprimirGraficoBarras()
    {
        System.out.println("La distribucion de la frecuencia es:");
        
        int[] frecuencia = new int[11];
        
        for (int calificacion : calificaciones) {
            ++frecuencia[ calificacion / 10 ];
        }
        
        for (int i = 0; i < frecuencia.length; i++) 
        {
            if (i == 10) 
            {
                System.out.printf("%5d: ", 100);
            }
            else{
            
                System.out.printf("0%2d-0%2d: ", i*10, i * 10 + 9);
            }
            
            for (int estrellas = 0; estrellas < frecuencia[i]; estrellas++) 
            {
                
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
            
    public void imprimirCalificaciones()
    {
        System.out.println("Las calificaciones son:");
        
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d: %3d\n", estudiante + 1, calificaciones[estudiante]);
            
        }
    }
    
}