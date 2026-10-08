package exercise04;

public class Exercise04 {

	public static void main(String[] args) {

		Integer sumaImpar = 0;

		for (int i = 1; i < 20; i++) {
			if (i % 2 != 0) {
				sumaImpar += i;
			}
		}
		
		System.out.println("La suma de los primeros números impares es: " + sumaImpar);
		
	}

}
