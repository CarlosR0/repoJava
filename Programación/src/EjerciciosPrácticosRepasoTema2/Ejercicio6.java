package EjerciciosPrácticosRepasoTema2;

public class Ejercicio6 {

	public static void main(String[] args) {
		int suma = 3;
		String sumaN = "3";
		
		for (int x = 6; x <=30 ; x = x + 3) {
			suma = suma + x;
			sumaN = sumaN + "+" + x;
		}
		
			System.out.println(sumaN + " = " + suma);
	}

}
