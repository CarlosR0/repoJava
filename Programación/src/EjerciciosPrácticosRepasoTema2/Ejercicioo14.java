package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String contraseña;

		do {
			System.out.println("Escribe una contraseña de 8 caracteres o más.");
			contraseña = sc.nextLine().trim();
			if (contraseña.isBlank()) {
				System.out.println("Que tonto eres");

			}

		} while (contraseña.length() < 8);
		{
			contraseña = contraseña.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0")
					.replaceAll("t", "7").replaceAll(" ", "");

			System.out.println(contraseña);

			sc.close();
		}

	}
}