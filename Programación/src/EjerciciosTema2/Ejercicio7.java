package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;

		do {
			System.out.println("Dime dos números y te dire si son iguales. Si son diferentes se repetira el proceso.");
			System.out.println("Dime el primer número");
			num1 = sc.nextInt();
			System.out.println("Dime el segundo número ");
			num2 = sc.nextInt();
			if (num1 !=num2) {
				System.out.println("Los números no son iguales.");
			}
			
		} while (num1 != num2);

		System.out.println("¡¡Un saludo!!");
		sc.close();
	}

}
