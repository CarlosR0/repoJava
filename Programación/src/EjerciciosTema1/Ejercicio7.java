package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
			
			//1. Solicita por consola al usuario cuál es su altura y su peso (en dos pasos) 
				System.out.println("Indícame tu altura en metros.");
				Scanner sc = new Scanner(System.in);
				float estatura = sc.nextFloat();
				System.out.println("Indícame tu peso en kilogramos");
				float masa = sc.nextFloat();
				sc.close();
				
			//2. Recoge los datos y calcula el IMC 
				float imc = masa / (estatura * estatura); 
		
			//3. Muestra por consola el resultado del IMC calculado 
				System.out.println("Tu IMC es de " + imc + "%");
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
