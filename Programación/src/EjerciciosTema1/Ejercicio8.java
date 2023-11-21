package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
			//Realizar un programa que obtenga por teclado los siguientes datos: 

				//1. Un número, pero registradlo en una variable de tipo String llamada a. 
					System.out.println("Dame un número.");
					Scanner sc = new Scanner(System.in);
					String a = sc.nextLine();
					
				//2. Un número decimal registrado en una variable de tipo Double llamada b. 

					System.out.println("Dame un número decimal.");
					Double b = sc.nextDouble();
					
				//3. Un número entero registrado en una variable de tipo Float llamada c. 

					System.out.println("Dame un número entero.");
					Float c = sc.nextFloat();
					sc.close();
		
					
			//A continuación, haz las siguientes conversiones de tipo: 
					
				// Guarda el valor de “a” en una variable de tipo Long llamada “x1” 
					Long x1 = Long.parseLong(a);
					
				// Guarda el valor de “b” en una variable de tipo String llamada “x2” 
					String x2 = b.toString();
					
				// Guarda el valor de “b” en una variable de tipo Integer llamada “x3” 
					int x3 = b.intValue();
					
				// Guarda el valor de “c” en una variable de tipo Long llamada “x4” 
					Long x4 = c.longValue();
					
				//Imprime por consola el valor de todas las variables x1, x2, x3 y x4 
					System.out.println(x1 + ", " + x2 + ", " + x3 + ", " + x4 + ".");

					
					
	}

}
