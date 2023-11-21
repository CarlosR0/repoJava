package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo13 {

	public static void main(String[] args) {

		System.out.println("Escribe frases, cuando quieras terminar pon FIN");
		Scanner sc = new Scanner(System.in);
		String frase;
		String cadena = "";
		do {
			frase = sc.nextLine().trim();
			cadena = cadena + "  " + frase;

		} while (!(frase.equalsIgnoreCase("fin")));
		System.out.println("las palabras/frases escritas son:");
		System.out.println(cadena);
		sc.close();
	}
}