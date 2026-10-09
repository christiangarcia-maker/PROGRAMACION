package exercise08;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		Scanner pm = new Scanner (System.in);
		
		Integer numeroA;
		Integer numeroB;
		
		System.out.println("Introduzca un número A: ");
		numeroA = pm.nextInt();
		System.out.println("Introduzca un número B: ");
		numeroB = pm.nextInt();
		
		if (numeroA < numeroB) {
			for (int i = numeroA; i <= numeroB; i++) {
				System.out.print(i + " ");
			}	
		} else {
			for (int i = numeroB; i <= numeroA; i++) {
				System.out.print(i + " ");
			}
		}
		
		pm.close();

	}

}
