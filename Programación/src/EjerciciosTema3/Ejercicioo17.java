package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicioo17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Mete una frase y te la pondre en nomenclatura camelCase.");
		String[] lista = sc.nextLine().trim().split("");
		sc.close();
		for (int i = 0; i < lista.length; i++) {
			if (!lista[i].isBlank()) {
				System.out.print(lista[i].toLowerCase());
			} else {
				i++;
				System.out.print(lista[i].toUpperCase());
			}
		}

	}

}
