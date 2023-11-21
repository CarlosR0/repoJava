package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int[] numeros = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número entero y te dire el cuadrado del número y los 5 siguientes.");
		int x = sc.nextInt();
		sc.nextLine();
		int suma = 0;
		int y = 0;
		for (int i = x; i <= x+5; i++) {
			suma = i * i;
			numeros[y] = suma;
			y++;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		sc.close();
	}

}
