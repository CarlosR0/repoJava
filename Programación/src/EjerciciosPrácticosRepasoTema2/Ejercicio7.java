package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println("Dime un número y te dire la suma de toda su tabla de multiplicar.");
		Scanner sc = new Scanner(System.in);
		Integer y = sc.nextInt();
		sc.nextLine();
		Integer suma = y;
		String sumaN = y.toString();
		sc.close();
		for (Integer x = (y + y); x <= (y * 10); x = x + y) {
			suma = suma + x;
			sumaN = sumaN + " + " + x;
		}

		System.out.println(sumaN + " = " + suma);

	}

}
