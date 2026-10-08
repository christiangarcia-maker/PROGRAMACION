package exercise01;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		Integer numeroAPedir;

		System.out.println("Introduce un número: ");
		numeroAPedir = pm.nextInt();

		for (int i = 1; i < numeroAPedir; i++) {
			System.out.println(i);
		}

		pm.close();

	}

}
