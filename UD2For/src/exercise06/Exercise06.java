package exercise06;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer notaAlumno;
		Integer contadorSuspensos = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduzca una nota: ");
			notaAlumno = pm.nextInt();
			if (notaAlumno < 5) {
				contadorSuspensos++;
			}
		}

		if (contadorSuspensos > 0) {
			System.out.println("Hay " + contadorSuspensos + " suspensos.");
		} else {
			System.out.println("No hay suspensos.");
		}

		pm.close();

	}

}
