package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos números me vas a dar?");
		int numerosLista = sc.nextInt();
		sc.nextLine();
		int x = 0;
		int y = numerosLista-1;
		int z = 0;
		int[] lista = new int[numerosLista];
		for (int i = 1; i < lista.length+1; i++) {
			System.out.println("Dame el " + i + "º número");
			lista[x] = sc.nextInt();
			x++;
		}
		for (int j = 0; j < (lista.length)/2; j++) {
			 z = lista[j]; 
			lista[j] = lista[y];
			lista[y] = z;
			y--;
		}
		
		
		
		System.out.print("Los números son: ");
		for (int i = 0; i < lista.length; i++) {
			if (i == lista.length-1) {
				System.out.print(lista[i] + ". ");

			} else {
				System.out.print(lista[i] + ", ");
			}
		}
				
				sc.close();
		}

}
