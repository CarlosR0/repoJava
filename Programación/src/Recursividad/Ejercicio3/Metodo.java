package Recursividad.Ejercicio3;

public class Metodo {

	public static Integer sumarNumero(Integer num) {
		if (num == 1) {
			return 1;
		}
		return num + sumarNumero(num - 1);

	}

}
