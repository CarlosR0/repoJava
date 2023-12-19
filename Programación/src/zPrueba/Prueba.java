package zPrueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		System.out.println("Dime tu año de naciemineto.");
		Scanner sc = new Scanner(System.in);
		int año = sc.nextInt();
		sc.close();
		
		if (año > 2023) {
			System.out.println("El número es erroneo, ya que no has nacido todavía.");
		}
		
		else if (año > 2012) {
			System.out.println("Perteneces a la Generación Alfa.");
		}
		
		else if (año >= 1997) {
			System.out.println("Perteneces a la Generación Z o Zoomers.");

		}
	
		else if (año >= 1981) {
			System.out.println("Perteneces a la Generación Y o Millennials.");

		}
		
		else if (año >= 1965) {
			System.out.println("Perteneces a la Generación X.");

		}
		
		else if (año >= 1946) {
			System.out.println("Perteneces a los Baby Boomers.");

		}
		
		else if (año >= 1928) {
			System.out.println("Perteneces a la Generación silenciosa.");

		}
		
		else if (año >= 1901) {
			System.out.println("Perteneces a la Generación grandiosa.");

		}
		
		else if (año >= 1883) {
			System.out.println("Perteneces a la Generación perdida.");

		}
		
		
	}

}
