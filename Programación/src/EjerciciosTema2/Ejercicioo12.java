package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo12 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int largo;
			String username;
		do {
			System.out.println("Introduce tu username. Debe tener más de 10 caracteres y sin espacios.");
			username = sc.nextLine();
			username = username.trim();
			username = username.toUpperCase();
			largo = username.length();
			
			if (largo < 10 || username.contains(" ")) {
				System.out.println("Tu username incumple alguna de las condiciones.");
			}
			
		} while (largo < 10 || username.contains(" "));
			
			System.out.println(username + " es tu username");
			sc.close();

	}

}
