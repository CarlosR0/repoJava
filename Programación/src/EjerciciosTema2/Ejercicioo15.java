package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo15 {

	public static void main(String[] args) {
		System.out.println("Dime un número y te dire su tabla de multiplicar");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		

		for (int x = 0; x <= 10 ; x++) {
			System.out.println(numero + "x" + x + "=" + (numero * x));

			

		}

		sc.close();

	}

}
