package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo20 {

	public static void main(String[] args) {
		System.out.println("Dime un número y haré un cuadrado");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int x;
		int y;

		for (y = 1; y <= numero; y++) {

			for (x = 1; x <= numero; x++) {

				System.out.print(x + " ");
			}
			System.out.println();
		}

	}

}
