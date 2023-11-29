package EjerciciosTema4.Ejercicio7;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos números y te dare su suma, resta, división y multiplicación.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(num1 + " + " + num2 + " = " + Calculadora.sumar(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + Calculadora.restar(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + Calculadora.dividir(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + Calculadora.multiplicar(num1, num2));

	}

}
