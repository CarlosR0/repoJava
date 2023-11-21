package EjerciciosTema3;

public class Ejercicioo13 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		int[][] lista = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				lista[i][j] = x * y;
				
				y++;
				
				if (j == 9) {
					System.out.print(lista[i][j]);
				} else {
					System.out.print(lista[i][j] + " 	");
				}

			}
			y=1;x++;
			
			System.out.println("");
			
		}

	}

}
