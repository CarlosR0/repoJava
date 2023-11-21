package EjerciciosPrácticosRepasoTema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicioo25 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		int numAleatorio = rn.nextInt(1,7);
		Scanner sc = new Scanner(System.in);
		String eleccion;
		System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
		eleccion = sc.nextLine().trim().toLowerCase();
		if (numAleatorio == 1 || numAleatorio == 4) {
			System.out.println("Mi elección ha sido tijeras");
		} else if (numAleatorio == 2 || numAleatorio == 5){
			System.out.println("Mi elección ha sido piedra");
		} else if (numAleatorio == 3 || numAleatorio == 6) {
			System.out.println("Mi elección ha sido papel");
		}
		
		switch (eleccion) {
		case "tijeras":
			
			if (numAleatorio == 1|| numAleatorio == 4) {
				System.out.println("Empate");
			} else if (numAleatorio == 2 || numAleatorio == 5){
				System.out.println("Has perdido");
			} else if (numAleatorio == 3 || numAleatorio == 6) {
				System.out.println("Has ganado");
			}
			
			break;
		case "piedra":
			
			if (numAleatorio == 1|| numAleatorio == 4) {
				System.out.println("Has ganado");
			} else if (numAleatorio == 2 || numAleatorio == 5){
				System.out.println("Empate");
			} else if (numAleatorio == 3 || numAleatorio == 6) {
				System.out.println("Has perdido");
			}
			
			break;
		case "papel":
			
			if (numAleatorio == 1|| numAleatorio == 4) {
				System.out.println("Has perdido");
			} else if (numAleatorio == 2 || numAleatorio == 5){
				System.out.println("Has ganado");
			} else if (numAleatorio == 3 || numAleatorio == 6) {
				System.out.println("Empate");
			}
			
			break;

		default:
			System.out.println("Esta opción no existe");
			break;
		}
		sc.close();
	}
}