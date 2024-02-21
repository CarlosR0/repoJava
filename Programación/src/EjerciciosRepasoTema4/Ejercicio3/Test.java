package EjerciciosRepasoTema4.Ejercicio3;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		TelefonoFijo fijo = new TelefonoFijo(954954954, "C/ Blas Infante");
		GPS gps = new GPS(new BigDecimal(485185), new BigDecimal(277485));
		TelefonoMovil movil = new TelefonoMovil(654654654, gps);
		fijo.consultarNumero();
		movil.consultarNumero();
		movil.marcar(654654654);
		movil.marcar(610610610);
		movil.colgar();
		movil.colgar();
	}

}
