package EjerciciosPrácticosRepasoTema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicioo15 {

	public static void main(String[] args) {

		Random numero = new Random();
		Integer num = numero.nextInt(0, 9);
		Integer numeroRandom = -1;
		Integer x;

		for (x = -1; (numeroRandom != num) && (x != 10); x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Di un número del 0 al 9, a ver si adivinas el número.");
			numeroRandom = sc.nextInt();
			sc.close();
		}

		int suma = 10 - x;
		System.out.println("Fin. Tu puntuación es " + suma + "/10");

	}
}