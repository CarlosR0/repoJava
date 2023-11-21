package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palabra;

		System.out.println("Escribe una palabra.");
		palabra = sc.nextLine().trim();
		

		for (int i = palabra.length(); i > 0; i=i-1) {
			System.out.println(palabra.substring(i-1, i));
		}
		
		sc.close();

	}
}