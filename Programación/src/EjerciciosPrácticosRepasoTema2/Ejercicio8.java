package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		do {
			System.out.println("Introduce un texto que empiece por hola y termine por hastaluego, si no, te lo volvere a repetir.");
			texto = sc.nextLine().trim();

		} while ((!(texto.startsWith("hola") && texto.endsWith("hastaluego"))));
		int x = texto.lastIndexOf("hastaluego");
		texto = texto.substring(5, x);
		System.out.println("Lo he entendido, " + texto);
		sc.close();
	}

}
