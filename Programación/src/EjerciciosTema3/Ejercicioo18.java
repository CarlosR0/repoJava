package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicioo18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Mete un número y te dire si es capicua.");
		String[] lista = sc.nextLine().trim().split("");
		sc.close();
		String suma1 = "";
		String suma2 = "";
		for (int i = 0; i < lista.length; i++) {
			suma1 = suma1 + lista[i];
		}
		System.out.println(suma1);
		for (int i = lista.length-1; i >= 0 ; i--) {
			suma2 = suma2 + lista[i];
		}
		
		System.out.println(suma2);
		if (suma1.equals(suma2)) {
			System.out.println("el numero es capicua");
		} else {
			System.out.println("el numero no es capicua");

		}
	}

}
