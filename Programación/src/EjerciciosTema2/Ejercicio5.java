package EjerciciosTema2;

public class Ejercicio5 {

	public static void main(String[] args) {

		int x = 1;
		int suma = 0;
		String sumaN = "0";
		do {

			suma = suma + x;
			sumaN = sumaN + "+" + x;
			x = x + 1;

		} while (x < 10001);

		System.out.println("la suma de " + sumaN + "=" + suma);

	}

}
