package exercise13;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Introduce una cantidad de dinero: ");
        double dinero = pm.nextDouble();

        int euros = (int) dinero;

        int centimos = (int) Math.round((dinero - euros) * 100);

        euros += centimos / 100;
        centimos %= 100;

        System.out.println("Euros: " + euros);
        System.out.println("Céntimos: " + centimos);

        pm.close();
    }
}
