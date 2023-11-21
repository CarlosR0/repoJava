package EjerciciosPracticosAvanzadosTema3;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static Boolean victoriaX(String[][] tablero) {
		Boolean victoriaX;
		
		Boolean win1 = tablero[0][0].contains("X") && tablero[0][1].contains("X") && tablero[0][2].contains("X");
		Boolean win2 = tablero[1][0].contains("X") && tablero[1][1].contains("X") && tablero[1][2].contains("X");
		Boolean win3 = tablero[2][0].contains("X") && tablero[2][1].contains("X") && tablero[2][2].contains("X");
		
		Boolean win4 = tablero[0][0].contains("X") && tablero[1][0].contains("X") && tablero[2][0].contains("X");
		Boolean win5 = tablero[0][1].contains("X") && tablero[1][1].contains("X") && tablero[2][1].contains("X");
		Boolean win6 = tablero[0][2].contains("X") && tablero[1][2].contains("X") && tablero[2][2].contains("X");
		
		Boolean win7 = tablero[0][0].contains("X") && tablero[1][1].contains("X") && tablero[2][2].contains("X");
		Boolean win8 = tablero[2][0].contains("X") && tablero[1][1].contains("X") && tablero[0][2].contains("X");
		
		if (win1 || win2 || win3 || win4 || win5 || win6 || win7 || win8) {
			victoriaX = false;
			System.out.println("Ha ganado el jugador 1");
		} else {
			victoriaX = true;
		}
		
		return victoriaX;
		
	}
	
	public static Boolean victoriaO(String[][] tablero) {
		Boolean victoriaO;
		
		Boolean win1 = tablero[0][0].contains("O") && tablero[0][1].contains("O") && tablero[0][2].contains("O");
		Boolean win2 = tablero[1][0].contains("O") && tablero[1][1].contains("O") && tablero[1][2].contains("O");
		Boolean win3 = tablero[2][0].contains("O") && tablero[2][1].contains("O") && tablero[2][2].contains("O");
		
		Boolean win4 = tablero[0][0].contains("O") && tablero[1][0].contains("O") && tablero[2][0].contains("O");
		Boolean win5 = tablero[0][1].contains("O") && tablero[1][1].contains("O") && tablero[2][1].contains("O");
		Boolean win6 = tablero[0][2].contains("O") && tablero[1][2].contains("O") && tablero[2][2].contains("O");
		
		Boolean win7 = tablero[0][0].contains("O") && tablero[1][1].contains("O") && tablero[2][2].contains("O");
		Boolean win8 = tablero[2][0].contains("O") && tablero[1][1].contains("O") && tablero[0][2].contains("O");
		
		if (win1 || win2 || win3 || win4 || win5 || win6 || win7 || win8) {
			victoriaO = false;
			System.out.println("Ha ganado el jugador 2");
		} else {
			victoriaO = true;
		}
		
		return victoriaO;
	
	}
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] lista = new String[3][3];
		int contador = 2;
		int turno = 0;
		Boolean turnoJugador1 = false;
		Boolean turnoJugador2 = false;
		int ubicacionColumna = 0;
		int ubicacionFila = 0;
		int contTurno = 0;
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length; j++) {
			lista[i][j] = " - ";
			}
		}
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length; j++) {
				System.out.print(lista[i][j]);
			}
			System.out.println();
		}
		
		do {
			contador++;
			if (contador%2 == 0) {
				turnoJugador2=true;
				turno = 2;
			} else {
				turnoJugador1=true;
				turno = 1;
			}
			do {
				System.out.println("Mete la ubicacion de la fila jugador " + turno);
				ubicacionFila = sc.nextInt();
				
			} while (ubicacionFila <= 0 || ubicacionFila > 3);
			do {
				System.out.println("Mete la ubicacion de la columna jugador " + turno);
				ubicacionColumna = sc.nextInt();
				
			} while (ubicacionColumna <= 0 || ubicacionColumna > 3);
			if (turnoJugador1==true) {
				if (lista[ubicacionFila-1][ubicacionColumna-1] == " - ") {
					lista[ubicacionFila-1][ubicacionColumna-1] = " X ";
					contTurno++;
				}else {
					System.out.println("Esa ubicacion ya esta cogida");
					contador--;
					
				}
				
			} else if (turnoJugador2==true) {
				if (lista[ubicacionFila-1][ubicacionColumna-1] == " - ") {
					lista[ubicacionFila-1][ubicacionColumna-1] = " O ";
					contTurno++;
				}else {
					System.out.println("Esa ubicacion ya esta cogida");
					contador--;
					
				}
			}
			for (int i = 0; i < lista.length; i++) {
				for (int j = 0; j < lista.length; j++) {
					System.out.print(lista[i][j]);
				}
				System.out.println();
			}
				
			turnoJugador1 = false;
			turnoJugador2 = false;
			
		} while (victoriaX(lista)&&victoriaO(lista)&&contTurno <=9);
			sc.close();
			if (contTurno == 9) {
				System.out.println("Ha habido un empate");
		} 
	}

	
}
