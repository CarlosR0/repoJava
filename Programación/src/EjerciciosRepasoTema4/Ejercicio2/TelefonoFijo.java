package EjerciciosRepasoTema4.Ejercicio2;

public class TelefonoFijo extends Telefono {

	@SuppressWarnings("unused")
	private String direccion;

	public TelefonoFijo(Integer numero, String direccion) {
		super(numero);
		this.direccion = direccion;
	}
}
