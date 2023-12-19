package Recursividad.Prueba1;

public class Metodo {

	public static void numero(Integer num) {
		
		System.out.println(num);
		if (num < 100) {
			numero(num+1);
		}
		
		
		

	}

}
