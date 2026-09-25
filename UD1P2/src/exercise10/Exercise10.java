package exercise10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int anio = pm.nextInt();

        boolean bisiesto =
                (anio % 4 == 0 && anio % 100 != 0)
                || (anio % 400 == 0);

        System.out.println(bisiesto);

        pm.close();
    }
}