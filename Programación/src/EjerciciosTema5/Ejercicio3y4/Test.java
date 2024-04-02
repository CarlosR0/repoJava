package EjerciciosTema5.Ejercicio3y4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		SacoNumeros saco = new SacoNumeros();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		Boolean fallo = false;
		do {
			System.out.println("Di numeros, cuando quieras parar pon el -1.");
			try {
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				fallo = true;
				sc.nextLine();
				System.out.println("Tienes que poner números.");
			}

			if (num == -1 || fallo) {
			} else {
				saco.addNumero(num);
			}
		} while (!(num == -1));
		num = 0;
		System.out.println(saco);
		try {
			do {
				System.out.println(
						"Di un numero y te dire el numero que hay en la posicion, cuando quieras parar pon el -1.");
				try {
					num = sc.nextInt();
				} catch (InputMismatchException e) {
					sc.nextLine();
					System.out.println("Tienes que poner números.");
				}

				if (num == -1) {
					System.out.println("¡Adios!");
				} else {
					try {
						System.out.println(saco.getNumero(num));
					} catch (Exception e) {
						System.out.println("Has llegado al tope");
					}
				}
			} while (!(num == -1));
		} finally {
			sc.close();
		}
	}

}
