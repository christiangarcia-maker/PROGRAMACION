package exercise06;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer numero = 0;
		Integer cantidadCifras = 0;

		System.out.println("Introduzca un número comprendido entre 0 y 9999: ");
		numero = pm.nextInt();

		if (numero >= 0 && numero < 10) {
			cantidadCifras = 1;
		} else if (numero >= 10 && numero < 100) {
			cantidadCifras = 2;
		} else if (numero >= 100 & numero < 1000) {
			cantidadCifras = 3;
		} else if (numero >= 1000 && numero <= 9999) {
			cantidadCifras = 4;
		} else {
			System.out.println("Tienes que colocar un número comprendido entre 0 y 9999");
		}

		System.out.println("Tu número tiene " + cantidadCifras + " cifras.");

		pm.close();

	}

}
