package EjerciciosTema4.Ejercicioo10;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos números.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("	SI QUIERES:");
		System.out.println("1. Sumar pon ADD");
		System.out.println("2. Restar pon SUB");
		System.out.println("3. Multiplicar pon MUL");
		System.out.println("4. Dividir pon DIV");
		String respuesta = sc.nextLine().toUpperCase();
		sc.close();
		Integer resultado = Calculadora.calcular(respuesta, num1, num2);
		if (respuesta.equals("ADD")) {
			System.out.println(num1 + " + " + num2 + " = " + resultado);

		} else if (respuesta.equals("SUB")) {
			System.out.println(num1 + " - " + num2 + " = " + resultado);

		} else if (respuesta.equals("MUL")) {
			System.out.println(num1 + " * " + num2 + " = " + resultado);

		} else if (respuesta.equals("DIV")) {
			System.out.println(num1 + " / " + num2 + " = " + resultado);

		} else {
			System.out.println("No ha quedado claro que quieres hacer con los números");
		}

	}

}
