package Recursividad.Ejercicio5;

public class Metodo {

	public static void imprimirArray (String[] array, Integer num, Integer longitud) {
		
		if (num < longitud) {
			System.out.println(array[num]);			
			imprimirArray(array,num+1,longitud);
		}
		
	}

}
