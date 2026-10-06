package exercise08;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer primerNumero = 0;
		Integer segundoNumero = 0;
		Integer tercerNumero = 0;

		System.out.println("Introduzca tres números enteros: ");
		primerNumero = pm.nextInt();
		segundoNumero = pm.nextInt();
		tercerNumero = pm.nextInt();

		if (primerNumero + segundoNumero == tercerNumero) {
			System.out.println("El resultado da el tercer número: " + tercerNumero);
		} else if (primerNumero + tercerNumero == segundoNumero) {
			System.out.println("El resultado da el segundo número: " + segundoNumero);
		} else if (segundoNumero + tercerNumero == primerNumero) {
			System.out.println("El resultado da el primero número; " + primerNumero);
		} else {
			System.out.println("Ninguna de las sumas de los números da uno de los tres.");
		}

		pm.close();

	}

}
