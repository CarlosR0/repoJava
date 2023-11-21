package EjerciciosTema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static final float IVA = 0.21F;
	
	public static void main(String[] args) {
			
			//1. Solicita por consola al usuario cuál es el precio sin IVA del artículo (puede llevar decimales) 
				System.out.println("¿Cuál es el precio sin IVA del artículo?");
		
			//2. Recoge el dato y calcula el IVA (21%) 
				Scanner sc = new Scanner(System.in);
				Float precio = sc.nextFloat();
				sc.close();
				Float ivaCalculado = IVA * precio;
				Float precioFinal = ivaCalculado + precio;
				
			//3. Muestra como resultado en la consola el IVA calculado y el precio final (la suma del precio sin IVA más el IVA) 
				System.out.println("El IVA calculado es de " + ivaCalculado + "€ y el precio final de artículo es de " + precioFinal + "€");
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
