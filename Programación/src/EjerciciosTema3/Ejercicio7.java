package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos números me vas a dar?");
		int numerosLista = sc.nextInt();
		sc.nextLine();
		int x = 0;
		int y = numerosLista;
		int z = 0;
		int[] lista = new int[numerosLista];
		int[] listaInversa = new int[numerosLista];
		for (int i = 1; i < lista.length + 1; i++) {
			System.out.println("Dame el " + i + "º número");
			z = sc.nextInt();
			lista[x] = z;
			x++;
			listaInversa[y - 1] = z;
			y--;
		}


		System.out.print("Los números son: ");
		for (int i = 0; i < lista.length; i++) {
			if (i == lista.length - 1) {
				System.out.print(lista[i] + ". ");

			} else {
				System.out.print(lista[i] + ", ");

			}
		}
		System.out.println();
		System.out.print("Los números son: ");
		for (int i = 0; i < listaInversa.length; i++) {
			if (i == listaInversa.length - 1) {
				System.out.print(listaInversa[i] + ". ");

			} else {
				System.out.print(listaInversa[i] + ", ");

			}
		}

		sc.close();

	}

}
