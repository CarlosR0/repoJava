package EjerciciosTema4;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static final int NUMERO_PAGAS = 12;

	public static void main(String[] args) {
		
			//1. Mostrar un mensaje preguntando “¿Cuánto te gustaría ganar al año?”
				System.out.println("¿Cuánto te gustaría ganar al año?");
		
			//2. Esperar a que el usuario conteste indicando una cantidad 		
				Scanner sc = new Scanner(System.in);
				int sueldo = sc.nextInt();
				sc.close();
				
			//3. Mostrar un nuevo mensaje “Tu sueldo mensual sería de xx euros” (calcular xx dividiendo lo indicado por el usuario entre 12) 
				int sueldoMensual = sueldo / NUMERO_PAGAS;
				System.out.println("Tu sueldo mensual sería de " + sueldoMensual + "€.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
