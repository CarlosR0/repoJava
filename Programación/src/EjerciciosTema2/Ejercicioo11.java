package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String correo;
		int mail;
		String despuesDeArroba;
		Boolean empiezaPorPunto;
		Boolean acabaPorPunto;
		Boolean contienePunto;
		do {

			System.out.println("Introduce tu correo electrónico.");
			correo = sc.nextLine();
			mail = correo.indexOf("@");
			despuesDeArroba = correo.substring(mail + 1);
			empiezaPorPunto = despuesDeArroba.startsWith(".");
			acabaPorPunto = despuesDeArroba.endsWith(".");
			contienePunto = despuesDeArroba.contains(".");

			if (!correo.contains("@") || empiezaPorPunto || acabaPorPunto || !contienePunto) {
				System.out.println("El correo no es válido");
			}

		} while (!correo.contains("@") || empiezaPorPunto || acabaPorPunto || !contienePunto);

		System.out.println("el formato del correo " + correo + " es válido.");

		sc.close();
	}

}
