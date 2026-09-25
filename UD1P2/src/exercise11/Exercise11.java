package exercise11;

/*
 * Diseña un programa que determine si una persona puede alquilar un vehículo. 
 * Solicita su edad y dos valores booleanos que indiquen si posee permiso de conducir 
 * y si tiene una sanción que le impida conducir. Podrá alquilarlo si es mayor de edad, tiene permiso y no tiene dicha sanción. 
 * Muestra únicamente el resultado booleano.
 */

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