package EjerciciosPrácticosRepasoTema3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué nota buscas?");
		int notaBuscada = sc.nextInt();
		int contador = 0;
		sc.close();
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] > notaBuscada) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " notas mayores a la indicada");
	}

}
