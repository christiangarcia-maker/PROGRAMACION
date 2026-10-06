package exercise07;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		Scanner pm = new Scanner(System.in);

		String jugadorUno;
		String jugadorDos;
		Integer ganador = 0;

		System.out.println("El primero jugador seleccione una jugada: ");
		jugadorUno = pm.nextLine();

		System.out.println("El segundo jugador seleccione una jugada: ");
		jugadorDos = pm.nextLine();

		if (jugadorUno == "PIEDRA" && jugadorDos == "TIJERA") {
			ganador = 1;
		} else if (jugadorDos == "PIEDRA" && jugadorUno == "TIJERA") {
			ganador = 2;
		} else if (jugadorUno == "PAPEL" && jugadorDos == "PIEDRA") {
			ganador = 1;
		} else if (jugadorDos == "PAPEL" && jugadorUno == "PIEDRA") {
			ganador = 2;
		} else if (jugadorUno == "TIJERA" && jugadorDos == "PAPEL") {
			ganador = 1;
		} else if (jugadorDos == "TIJERA" && jugadorUno == "PAPEL") {
			ganador = 2;
		}

		if (ganador == 0) {
			System.out.println("Ha quedado en empate.");
		} else {
			System.out.println(" Ha ganado el jugador " + ganador);
		}

		pm.close();

	}

}
