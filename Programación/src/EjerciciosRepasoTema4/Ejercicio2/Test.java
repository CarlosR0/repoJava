package EjerciciosRepasoTema4.Ejercicio2;

public class Test {

	public static void main(String[] args) {
		TelefonoFijo fijo = new TelefonoFijo(954954954,"C/ Blas Infante");
		TelefonoMovil movil = new TelefonoMovil(654654654,"564875,3784645");
		fijo.consultarNumero();
		movil.consultarNumero();
		movil.marcar(654654654);
		movil.marcar(610610610);
		movil.colgar();
		movil.colgar();
	}

}
