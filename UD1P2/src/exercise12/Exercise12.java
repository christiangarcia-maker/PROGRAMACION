package exercise12;

/*
 * Pide al usuario su edad y utiliza el operador ternario para calcular el precio de una entrada: 
 * 6,50 € si es menor de 18 años y 9,50 € en caso contrario. Muestra el precio correspondiente.
 */

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = pm.nextInt();

        double precio = edad < 18 ? 6.50 : 9.50;

        System.out.println("Precio de la entrada: " + precio + " €");

        pm.close();
    }
}