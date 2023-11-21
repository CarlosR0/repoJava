package EjerciciosPrácticosRepasoTema2;

public class Ejercicioo20 {

	public static void main(String[] args) {

		Integer x = 5;
		Integer y = x;

		for (Integer i = 1; i <= x; i++) {
			for (Integer j = 1; j <= y; j++) {
				if (!(i == j)) {
					System.out.print("-" + " ");
				} else {
					System.out.print("*" + " ");

				}
			}

			System.out.println("");
		}

	}
}