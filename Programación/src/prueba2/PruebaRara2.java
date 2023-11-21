package prueba2;

import java.util.Scanner;

public class PruebaRara2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x;

		int min = 9999999;

		int j;

		System.out.println("¿Cuántos números quieres meter?");

		int num = scanner.nextInt();

		int[] lista = new int[num];

		for (int i = 0; i < lista.length; i++) {

			System.out.println("Introduzca un número");

			x = scanner.nextInt();

			lista[i] = x;

		}

		for (int i = 0; i < lista.length; i++) {

			for (j = i; j < lista.length; j++) {

				if (lista[j] < min) {

					min = lista[j];
					lista[i] = lista[j];
					lista[j] = lista[i];
				}


			}

		}

		for (int y = 0; y < lista.length; y++) {

			System.out.print(lista[y] + " ");

		}

		scanner.close();
	}
}
