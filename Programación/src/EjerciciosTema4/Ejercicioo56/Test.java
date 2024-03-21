package EjerciciosTema4.Ejercicioo56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero = 0;
		Integer cont = 0;
		Map<Integer, Integer> contador = new HashMap<Integer, Integer>();
		System.out.println("Mete los numeros que quieras, si metes el 0 termina.");
		do {
			numero = sc.nextInt();
			if (contador.containsKey(numero)) {
				contador.put(numero, contador.get(numero) + 1);
				cont++;
			} else if (numero != 0) {
				contador.put(numero, 1);
				cont++;
			}

		} while (numero != 0);
		sc.close();
		System.out.println("Total números indicados: " + cont);
		System.out.println("Distribución");
		for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if (val == 1) {
				System.out.println("\t > Numero " + key + ": " + val + " vez");
			} else {
				System.out.println("\t > Numero " + key + ": " + val + " veces");

			}

		}

	}

}
