package exercise07;

import java.util.Random;

public class Exercise07 {
    public static void main(String[] args) {

        Random random = new Random();

        int entero = random.nextInt(100) + 1;
        double real = random.nextDouble();
        boolean booleano = random.nextBoolean();

        System.out.println("Entero: " + entero);
        System.out.println("Real: " + real);
        System.out.println("Booleano: " + booleano);
    }
}