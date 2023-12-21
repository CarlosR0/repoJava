package EjerciciosTema4.Ejercicioo11;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String[] palabras = new String[]{"rojo","azul","negro","blanco","naranja","morado","rosa"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime uno de estos colores y te dire su posicion en el array.");
		System.out.println("Rojo, azul, negro, blanco, naranja, morado, rosa");
		String color = sc.nextLine();
		sc.close();
		Integer n = 0;
		Integer resultado = ArrayUtils.imprimirArray(palabras, color,n);
		System.out.println(resultado);
		
	}

}
