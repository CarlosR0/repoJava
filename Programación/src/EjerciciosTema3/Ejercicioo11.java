package EjerciciosTema3;

public class Ejercicioo11 {

	public static void main(String[] args) {
		
		int[][] lista = new int[5][10];
		int x = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				lista [i][j] = x;
				x++;
				if (j == 9) {
					System.out.print(lista [i][j] + ". ");
				} else {
				System.out.print(lista [i][j] + ",	");
				}
				}
		System.out.println("");
		}
		
	}

}
