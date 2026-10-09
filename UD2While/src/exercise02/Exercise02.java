package exercise02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer numeroEnteroPositivo = 0;
		Integer contador = 0;

		System.out.println("Introduzca un número: ");
		numeroEnteroPositivo = pm.nextInt();

		while (numeroEnteroPositivo >= 0) {
			System.out.println("Introduzca un número: ");
			numeroEnteroPositivo = pm.nextInt();
			contador++;
		}

		System.out.println("Hay " + contador + " números enteros positivos.");

		pm.close();

	}

}
