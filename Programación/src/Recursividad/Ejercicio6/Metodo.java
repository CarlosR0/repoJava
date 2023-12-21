package Recursividad.Ejercicio6;

public class Metodo {

	public static int imprimirArray (Integer[] array, Integer num, Integer longitud, Integer cont) {
		
		if (num < longitud) {
			cont = array[num] + cont;
			imprimirArray(array,num+1,longitud,cont);
		}
		return cont;
	}

}
