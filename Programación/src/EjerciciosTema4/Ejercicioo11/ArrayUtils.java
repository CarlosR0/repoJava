package EjerciciosTema4.Ejercicioo11;

public class ArrayUtils {

	public static Integer imprimirArray (String[] array, String color, Integer num) {
		for (int i = 0; i < array.length; i++) {
			if (color.equalsIgnoreCase(array[i])) {
				return num = i;
			}
		}
		return -1;
		
	}
}
