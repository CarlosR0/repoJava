package EjerciciosTema4;

import java.util.Scanner;

public class Ejercicio1 {

	public static String getMayusculas(String frase) {
		
		frase = frase.trim().toUpperCase();
		return frase;
	}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dime una frase");
		String palabra = sc.nextLine();
		sc.close();
		String resultado = getMayusculas(palabra);
		System.out.println(resultado);
	}

}

