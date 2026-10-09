package exercise07;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer numero = 0;
		boolean esPrimo = true;

		System.out.println("Introduzca un número: ");
		numero = pm.nextInt();

		if (numero <= 1) {
			esPrimo = false;
		} else {

			for (int i = 2; i * i <= numero; i++) {
				if (numero % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}

		if (esPrimo) {
			System.out.println("El número " + numero + " es primo.");
		} else {
			System.out.println("El número " + numero + " no es primo.");
		}

		pm.close();
	}
}