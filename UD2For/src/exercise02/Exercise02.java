package exercise02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer numeroAPedir;
		Integer contador = 0;

		System.out.println("Introduzca un número: ");
		numeroAPedir = pm.nextInt();

		for (int i = 1; i < numeroAPedir; i++) {
			if (i % 3 == 0) {
				contador++;
			}
		}
		
		System.out.println(contador);
		
		pm.close();

	}

}
