package EjerciciosPrácticosRepasoTema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicioo26 {

	public static void main(String[] args) {

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int contadorVictorias = 0;
		int contadorRondas = 0;
		int contadorDerrotas = 0;
		int contadorEmpates = 0;
		int contadorPartidasSinRespuesta = 0;
		String respuesta;
		do {
			int numAleatorio = rn.nextInt(1, 7);
			String eleccion;
			System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
			eleccion = sc.nextLine().trim().toLowerCase();
			if (numAleatorio == 1 || numAleatorio == 4) {
				System.out.println("Mi elección ha sido tijeras");
			} else if (numAleatorio == 2 || numAleatorio == 5) {
				System.out.println("Mi elección ha sido piedra");
			} else if (numAleatorio == 3 || numAleatorio == 6) {
				System.out.println("Mi elección ha sido papel");
			}

			switch (eleccion) {
			case "tijeras":

				if (numAleatorio == 1 || numAleatorio == 4) {
					System.out.println("Empate");
					contadorEmpates++;
				} else if (numAleatorio == 2 || numAleatorio == 5) {
					System.out.println("Has perdido");
					contadorDerrotas++;
				} else if (numAleatorio == 3 || numAleatorio == 6) {
					System.out.println("Has ganado");
					contadorVictorias++;
				}

				break;
			case "piedra":

				if (numAleatorio == 1 || numAleatorio == 4) {
					System.out.println("Has ganado");
					contadorVictorias++;
				} else if (numAleatorio == 2 || numAleatorio == 5) {
					System.out.println("Empate");
					contadorEmpates++;
				} else if (numAleatorio == 3 || numAleatorio == 6) {
					System.out.println("Has perdido");
					contadorDerrotas++;
				}

				break;
			case "papel":

				if (numAleatorio == 1 || numAleatorio == 4) {
					System.out.println("Has perdido");
					contadorDerrotas++;
				} else if (numAleatorio == 2 || numAleatorio == 5) {
					System.out.println("Has ganado");
					contadorVictorias++;
				} else if (numAleatorio == 3 || numAleatorio == 6) {
					System.out.println("Empate");
					contadorEmpates++;
				}

				break;

			default:
				System.out.println("Esta opción no existe");
				contadorPartidasSinRespuesta++;
				break;
			}

			contadorRondas++;
			System.out.println("¿Quieres echar otra partida?");
			respuesta = sc.nextLine().trim().toLowerCase();
			if (respuesta.equals("si")) {
				System.out.println("Vamos a echar otra");
			}
			if (!(respuesta.equals("si") || respuesta.equals("no"))) {
				System.out.println("Me lo tomare como un si.");

			}

		} while (!respuesta.equals("no"));

		sc.close();
		System.out.println("Hemos jugado " + contadorRondas + " rondas. Has ganado " + contadorVictorias
				+ " rondas, perdido " + contadorDerrotas + " rondas y empatado " + contadorEmpates
				+ " rondas. Las rondas con respuestas que no existen han sido " + contadorPartidasSinRespuesta
				+ " rondas.");

	}
}