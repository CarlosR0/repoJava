package EjerciciosRepasoTema4.Ejercicio3;

public class TelefonoFijo extends Telefono {
	@SuppressWarnings("unused")
	private String direccion;

	public TelefonoFijo(Integer numero, String direccion) {
		super(numero);
		this.direccion = direccion;
	}
}
