package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo19 {

	public static final Double VALOR_PESETAS = 166.386;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double dinero;
		Double opcion;
		Double conversion;

		do {
			System.out.println("     CONVERSOR \r\n");
			System.out.println("1- Pasar de Pesetas a Euros.\r\n2- Pasar de Euros a Pesetas.\r\n3- Salir.");
			opcion = sc.nextDouble();
			sc.nextLine();
			if (opcion == 1) {
				System.out.println("Mete la cantidad de dinero.");
				dinero = sc.nextDouble();
				sc.nextLine();
				conversion = dinero / VALOR_PESETAS;
				System.out.println(dinero + "pesetas son " + conversion + "€.\r\n");
			} else if (opcion == 2) {
				System.out.println("Mete la cantidad de dinero");
				dinero = sc.nextDouble();
				sc.nextLine();
				conversion = dinero * VALOR_PESETAS;
				System.out.println(dinero + "€ son " + conversion + "pesetas.\r\n");
			} else if (opcion > 3) {
				System.out.println("Esa opción no existe.\r\n");
			}

		} while (opcion != 3);
		{

			System.out.println("Adios, gracias.");

			sc.close();

		}

	}
}