package prueba2;

import java.util.Scanner;

public class BuenosDiasBebe {

	public static void main(String[] args) {
			/* 1. Pedir el nombre
			 * 2. Leer el nombre que se nos de
			 * 3. Saludar a la persona por su nombre
			 */
		
	System.out.println("¡Hola!. ¿Cuál es tu nombre?");
		
		Scanner scanner = new Scanner(System.in);
			String nombre = scanner.nextLine();	
			
			System.out.println("Encantado de conocerte " + nombre + ".");
			
		scanner.close();
			
			
			
			
		}

}
