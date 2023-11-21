package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio4Intento2 {

	public static void main(String[] args) {
		
			/*Realiza un programa que solicite al usuario su número favorito.
			 * A continuación, debe solicitar su ciudad favorita. */
		
				System.out.println("Indícame tu número favorito.");
				Scanner sc = new Scanner(System.in);
				String numero = sc.nextLine();
				
				System.out.println("Indícame tu ciudad favorita.");
				String ciudad = sc.nextLine();
				sc.close();
		
				System.out.println("Tu número favorito es " + numero + ". Tu ciudad favorita es " + ciudad + "."); 

		
		

	}

}
