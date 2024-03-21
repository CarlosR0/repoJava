package EjerciciosTema4.Ejercicioo57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra ;
		String letra;
		Map<String, List<String>> palabras = new HashMap<String, List<String>>();
		System.out.println("Dime palabras, se guardaran, se acabara cuando digas FIN");
		List<String> listPalabra ;
		do {
			listPalabra = new ArrayList<String>();
			palabra = sc.nextLine();
			if (palabra.equalsIgnoreCase("FIN") || palabra.isEmpty()) {
				System.out.println("Gracias por poner las palabras.");
				break;
			}

			letra = palabra.substring(0, 1).toLowerCase();
			if (!palabras.containsKey(letra)) {
				listPalabra.add(palabra);
				palabras.put(letra, listPalabra);

			} else {
				palabras.get(letra).add(palabra);
			}

		} while (!palabra.equalsIgnoreCase("FIN"));		
		System.out.println(palabras);
		do {
			System.out.print("Dime una letra: ");
			letra = sc.nextLine();
			if (letra.equalsIgnoreCase("FIN") || letra.isEmpty()) {
				System.out.println("Gracias por poner las palabras. Bye");
				break;
			}
			if (!palabras.containsKey(letra)) {
				System.out.println("No hay ninguna palabra que empiece por " + letra);
			} else if (palabras.containsKey(letra)) {
				System.out.println(palabras.get(letra));	
			}
		} while (!letra.equalsIgnoreCase("FIN"));
		sc.close();
	}

}
