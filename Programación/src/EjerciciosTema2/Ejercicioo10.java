package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String c1;
		String c2;

		do {
			System.out.println("Dime dos palabras y te las ordenare alfabeticamente. Si no son palabras se repetira el proceso.");
			System.out.println("Dime la primera palabra");
			c1 = sc.nextLine();
			System.out.println("Dime la segunda palabra");
			c2 = sc.nextLine();
			if (!(c1.isBlank() || c1.isEmpty() || c2.isBlank() || c2.isEmpty())) {
				System.out.println("No es valido.");
			}

		} while ((c1.isBlank() || c1.isEmpty() || c2.isBlank() || c2.isEmpty()));

		System.out.println("¡¡Un saludo!!");
		sc.close();

		int comp = c1.compareTo(c2);

		if (comp < 0) {
			System.out.println(c1 + ", " + c2);
		} else if (comp > 0) {
			System.out.println(c2 + ", " + c1);
		} else if (comp == 0) {
			System.out.println(c1 + ", " + c2);

		}

	}

}
