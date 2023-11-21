package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos números me vas a dar?");
		int numerosLista = sc.nextInt();
		sc.nextLine();
		int x = 0;
		int g;
		int z = 0;
		int y = 0;
		int suma = 0;
		int media;
		int[] lista = new int[numerosLista];
		for (int i = 1; i < lista.length+1; i++) {
			System.out.println("Dame el " + i + "º número");
			g = sc.nextInt();
			lista[x] = g;
			x++;
			if (z == 0 || y == 0) {
				z = g;
				y = g;

			} else if (g < z) {
				z = g;
			}
			if (g>y) {
				y=g;
			}
			suma = suma + g;
		}
		media = suma/numerosLista;
		System.out.print("Los números son: ");
		for (int i = 0; i < lista.length; i++) {
			if (i == lista.length-1) {
				System.out.print(lista[i] + ". ");

			} else {
				System.out.print(lista[i] + ", ");
				
			}
		}
		System.out.println("");
		System.out.println("el numero mayor es " + y);
		System.out.println("el numero menor es " + z);
		System.out.println("la media de los numeros dados es " + media);
		sc.close();
		
		
		
	}

}
