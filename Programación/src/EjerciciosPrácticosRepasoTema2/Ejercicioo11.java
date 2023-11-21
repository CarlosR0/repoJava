package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos números.");
		Double num1 = sc.nextDouble();
		Double num2 = sc.nextDouble();
		System.out.println("introduze la operación deseada con los números proporcionados.");
		System.out.println("*** MENÚ *** ");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("0. Salir");
		Integer opcion = sc.nextInt();
		sc.nextLine();
		if (opcion >= 5) {
			System.out.println("Esta opcion no existe");
			
		}
		else if (opcion == 0) {
			System.out.println("Adios");
		}
			
		
		
		
		
		
		switch (opcion) {
			case 1:{
				System.out.println(num1 + num2);
			}
				
				break;
			case 2:{
				System.out.println(num1 - num2);
			}
				
				break;
			case 3:{
				System.out.println(num1 * num2);
			}
				
				break;
			case 4:{
				if ( num1 == 0 || num2 == 0) {
					System.out.println("No se puede hacer la división porque uno de los numeros es igual a cero.");
				}
				else {
					System.out.println(num1 / num2);
				} 
					
			}
				
				break;
			
		}
		sc.close();
	}
	
}