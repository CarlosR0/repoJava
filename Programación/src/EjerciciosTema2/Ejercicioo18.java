package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo18 {

	public static void main(String[] args) {
		System.out.println("Dime un número del 1 al 12 y te dire el mes correspondiente.");
		Scanner sc = new Scanner(System.in);
		int mesN = sc.nextInt();
		sc.nextLine();
		sc.close();
		String mes = "";

		switch (mesN) {
		case 1:
			mes = "Enero";
			System.out.println("El mes es " + mes);

			break;

		case 2:
			mes = "Febrero";
			System.out.println("El mes es " + mes);

			break;

		case 3:
			mes = "Marzo";
			System.out.println("El mes es " + mes);

			break;

		case 4:
			mes = "Abril";
			System.out.println("El mes es " + mes);

			break;

		case 5:
			mes = "Mayo";
			System.out.println("El mes es " + mes);

			break;

		case 6:
			mes = "Junio";
			System.out.println("El mes es " + mes);

			break;

		case 7:
			mes = "Julio";
			System.out.println("El mes es " + mes);

			break;

		case 8:
			mes = "Agosto";
			System.out.println("El mes es " + mes);

			break;

		case 9:
			mes = "Septiembre";
			System.out.println("El mes es " + mes);

			break;

		case 10:
			mes = "Octubre";
			System.out.println("El mes es " + mes);

			break;

		case 11:
			mes = "Noviembre";
			System.out.println("El mes es " + mes);

			break;

		case 12:
			mes = "Diciembre";
			System.out.println("El mes es " + mes);

			break;

		default:
			System.out.println("Este número no equivale con ningun mes del año.");

			break;
		}
	}
}
