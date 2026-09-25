package exercise04;

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
