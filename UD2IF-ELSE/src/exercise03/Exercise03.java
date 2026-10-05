package exercise03;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer anio = 0;
		Integer mes = 0;
		Integer dias;

		System.out.println("Introduzca un año y un més: ");
		anio = pm.nextInt();
		mes = pm.nextInt();

		boolean bisiesto = anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;

		if (mes == 2 && bisiesto) {
			dias = 29;
		} else if (mes == 2 && !bisiesto) {
			dias = 28;
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			dias = 30;
		} else {
			dias = 31;
		}

		System.out.println("El més que has escogido tiene la cantidad de " + dias + " dias.");

		pm.close();

	}

}
