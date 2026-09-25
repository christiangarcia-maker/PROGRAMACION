package exercise04;

/*
 * Pide al usuario un número real y muestra: el entero inmediatamente inferior mediante Math.floor(), 
 * el entero inmediatamente superior mediante Math.ceil() y el entero más cercano mediante Math.round().
 */

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Introduce un número real: ");
        double numero = pm.nextDouble();

        double inferior = Math.floor(numero);
        double superior = Math.ceil(numero);
        long cercano = Math.round(numero);

        System.out.println("Entero inferior: " + inferior);
        System.out.println("Entero superior: " + superior);
        System.out.println("Entero más cercano: " + cercano);

        pm.close();
    }
}
