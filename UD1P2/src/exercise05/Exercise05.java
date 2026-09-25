package exercise05;

/*
 * Escribe un programa que solicite un número real y muestre su valor absoluto y 
 * su raíz cuadrada utilizando métodos de la clase Math. Prueba el programa con 
 * diferentes valores positivos.
 */

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Introduce un número real positivo: ");
        double numero = pm.nextDouble();

        double absoluto = Math.abs(numero);
        double raiz = Math.sqrt(numero);

        System.out.println("Valor absoluto: " + absoluto);
        System.out.println("Raíz cuadrada: " + raiz);

        pm.close();
    }
}
