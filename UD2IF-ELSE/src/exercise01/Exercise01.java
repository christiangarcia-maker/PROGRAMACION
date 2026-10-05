package exercise01;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner pm = new Scanner (System.in);
		
		Integer numero;
		
		System.out.println("Introduzca un número: ");
		numero = pm.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El número es par.");
		}else {
			System.out.println("El número es impar.");
		}
		
		pm.close();

	}

}
