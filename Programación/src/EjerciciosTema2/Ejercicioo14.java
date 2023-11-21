package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo14 {

	public static void main(String[] args) {
		System.out.println("Dime un número y te dire su tabla de multiplicar");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int x = 0;

		while (x <= 10) {
			System.out.println(numero + "x" + x + "=" + (numero * x));

			x++;

		}

		sc.close();

	}

}
