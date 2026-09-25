package exercise02;

/*
 * Diseña una aplicación que pida una cantidad entera de segundos y 
 * la convierta en horas, minutos y segundos. Para realizar la 
 * descomposición utiliza los operadores / y %.
 */

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner pm = new Scanner(System.in);

		System.out.print("Introduce los segundos: ");
		int totalSegundos = pm.nextInt();

		int horas = totalSegundos / 3600;
		int minutos = (totalSegundos % 3600) / 60;
		int segundos = totalSegundos % 60;

		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);

		pm.close();
	}
}