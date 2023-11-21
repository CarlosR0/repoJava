package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Buenas, dime como te llamas.");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println("Buenas, dime tu año de nacimiento.");
		int año = sc.nextInt();
		sc.close();
		int N = 2030 - año;
		
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + N + " años.");
	}

}
