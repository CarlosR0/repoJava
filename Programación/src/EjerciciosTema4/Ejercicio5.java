package EjerciciosTema4;

import java.util.Scanner;

public class Ejercicio5 {

	public static int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos números y te los sumare.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int resultado = sumar(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + resultado);

	}

}
