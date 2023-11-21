package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
	
		
		
		
		do {
			System.out.println("Introduzca el número de la opcion que desea.");
			System.out.println("*** MENÚ ***");
			System.out.println("1. Abrir");
			System.out.println("2. Guardar");
			System.out.println("3. Modificar");
			System.out.println("4. Salir");
			numero = sc.nextInt();
			
			switch (numero) {
			case 1:
				if (numero == 1) {
					System.out.println("Has elegido la opción de ABRIR.");
				}
				
				
			case 2:
				if (numero == 2) {
					System.out.println("Has elegido la opción de GUARDAR.");
				}
				
			case 3:
				if (numero == 3) {
					System.out.println("Has elegido la opción de MODIFICAR.");
				}				
			case 4:
				if (numero == 4) {
					System.out.println("BYE BYE.");
				}				

			default:
				if (numero >4) {
					System.out.println("Esa opción no existe o no esta disponible");
					
				}
			
			}
		} while (numero!= 4);
			sc.close();
	}
}
