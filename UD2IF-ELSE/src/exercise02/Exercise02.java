package exercise02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		Scanner pm = new Scanner (System.in);
		
		Integer primerNumero = 0;
		Integer segundoNumero = 0;
		Integer tercerNumero = 0;
		
		System.out.println("Introduzca tres números: ");
		primerNumero = pm.nextInt();
		segundoNumero = pm.nextInt();
		tercerNumero = pm.nextInt();
		
		Integer numeroMayor = tercerNumero;
		
		if (primerNumero > segundoNumero && primerNumero > tercerNumero) {
			numeroMayor = primerNumero;
		}else if (segundoNumero > primerNumero && segundoNumero > tercerNumero) {
			numeroMayor = segundoNumero;
		}
		
		System.out.println("El número mayor es: " + numeroMayor);
		
		pm.close();

	}

}
