package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//1. Mostrar un mensaje pidiendo el nombre del usuario
			System.out.println("Indícame tu nombre:");
		
		//2. Esperar a que el usuario escriba su nombre y registrarlo en una variable
			Scanner sc = new Scanner(System.in);
			String nombre = sc.nextLine();
	
		//3. Mostrar un nuevo mensaje pidiendo el apellido del usuario
			System.out.println("Indícame tu apellido");
	
		//4. Esperar a que el usuario escriba su apellido y registrarlo en otra variable
			String nombre2 = sc.nextLine();
	
		//5. Mostrar un mensaje final indicando: "Su nombre completo es ... (nombre y apellido)" 
			System.out.println("Tu nombre completo es " + nombre + nombre2);
			sc.close();
		
		// CORREGIDO
	
	}

}

