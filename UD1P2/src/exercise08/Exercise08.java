package exercise08;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Número de productos: ");
        int productos = pm.nextInt();

        System.out.print("Capacidad de cada caja: ");
        int capacidad = pm.nextInt();

        int cajas = (int) Math.ceil((double) productos / capacidad);

        System.out.println("Cajas necesarias: " + cajas);

        pm.close();
    }
}
