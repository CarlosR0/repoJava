package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio3 {
	

	public static void main(String[] args) {

			/*Repite el ejercicio anterior, pero con la restricción de que sólo 
			 * podrás leer desde el teclado datos de tipo String.
			Es decir, sólo podrás usar el método “nextLine()” del Scanner. 
			*/
				System.out.println("Dime un número.");
				Scanner sc = new Scanner(System.in);
				String numero1 = sc.nextLine();
				
				System.out.println("Dime un segundo número.");
				String numero2 = sc.nextLine();
				sc.close();
				
				double numero3 = Double.parseDouble(numero1);
				double numero4 = Double.parseDouble(numero2);
		
				
				
				double producto = numero3 * numero4;
				
				System.out.println("El producto de la multiplicación es " + producto);
				
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
