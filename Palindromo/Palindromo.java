//Programa que imprime si un número es palíndromo o no

import java.util.Scanner;

public class Palindromo{
	public static void main(String[] args) {

		int numero = 0;
		int quinto, cuarto, segundo, primero;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese su numero de 5 dígitos");
		numero = entrada.nextInt();

		while (numero <= 9999 || numero > 99999) {
			System.out.print("El número introducido no es de 5 dígitos, intente nuevamente: ");
			numero = entrada.nextInt();
		}


		quinto =  numero % 10;
		cuarto =  numero % 100 / 10;
		segundo =  numero % 10000 /1000;
		primero =  numero % 100000 / 10000;

		if (primero == quinto && segundo == cuarto) {
			System.out.println("Es Palindromo");
		}else{
			System.out.println("No es Palindromo");
		}
		
	}
}
