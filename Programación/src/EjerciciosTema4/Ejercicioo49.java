package EjerciciosTema4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ejercicioo49 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String> set= new HashSet<String>();
		System.out.println("Dime 5 cadenas.");
		for (int i = 0; i < 5; i++) {
			String cad = sc.nextLine();
			set.add(cad);
		}

		sc.close();
		System.out.println(set);
		Set<String> set1 = new HashSet<String>();
		
		for (String string : set) {
			set1.add(string.toUpperCase());
//			String cadena = lista.get(i);
//			lista.remove(i);
//			lista.add(i, cadena.toUpperCase());
			
		}
		set = set1;

		System.out.println(set);
		
		if (set.contains("")) {
			System.err.println("Hay alguna cadena vacia");
		}
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			if (it.next().length() < 6) {
				it.remove();
			}
			
		}
		System.out.println(set);
			
		}
	}


