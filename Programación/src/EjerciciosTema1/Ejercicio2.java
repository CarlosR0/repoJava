package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//1. Mostrar un mensaje pidiendo el nombre del usuario 
			System.out.println("Indícame tu nombre de usuario.");
		
		//2. Esperar a que el usuario escriba su nombre 
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			
		//3. Mostrar un nuevo mensaje indicando: “Bienvenido (nombre)”
			System.out.println("Bienvenido " + name + ".");
			
		//4. Mostrar un nuevo mensaje indicando: “¿De dónde eres?” 
			System.out.println("¿De dónde eres?");
			
		//5. Esperar a que el usuario escriba el lugar de donde vive 
			String site = sc.nextLine();
			
		//6. Mostrar un mensaje preguntando: “¿Qué tal se vive en (localidad)?” 
			System.out.println("¿Qué tal se vive en " + site + "?");
			
		//7. Esperar a que el usuario escriba una respuesta
			sc.nextLine();
			sc.close();
			
		//8. Mostrar un último mensaje indicando “Gracias. Un saludo”
			System.out.println("Gracias. Un saludo");
			
	}

}
