package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo24Intento2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cantidad;
		int suma = 0;
		do {
			System.out.println("Dame un número mayor a cero.");
			cantidad = sc.nextInt();
			
		} while (cantidad<=0);
		
		for (int i = 1; i <= cantidad; i++) {
			
			int resto = i % 2;
			
			if (resto != 0) {
				suma = suma + i;
			}
			
		}
		System.out.println("La suma de todos los número impares desde 1 hasta " + cantidad + " es " + suma);
		sc.close();
	}
}