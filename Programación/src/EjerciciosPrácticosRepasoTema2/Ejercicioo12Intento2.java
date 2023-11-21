package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo12Intento2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Mete un número.");
		Integer x = sc.nextInt();
		Integer y = x;
		sc.nextLine();
		System.out.print(" ");
		for (int ç = 0; ç < x-1; ç++) {
			System.out.print("");
			System.out.print("___");
		}System.out.print("__");
		for (Integer i = 1; i <= x; i++) {
			System.out.println("");
			for (Integer j = 1; j <= y; j++) {
				System.out.print("|");
				System.out.print("__");

			}
			System.out.print("|");

		}

		sc.close();
	}
}