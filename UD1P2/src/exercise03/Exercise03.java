package exercise03;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        final double DESCUENTO = 0.15;
        final double IVA = 0.21;

        System.out.print("Introduce el precio inicial: ");
        double precioInicial = pm.nextDouble();

        double precioDescontado = precioInicial * (1 - DESCUENTO);
        double precioFinal = precioDescontado * (1 + IVA);

        precioFinal = Math.round(precioFinal * 100.0) / 100.0;

        System.out.println("Precio final: " + precioFinal + " €");

        pm.close();
    }
}
