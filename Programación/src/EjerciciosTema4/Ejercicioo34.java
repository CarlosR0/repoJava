package EjerciciosTema4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicioo34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> lista= new ArrayList<String>();
		System.out.println("Dime 5 cadenas.");
		for (int i = 0; i < 5; i++) {
			String cad = sc.nextLine();
			lista.add(cad);
		}

		sc.close();
		System.out.println(lista);
		
		for (int i = 0; i < 5; i++) {
			String cadena = lista.get(i);
			lista.remove(i);
			lista.add(i, cadena.toUpperCase());
		}

		System.out.println(lista);
		
		if (lista.contains("")) {
			System.err.println("Hay alguna cadena vacia");
		}
		
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			if (it.next().length() < 6) {
				it.remove();
			}
			
		}
		System.out.println(lista);
			
		}
	}


