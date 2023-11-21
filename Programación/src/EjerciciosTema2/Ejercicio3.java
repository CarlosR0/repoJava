package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio3 {

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
			
			String iva = sc.nextLine();
			sc.close();
			
			if (iva.equalsIgnoreCase("Normal")) {
				double ivaN = 0.21;
				double precioIva = ivaN * precio;
				System.out.println("El IVA del producto es " + precioIva);
			}
			
			else if (iva.equalsIgnoreCase("Reducido")) {
				double ivaN = 0.1;
				double precioIva = ivaN * precio;
				System.out.println("El IVA del producto es " + precioIva);
			}
			
			else if (iva.equalsIgnoreCase("Superreducido")) {
				double ivaN = 0.04;
				double precioIva = ivaN * precio;
				System.out.println("El IVA del producto es " + precioIva);
			}
			
			else if (iva.equalsIgnoreCase("Exento")) {
				double ivaN = 0;
				double precioIva = ivaN * precio;
				System.out.println("El IVA del producto es " + precioIva);
			}
			
			else {
				System.out.println("Ese tipo de IVA no existe.");
			}
		
			
	}

}
