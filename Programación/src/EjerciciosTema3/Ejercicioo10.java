package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicioo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos números me vas a dar?");
		int numerosLista = sc.nextInt();
		sc.nextLine();
		int[] lista = new int[numerosLista];
		int fibo1 = 0;
		int fibo2 = 1;
		lista[0] = fibo1;
		lista[1] = fibo2;
		for (int i = 2; i < lista.length; i++) {
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
			lista[i] = fibo2;
		}
		System.out.println("la serie de fibonacci es:");
		for (int i = 0; i < lista.length; i++) {
			if (i == lista.length - 1) {
				System.out.print(lista[i] + ".");

			} else {
				System.out.print(lista[i] + ", ");

			}

		}

		sc.close();

	}

}
