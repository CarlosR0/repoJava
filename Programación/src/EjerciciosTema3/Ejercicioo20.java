package EjerciciosTema3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicioo20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Integer aleatorio = random.nextInt(0, 10);
		String letra;
		int fallos = 0;
		int aciertos = 0;
		Boolean igual;

		String[] palabra = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sofisticado",
				"terremoto", "culinario", "teclado", "primavera" };
		String[] lista = palabra[aleatorio].split("");
		String[] lista2 = palabra[aleatorio].split("");
		for (int i = 0; i < lista.length; i++) {
			lista2[i] = "__";
			System.out.print(lista2[i] + " ");
		}
		System.out.println();
		System.out.println();

		do {
			System.out.println();
			System.out.println("Di una letra");
			letra = sc.nextLine();
			if (letra.length() == 1) {
				boolean acierto = false;
				for (int i = 0; i < lista.length; i++) {

					if (letra.equalsIgnoreCase(lista[i])) {
						lista2[i] = lista[i];
						System.out.print(lista2[i] + " ");
						acierto = true;
					} else {
						System.out.print(lista2[i] + " ");
					}
				}
				System.out.println();
				if (acierto == true) {
					aciertos++;
				} else {
					fallos++;
				}

			} else {
				System.out.println("He dicho una letra");
			}

			igual = true;

			for (int i = 0; i < lista2.length; i++) {
				if (!(lista[i].equalsIgnoreCase(lista2[i]))) {
					igual = false;
					break;
				}
			}

		} while (!(igual == true) && (fallos < 10));
		sc.close();
		if (fallos == 10) {
			System.out.println("GAME OVER");
			System.out.println("Has tenido " + fallos + " fallos y " + aciertos + " aciertos");

		} else {
			System.out.println();
			System.out.println("HAS GANADO");
			System.out.println("Has tenido " + aciertos + " aciertos y " + fallos + " fallos");

		}
	}

}
