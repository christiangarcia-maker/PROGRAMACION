package exercise04;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Double numeroDecimal;
		boolean casiCero = false;

		System.out.println("Introduzca un número decimal: ");
		numeroDecimal = pm.nextDouble();

		if (numeroDecimal < 1 && numeroDecimal > -1 && numeroDecimal != 0) {
			casiCero = true;
		}

		System.out.println("¿El número " + numeroDecimal + " es casi cero?: " + casiCero);

		pm.close();

	}

}
