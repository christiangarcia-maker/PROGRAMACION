package exercise01;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos la variable donde se almacena el numero con decimales.
		double numeroDecimales;
		
		// Declaramos la variable donde se almacena el numero decimal.
		double decimal;
		
		// Declaramos la variable donde se almacena el numero redondeado.
		int intermedio;
		
		// Pregunta al usuario por un numero con decimales.
		System.out.println("¿Cual es tú número a elegir?: ");
		numeroDecimales = ch.nextDouble();
		
		// Sacamos el numero entero del numero solicitado.
		intermedio = (int)numeroDecimales;
		
		// Almacenamos la parte decimal del numero solicitado.
		decimal = numeroDecimales - intermedio;

		// Ponemos la condición que si el número decimal es mayor a 0,5 se le suma 1 a intermedio.
		intermedio = decimal>0.5 ? intermedio +1 : intermedio;
		
		// Imprime el número redondeado.
		System.out.println("Tú número redondeado es el siguiente: " + intermedio);
		
		// Cierre del escaner.
		ch.close();
		

	}

}