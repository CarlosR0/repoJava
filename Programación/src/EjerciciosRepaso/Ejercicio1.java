package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static final double NUMERO_PI = 3.14159365;
	
	public static void main(String[] args) {
			
			/*Realizar un programa que solicite el radio de un círculo 
			  y nos indique a continuación cuál es la circunferencia y el área 
			  de dicho círculo como resultado. 
			*/
				System.out.println("Indícame el radio del círculo en cm.");
				Scanner sc = new Scanner(System.in);
				Double radio = sc.nextDouble();
				sc.close();
			
			//La fórmula para conseguir la longitud de la circunferencia es L=2*PI*r
				Double longitud = 2 * NUMERO_PI * radio;
				System.out.println("la longitud de la circunferencia es de " + longitud + " cm.");
				
			//La fórmula para conseguir el área del círculo es A=PI*(r^2)
				Double area = NUMERO_PI * radio * radio;
				System.out.println("la longitud de la circunferencia es de " + area + " cm^2.");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
