package EjerciciosTema4.Ejercicioo43;

public class Guionista extends Persona {
	public Guionista() {
		super();

	}

	public Guionista(String nombre, Integer añoNacimiento, String nacionalidad) {
		super(nombre, añoNacimiento, nacionalidad);

	}

	public Integer getSueldo() {
		return 50000;
	}

	@Override
	public String toString() {
		return "Guionista [nombre=" + nombre + ", añoNacimiento=" + añoNacimiento + ", nacionalidad=" + nacionalidad
				+ ", sueldo=" + getSueldo() + "]";
	}

}
