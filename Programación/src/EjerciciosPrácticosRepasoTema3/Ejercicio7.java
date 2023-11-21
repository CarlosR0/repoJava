package EjerciciosPrácticosRepasoTema3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu telegrama");
		String lista[] = sc.nextLine().trim().split(" ");
		double suma = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i].equalsIgnoreCase("stop")) {

			} else {
				suma = suma + 0.24;
			}
		}
		System.out.println("El precio es " + suma);
		sc.close();
	}

}
