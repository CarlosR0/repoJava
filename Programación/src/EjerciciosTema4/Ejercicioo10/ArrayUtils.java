package EjerciciosTema4.Ejercicioo10;

public class ArrayUtils {

	public static String imprimirArray (String[] array, Integer posicion) {
		if (posicion<0 || posicion>array.length) {
			return "";
		} 
			
			return array[posicion];
		
	}
}
