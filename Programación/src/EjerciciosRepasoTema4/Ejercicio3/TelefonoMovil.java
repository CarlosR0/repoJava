package EjerciciosRepasoTema4.Ejercicio3;

public class TelefonoMovil extends Telefono {

	private GPS posicionGPS;

	public TelefonoMovil(Integer numero, GPS posicionGPS) {
		super(numero);
		this.posicionGPS = posicionGPS;
	}
}
