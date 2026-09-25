package exercise01;

/*
 * Escribe un programa que solicite al usuario la base y 
 * la altura de un rectángulo (pueden contener decimales). 
 * Debe calcular y mostrar su perímetro y su área
 */

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = pm.nextDouble();

        System.out.print("Introduce la altura: ");
        double altura = pm.nextDouble();

        double perimetro = 2 * (base + altura);
        double area = base * altura;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

        pm.close();
    }
}