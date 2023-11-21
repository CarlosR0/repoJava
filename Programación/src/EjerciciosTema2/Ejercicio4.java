package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, suma;
		suma = 0;
		do {
			System.out.println("Dame un numero");

			x = sc.nextInt();
			suma = suma + x;

		} while (x != 0);

		System.out.println("la suma es " + suma);
		sc.close();
	}

}
