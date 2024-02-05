package EjerciciosTema4.Ejercicioo43;

public class Director extends Persona {
	public Director() {
		super();
		
	}
	
	public Director(String nombre, Integer añoNacimiento, String nacionalidad) {
		super(nombre, añoNacimiento, nacionalidad);
		
	}

	public Integer getSueldo() {
		return 200000;
	}

	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", añoNacimiento=" + añoNacimiento + ", nacionalidad=" + nacionalidad
				+ ", sueldo=" + getSueldo() + "]";
	}

}
