package EjerciciosPrácticosRepasoTema3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué nota buscas?");
		int notaBuscada = sc.nextInt();
		sc.close();
		Boolean nota = true;
		for (int i = 0; i < listaNotas.length; i++) {
			nota = true;
			if (listaNotas[i] == notaBuscada) {
				System.out.print("La nota buscada existe y está en la posición ");
				System.out.print((i + 1) + " ");
				break;
			} else {
				nota = false;
			}

		}

		if (nota == false) {
			System.out.println("La nota buscada no existe");
		}

	}

}
