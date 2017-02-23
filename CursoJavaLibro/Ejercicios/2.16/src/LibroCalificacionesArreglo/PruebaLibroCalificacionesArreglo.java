package LibroCalificacionesArreglo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Juan Pablo Manzano 
 */
public class PruebaLibroCalificacionesArreglo {
    
    public static void main(String[] args) {
        
        int[] arregloCalif =  {100, 80, 80, 90, 90, 100};
        
        LibroCalificacionesArreglo miLibroCalificaciones = new LibroCalificacionesArreglo("Aritmetica", arregloCalif);
        
        miLibroCalificaciones.obtenerNombreDelCurso();
        
        miLibroCalificaciones.mostrarMensaje();
        
        miLibroCalificaciones.procesarCalificaciones();
        
        
    }

}
