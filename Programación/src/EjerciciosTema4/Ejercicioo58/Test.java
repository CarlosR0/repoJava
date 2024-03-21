package EjerciciosTema4.Ejercicioo58;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diccionario dic = new Diccionario();
		System.out.println("Dime palabras, se guardaran, se acabara cuando digas FIN");
		List<String> listPalabra = new ArrayList<String>();
		String palabra = "";
		do {
			palabra = sc.nextLine();
			if (palabra.equalsIgnoreCase("FIN") || palabra.isEmpty()) {
				System.out.println("Gracias por poner las palabras.");
				break;
			} else {
				listPalabra.add(palabra);
			}
		} while (!palabra.equalsIgnoreCase("FIN"));
		dic.cargarDiccionario(listPalabra);
		
		do {
			System.out.print("Dime una letra: ");
			palabra = sc.nextLine();
			if (palabra.equalsIgnoreCase("FIN") || palabra.isEmpty()) {
				System.out.println("Gracias por poner las palabras. Bye");
				break;
			}
			System.out.println(dic.imprimirPalabras(palabra));
		} while (!palabra.equalsIgnoreCase("FIN"));
		sc.close();
	}

}
