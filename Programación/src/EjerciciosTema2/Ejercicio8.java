package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num1;
		String num2;

		do {
			System.out.println("Dime dos palabras y te dire si son iguales. Si son diferentes se repetira el proceso.");
			System.out.println("Dime la primera palabra");
			num1 = sc.nextLine();
			System.out.println("Dime la segunda palabra");
			num2 = sc.nextLine();
			if (!(num1.equalsIgnoreCase(num2))) {
				System.out.println("Las palabras no son iguales.");
			}
			
		} while (!(num1.equalsIgnoreCase(num2)));

		System.out.println("¡¡Un saludo!!");
		sc.close();

	}

}
