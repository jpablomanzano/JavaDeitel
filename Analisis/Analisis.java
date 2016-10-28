import java.util.Scanner;

public class Analisis{

	public static void main(String[] args) {

		int aprobados = 0;
		int reprobados = 0;
		int contador = 1;
		int resultado;

		Scanner entrada = new Scanner(System.in);

		while (contador <= 10){

			System.out.printf("1.- Aprobado\n2.- Reprobado\nIngrese el resultado: ");
			resultado = entrada.nextInt();

			//Operador de asignacion compuesto
			//Labora igual que el variable = variable operador expresion;
			contador += 1;

			if (resultado == 1){

				aprobados += 1;

			} else {

				reprobados += 1;
			}
		}

		if (aprobados > 8) {

			System.out.println("Bono para el instructor");
		}

		System.out.println(aprobados);
		System.out.println(reprobados);
	}//Fin de main

}//Fin de clase Analisis
