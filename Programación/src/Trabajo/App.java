package Trabajo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean salir = true;
		do {
			System.out.println("Elige una de estas opciones: \n(1) Ver todos los equipos registrados \n(2) Crear nuevo equipo \n(3) Consultar un equipo por su cpdigo \n(5) Salir");
			Integer num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 0:
				System.out.println("Adios.");
				salir = false;
				break;
				
			default:
				System.out.println("Pon uno de los numeros del menu.");
				break;
			}
			
		} while (salir);
		sc.close();

	}

}
