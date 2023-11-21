package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra;

		System.out.println("Escribe una palabra.");
		palabra = sc.nextLine().trim();

		for (int i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.substring(i, i + 1));
		}

		sc.close();

	}
}