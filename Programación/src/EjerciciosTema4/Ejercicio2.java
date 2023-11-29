package EjerciciosTema4;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static String getMinusculas(String frase) {
		frase = frase.trim().toLowerCase();	
		return frase;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dime una palabra");
		String palabra = sc.nextLine();
		sc.close();
		String resultado = getMinusculas(palabra);
		System.out.println(resultado);
	}

}
