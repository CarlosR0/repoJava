package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo13 {

	public static void main(String[] args) {

		System.out.println("por favor introduzca un texto.");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		int longitudTexto;
		texto = texto.trim();
		longitudTexto = texto.length();
		int x = 0;
		int y = 5;

		while (y < longitudTexto) {

			System.out.println(texto.substring(x, y));

			x += 5;
			y += 5;

		}

		System.out.println(texto.substring(x, longitudTexto));
		sc.close();

	}

}
