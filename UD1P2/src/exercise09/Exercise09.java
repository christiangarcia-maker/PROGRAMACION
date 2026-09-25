package exercise09;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Litros de agua: ");
        double litros = pm.nextDouble();

        System.out.print("Capacidad de cada botella (litros): ");
        double capacidad = pm.nextDouble();

        int botellas = (int) Math.floor(litros / capacidad);

        System.out.println("Botellas completas: " + botellas);

        pm.close();
    }
}
