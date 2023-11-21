package EjerciciosPrácticosRepasoTema3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu HTML");
		String lista[] = sc.nextLine().trim().split("");
		sc.close();
		int i;

		for (i = 0; i < lista.length-1; i++) {
			
			if (lista[i].equals(">")) {
				do {
					i++;
					if (lista[i].equals("<")) {
						
					} else if (lista[i+1].equals("<")) {
						System.out.print(lista[i]);
						System.out.println();
					} else {
						System.out.print(lista[i]);
						
					}
				} while (!(lista[i].equals("<")));
				
			} 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
