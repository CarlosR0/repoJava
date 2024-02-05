package EjerciciosTema4.Ejercicioo43;

public abstract class Persona {
	protected String nombre;
	protected Integer añoNacimiento;
	protected String nacionalidad;
	
	public abstract Integer getSueldo();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(Integer añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public Persona(String nombre, Integer añoNacimiento, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
		this.nacionalidad = nacionalidad;
	}

	public Persona() {
		super();
	}

}
