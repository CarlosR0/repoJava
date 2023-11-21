package EjerciciosTema3;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[] sd = new int[15];
		int x = 0;
		for (int i = 1; i <= 30; i++) {
			int resto = i%2;
			if (resto == 0) {
				sd[x] = i;
				x++;
			}
		}

		for (int i = 0; i < sd.length; i++) {
			System.out.println(sd[i]);
		}
		
		
	}

}
