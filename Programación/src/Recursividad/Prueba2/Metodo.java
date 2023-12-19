package Recursividad.Prueba2;

public class Metodo {

	public static Integer sumar(Integer num) {
		if (num == 1) {
			return 1;
		}
		return num + sumar(num - 1);

	}

}
