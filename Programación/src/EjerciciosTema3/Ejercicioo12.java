package EjerciciosTema3;

public class Ejercicioo12 {

	public static void main(String[] args) {
		int[][] lista = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				lista[i][j] = i * j;
				
				if (j == 9) {
					System.out.print(lista[i][j]);
				} else {
					System.out.print(lista[i][j] + " 	");
				}

			}
			System.out.println("");
			
		}

	}

}
