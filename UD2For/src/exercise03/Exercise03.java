package exercise03;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer numero;

		Integer suma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduzca un número: ");
			numero = pm.nextInt();

			suma += numero;
		}

		System.out.println("La media es: " + suma / 10);

		pm.close();

	}

}
