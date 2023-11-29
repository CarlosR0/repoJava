package EjerciciosTema4.Ejercicio6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos números y te los sumare.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int resultado = Calculadora.sumar(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + resultado);

	}

}
