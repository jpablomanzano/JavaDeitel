public class PruebaLibroCalificacionesArreglo {
    
    public static void main(String[] args) {
        
        int[] arregloCalif =  {100, 80, 80, 90, 90, 100};
        
        LibroCalificacionesArreglo miLibroCalificaciones = new LibroCalificacionesArreglo("Aritmetica", arregloCalif);
        
        miLibroCalificaciones.obtenerNombreDelCurso();
        
        miLibroCalificaciones.mostrarMensaje();
        
        miLibroCalificaciones.procesarCalificaciones();
        
        
    }

}
