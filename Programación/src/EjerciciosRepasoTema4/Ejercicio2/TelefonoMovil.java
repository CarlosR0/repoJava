package EjerciciosRepasoTema4.Ejercicio2;

public class TelefonoMovil extends Telefono {

	private String posicionGPS;

	public TelefonoMovil(Integer numero, String posicionGPS) {
		super(numero);
		this.posicionGPS = posicionGPS;
	}
}
