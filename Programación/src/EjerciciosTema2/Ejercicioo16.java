package EjerciciosTema2;

public class Ejercicioo16 {

	public static void main(String[] args) {

	
		int suma = 0;
		String sumaN = "0";
		
		
			

		 for (int x= 1 ; x < 10001 ; x++) {
			 suma = suma + x;
			 sumaN = sumaN + "+" + x;

		 }
		 
		 System.out.println("la suma de " + sumaN + "=" + suma);
	}

}
