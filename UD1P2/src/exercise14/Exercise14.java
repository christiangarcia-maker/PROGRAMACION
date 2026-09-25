package exercise14;

public class Exercise14 {
    public static void main(String[] args) {

        int puntos = 100;
        int vidas = 3;

        puntos += 50;
        puntos -= 20;
        vidas++;
        vidas--;

        System.out.println("Puntos finales: " + puntos);
        System.out.println("Vidas finales: " + vidas);
    }
}
