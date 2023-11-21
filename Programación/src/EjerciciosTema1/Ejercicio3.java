package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
	
			//1. Mostrar un mensaje pidiendo la edad del usuario
				System.out.println("¿Qué edad tienes?");
		
			//2. Esperar a que el usuario escriba su edad y almacenarla en una variable 
				Scanner sc = new Scanner(System.in);
				int edad = sc.nextInt();
				sc.close();
				
			//3. Mostrar un nuevo mensaje indicando “Su edad es de xx años” 
				System.out.println("Su edad es de " + edad + " años.");
		
	}

}
