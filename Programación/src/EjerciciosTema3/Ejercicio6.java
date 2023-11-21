package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mete tres palabras.");
		String[] lista = new String[3];
		
		String x = sc.nextLine();
		String y = sc.nextLine();
		String z = sc.nextLine();
		
		lista[0] = x;
		lista[1] = y;
		lista[2] = z;
		
		System.out.println(lista[0] + ", " + lista[1] + ", " + lista[2] + "." );
		
		sc.close();
	}

}
