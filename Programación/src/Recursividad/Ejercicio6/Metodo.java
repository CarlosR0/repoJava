package Recursividad.Ejercicio6;

public class Metodo {

	public static void imprimirArray (String[] array, Integer num, Integer longitud) {
		
		if (num < longitud) {
			System.out.print(array[num]);			
			imprimirArray(array,num+1,longitud);
		}
		
	}

}
