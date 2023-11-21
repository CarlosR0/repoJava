package EjerciciosTema3;

public class Ejercicioo21 {

	public static void main(String[] args) {

		Double[] lista = new Double[]{5.4, 3.1, 9.0, 4.7};
		Double suma = 0.0;
		
		for (Double double1 : lista) {
	
			System.out.println(double1);
			
		}
		
		for (Double double2 : lista) {
			suma = suma + double2;
		}
		
		System.out.println("La suma de estos números es: "+ suma);
		
	}

}
