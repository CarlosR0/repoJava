package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicioo19 {

	public static void main(String[] args) {
		System.out.println("Para calcular el IVA del producto se necesita saber el precio sin IVA y el tipo de IVA");
		System.out.println("Indíca el precio del artículo");

		Scanner sc = new Scanner(System.in);
		double precio = sc.nextDouble();
		sc.nextLine();

		System.out.println("Indíca el IVA del artículo.");
		System.out.println("Los tipos de IVA son:");
		System.out.println("- Normal.");
		System.out.println("- Reducido.");
		System.out.println("- Superreducido.");
		System.out.println("- Exento.");

		String iva = sc.nextLine().toLowerCase();
		sc.close();
		double ivaN;
		double precioIva;
		switch (iva) {

		case "normal":
			ivaN = 0.21;
			precioIva = ivaN * precio;
			System.out.println("El IVA del producto es " + precioIva);
			break;

		case "reducido":
			ivaN = 0.1;
			precioIva = ivaN * precio;
			System.out.println("El IVA del producto es " + precioIva);
			break;

		case "superreducido":
			ivaN = 0.04;
			precioIva = ivaN * precio;
			System.out.println("El IVA del producto es " + precioIva);
			break;

		case "exento":
			ivaN = 0;
			precioIva = ivaN * precio;
			System.out.println("El IVA del producto es " + precioIva);
			break;

		default:
			System.out.println("Ese tipo de IVA no existe.");

			break;
		}
	}
}
