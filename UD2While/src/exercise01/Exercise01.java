package exercise01;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer numeroASumar = 0;
		Integer suma = 0;

		while (numeroASumar >= 0) {
			suma += numeroASumar;
			System.out.println("Introduzca un número: ");
			numeroASumar = pm.nextInt();
		}
		
		System.out.println("La suma de los números es: " + suma);

		pm.close();

	}

}
