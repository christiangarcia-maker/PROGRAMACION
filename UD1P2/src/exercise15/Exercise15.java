package exercise15;

/*
 * Solicita tres números enteros a, b y c. Calcula y muestra el resultado de las expresiones a + b * c y (a + b) * c. 
 * Comprueba que los resultados pueden ser distintos y explica mediante un comentario en el código el motivo.
 */

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        int a = pm.nextInt();

        System.out.print("Introduce el valor de b: ");
        int b = pm.nextInt();

        System.out.print("Introduce el valor de c: ");
        int c = pm.nextInt();

        int resultado1 = a + b * c;
        int resultado2 = (a + b) * c;

        System.out.println("a + b * c = " + resultado1);
        System.out.println("(a + b) * c = " + resultado2);

        // La multiplicación tiene prioridad sobre la suma.
        // Los paréntesis hacen que la suma se realice primero.

        pm.close();
    }
}
