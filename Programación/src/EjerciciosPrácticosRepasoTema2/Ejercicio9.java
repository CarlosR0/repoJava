package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		String mensaje;

		do {
			System.out.println(
					"Introduce un texto que empiece por hola y termine por hastaluego, si no, te lo volvere a repetir. Si termina en adios me ire.");
			texto = sc.nextLine().trim().toLowerCase();

			if (texto.startsWith("hola") && texto.endsWith("hastaluego")) {

				int x = texto.lastIndexOf(" ");
				mensaje = texto.substring(5, x);
				System.out.println("Lo he entendido, " + mensaje);
			}

		} while (!(texto.endsWith("adios") && texto.startsWith("hola")));
		int x = texto.lastIndexOf(" ");
		mensaje = texto.substring(5, x);
		System.out.println("Lo he entendido, " + mensaje);
		System.out.println("Hasta luego.");
		sc.close();

	}
}
