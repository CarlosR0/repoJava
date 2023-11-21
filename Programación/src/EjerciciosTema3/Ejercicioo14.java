package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicioo14 {

	public static void main(String[] args) {
		
		System.out.println("Dime tu nombre completo");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine().trim();
		String[] lista = nombre.split(" ");
		sc.close();
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

	}

}
