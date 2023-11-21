package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		/*Realizar un programa que pregunte por el año de nacimiento del usuario.
		 * Según lo que nos indique, mostrarle por consola a qué generación pertenece según este cuadro:*/
			System.out.println("Dime tu año de naciemineto.");
			Scanner sc = new Scanner(System.in);
			int año = sc.nextInt();
			sc.close();
			
			if (año > 2023) {
				System.out.println("El número es erroneo, A MI NO ME ENGAÑA.");
			}
			
			if (año <= 2023 && año > 2012) {
				System.out.println("Perteneces a la Generación Alfa.");
			}
			
			if (año <= 2012 && año >= 1997) {
				System.out.println("Perteneces a la Generación Z o Zoomers.");

			}
		
			if (año <= 1996 && año >= 1981) {
				System.out.println("Perteneces a la Generación Y o Millennials.");

			}
			
			if (año <= 1980 && año >= 1965) {
				System.out.println("Perteneces a la Generación X.");

			}
			
			if (año <= 1964 && año >= 1946) {
				System.out.println("Perteneces a los Baby Boomers.");

			}
			
			if (año <= 1945 && año >= 1928) {
				System.out.println("Perteneces a la Generación silenciosa.");

			}
			
			if (año <= 1927 && año >= 1901) {
				System.out.println("Perteneces a la Generación grandiosa.");

			}
			
			if (año <= 1900 && año >= 1883) {
				System.out.println("Perteneces a la Generación perdida.");

			}
			
			if (año < 1883) {
				System.out.println("Estas muerto crack");
			}
	}

}
