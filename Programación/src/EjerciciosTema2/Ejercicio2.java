package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		System.out.println("Indícame tu altura en metros.");
		Scanner sc = new Scanner(System.in);
		float estatura = sc.nextFloat();
		System.out.println("Indícame tu peso en kilogramos");
		float masa = sc.nextFloat();
		sc.close();
		
		float imc = masa / (estatura * estatura); 
		
		if (imc<18.5) {
			System.out.println("Tu IMC es de " + imc + "%. Tu peso es inferior al normal.");
		}
		
		else if (imc<25) {
			System.out.println("Tu IMC es de " + imc + "%. Tu peso es normal.");

		}
		
		else if (imc<30) {
			System.out.println("Tu IMC es de " + imc + "%. Tu peso es superior al normal.");

		}
		
		else if (imc>=30) {
			System.out.println("Tu IMC es de " + imc + "%. Tienes obesidad.");

		}
		
	}

}
