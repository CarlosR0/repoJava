package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicioo16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;

		System.out.println("Escribe una palabra.");
		palabra = sc.nextLine().trim();
		String[] lista = palabra.split("");

		for (int i = lista.length - 1; i >= 0; i--) {
			System.out.println(lista[i]);
		}

		sc.close();

	}

}
