package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicioo19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mete una frase y te dire cuantas a tiene.");
		String[] lista = sc.nextLine().trim().split("");
		sc.close();
		int contador = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].equalsIgnoreCase("a")) {
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("En este texto no hay ninguna a");
			
		} else if (contador == 1) {
			System.out.println("En este texto hay " + contador + " a");

		} else {
			System.out.println("En este texto hay " + contador + " aes");

		}
	}

}
