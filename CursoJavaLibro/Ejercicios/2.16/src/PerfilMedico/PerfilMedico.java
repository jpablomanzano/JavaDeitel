/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PerfilMedico;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PerfilMedico {
    
    private String nombrePaciente;
    private String apellidoPaciente;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double alturaPaciente;
    private double pesoPaciente;
    
    public PerfilMedico(String nombre, String apellido, int dia, int mes, int anio, double altura, double peso){
        
        nombrePaciente = nombre;
        apellidoPaciente = apellido;
        diaNacimiento = dia;
        mesNacimiento = mes;
        anioNacimiento = anio;
        alturaPaciente = altura;
        pesoPaciente = peso;
                
        
    }
    
    public void establecerNombrePaciente(String nombre){
        nombrePaciente = nombre;
    }
    
    public String obtenerNombrePaciente(){
        return nombrePaciente;
                
    }
    
    public void establecerApellidoPaciente(String apellido){
        apellidoPaciente = apellido;
    }
    
    public String obtenerApellidoPaciente(){
        return apellidoPaciente;
    }
    
    public void establecerDiaNacimiento(int dia){
        diaNacimiento = dia;
    }
    
    public int obtenerDiaNacimiento(){
        return diaNacimiento;
    }
    
    public void establecerMesNacimiento(int mes){
        mesNacimiento = mes;
    }
    
    public int obtenerMesNacimiento(){
        return mesNacimiento;
    }
    
    public void establecerAnioNacimiento(int anio){
        anioNacimiento = anio;
    }
    
    public int obtenerAnioNacimiento(){
        return anioNacimiento;
    }
    
    
    public void establecerPesoPaciente(double peso){
        pesoPaciente = peso;
    }
    
    public double obtenerPesoPaciente(){
        return pesoPaciente;
    }
    
    public void establecerAlturaPaciente(double altura){
        alturaPaciente = altura;
    }
    
    public double obtenerAlturaPaciente(){
        return alturaPaciente;
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
