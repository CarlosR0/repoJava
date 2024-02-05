package EjerciciosTema4.Ejercicioo43;

public class Actor extends Persona {
	public Actor() {
		super();

	}

	public Actor(String nombre, Integer añoNacimiento, String nacionalidad) {
		super(nombre, añoNacimiento, nacionalidad);

	}

	public Integer getSueldo() {
		return 100000;
	}

	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + ", añoNacimiento=" + añoNacimiento + ", nacionalidad=" + nacionalidad
				+ ", sueldo=" + getSueldo() + "]";
	}

}
