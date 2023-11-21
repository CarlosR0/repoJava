package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo21 {

	public static void main(String[] args) {
		System.out.println("Dime un número y haré un cuadrado");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int x = 1;
		int suma = 0;
		String sumaN = "";
		
		do {

			suma = suma + x;
			sumaN = sumaN + " " + x;
			x = x + 1;
			System.out.println(sumaN);

		} while (x <= numero);
		sc.close();
	}

}
