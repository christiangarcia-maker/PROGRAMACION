package exercise05;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		Scanner pm = new Scanner (System.in);
		
		Integer numeroFactorial;
		Integer factorial = 1;
		
		System.out.println("Introduzca un número del que quieras saber su factorial: ");
		numeroFactorial = pm.nextInt();
		
		for (int i = 1; i <= numeroFactorial; i++) {
			factorial *= i;
		}
		
		System.out.println("El fractional de tú número es: " + factorial);
		
		pm.close();
	}

}
