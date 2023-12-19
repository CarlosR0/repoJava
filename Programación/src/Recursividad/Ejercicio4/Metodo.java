package Recursividad.Ejercicio4;

public class Metodo {

	public static Integer sumarNumero(Integer num) {
		if (num == 1) {
			return 1;
		}
		return num + sumarNumero(num - 1);

	}
	public static Integer factorial(Integer num) {
		if (num == 1) {
			return 1;
		}
		return num * factorial(num - 1);

	}

}
