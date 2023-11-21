package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicioo15 {

	public static void main(String[] args) {
		System.out.println("introduce una dirreccion web de estas caracteristicas. PROTOCOLO://PARTE1.PARTE2.PARTE3");
		Scanner sc = new Scanner(System.in);
		String direccion = sc.nextLine().trim();
		sc.close();
		String[] lista = direccion.split("://");
		System.out.println(lista[0] + "://");

		String[] lista1 = lista[1].split("\\.");
		for (int i = 0; i < 3; i++) {
			System.out.println(lista1[i]);
		}
	}

}
