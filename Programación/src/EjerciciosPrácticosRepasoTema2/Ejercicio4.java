package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicio4 {

	private static final Double descuento1 = 0.4;
	private static final Double descuento2 = 0.2;
	private static final Double descuento3 = 0.1;
	private static final Double descuento4 = 0.0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double precioUnidad;
		Double unidades;
		Double precio;
		Double descuentoPrecio;
		Double precioFinal;
		Double descuentoPorcentaje;
		String descuento;
		
		
			System.out.println("Introduzca el número de unidades que va a comprar.");
			unidades = sc.nextDouble();
			
			System.out.println("Introduzca el precio por unidad.");
			precioUnidad = sc.nextDouble();
			sc.nextLine();
			sc.close();
			
			
			
				if (unidades > 100) {
					precio = unidades * precioUnidad;
					descuentoPrecio = precio * descuento1;
					precioFinal = precio - descuentoPrecio;
					descuentoPorcentaje = descuento1 * 100;
					descuento = descuentoPorcentaje.toString() + "%";
					System.out.println("El total a pagar es " + precio + ". Aplicandole un descuento del " + descuento + ", el precio final es " + precioFinal );
					}
				
				else if (unidades <= 100 && unidades >= 25 ) {
					precio = unidades * precioUnidad;
					descuentoPrecio = precio * descuento2;
					precioFinal = precio - descuentoPrecio;
					descuentoPorcentaje = descuento1 * 100;
					descuento = descuentoPorcentaje.toString() + "%";
					System.out.println("El total a pagar es " + precio + ". Aplicandole un descuento del " + descuento + ", el precio final es " + precioFinal );
					}
				
				else if (unidades <25 && unidades >= 10) {
					precio = unidades * precioUnidad;
					descuentoPrecio = precio * descuento3;
					precioFinal = precio - descuentoPrecio;
					descuentoPorcentaje = descuento1 * 100;
					descuento = descuentoPorcentaje.toString() + "%";
					System.out.println("El total a pagar es " + precio + ". Aplicandole un descuento del " + descuento + ", el precio final es " + precioFinal );
					}
			
				else if (unidades < 10 && unidades >= 0) {
					precio = unidades * precioUnidad;
					descuentoPrecio = precio * descuento4;
					precioFinal = precio - descuentoPrecio;
					descuentoPorcentaje = descuento1 * 100;
					descuento = descuentoPorcentaje.toString() + "%";
					System.out.println("El total a pagar es " + precio + ". Aplicandole un descuento del " + descuento + ", el precio final es " + precioFinal );
					}
						
				else if (unidades < 0) {
					System.out.println("Alguno de los valores introducidos es erróneo:");
				}
			
				
			
	

	}

}
