package EjerciciosTema4;


import java.util.Scanner;

public class Ejercicio4 {

	public final static int AÑO_ACTUAL = 2023;
	
	public static void main(String[] args) {
		
			//1. Mostrar un mensaje pidiendo el año de nacimiento del usuario 
				System.out.println("¿En que año naciste?");
				
			//2. Esperar a que el usuario conteste 
				Scanner sc = new Scanner(System.in);
				int año = sc.nextInt();
				sc.close();
		
			//3. Mostrar un nuevo mensaje indicando la edad del usuario calculada restando el año actual al año indicado por el usuario 
				int edad = AÑO_ACTUAL - año;
				System.out.println("Tu edad es de " + edad + " años.");
		
		
		
		
	}

}