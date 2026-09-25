package exercise11;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = pm.nextInt();

        System.out.print("¿Tienes permiso de conducir? (true/false): ");
        boolean permiso = pm.nextBoolean();

        System.out.print("¿Tienes una sanción que te impide conducir? (true/false): ");
        boolean sancion = pm.nextBoolean();

        boolean puedeAlquilar =
                edad >= 18 && permiso && !sancion;

        System.out.println(puedeAlquilar);

        pm.close();
    }
}