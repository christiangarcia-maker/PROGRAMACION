package exercise03;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer numero;

		Double suma = 0.0;

		for (int i = 1; i <= 3; i++) {
			System.out.println("Introduzca un número: ");
			numero = pm.nextInt();

			suma += numero;
		}

		System.out.println("La media es: " + suma / 3);

		pm.close();

	}

}
