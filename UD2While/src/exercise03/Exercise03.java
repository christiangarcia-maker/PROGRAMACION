package exercise03;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer suma = 0;
		Integer contador = 0;
		Double media;

		System.out.println("Introduzca un número: ");
		Integer numeroASumar = pm.nextInt();

		while (numeroASumar >= 0) {
			suma += numeroASumar;
			contador++;
			System.out.println("Introduzca un número: ");
			numeroASumar = pm.nextInt();
		}

		media = (double) (suma / contador);

		System.out.println("La media de los números es: " + media);

		pm.close();

	}

}
