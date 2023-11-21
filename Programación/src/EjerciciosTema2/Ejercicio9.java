package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println("Dime tu nombre completo");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		sc.close();
		String nombre2 = nombre.trim();
		int espacio1 = nombre2.indexOf(" ");
		int espacio2 = nombre2.lastIndexOf(" ");
		
		
		String nombreCompleto = nombre2.substring(0 , espacio1);
		String primerApellido = nombre2.substring(espacio1 + 1 , espacio2);
		String segundoApellido = nombre2.substring(espacio2 + 1);
		
		System.out.println(nombreCompleto);
		System.out.println(primerApellido);
		System.out.println(segundoApellido);
		

	}

}
