package EjerciciosTema4.Ejercicioo10;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String[] palabras = new String[]{"rojo","azul","negro","blanco","naranja","morado","rosa"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número.");
		Integer posicion = sc.nextInt();
		sc.close();
		String resultado = ArrayUtils.imprimirArray(palabras, posicion);
		System.out.println(resultado);
	}

}
