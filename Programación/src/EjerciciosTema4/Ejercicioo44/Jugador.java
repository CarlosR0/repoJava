package EjerciciosTema4.Ejercicioo44;

public class Jugador {
	private String nombre;
	private Equipo equipo;

	public Jugador(String nombre, Equipo equipo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Equipo getEquipo() {
		return equipo;
	}

}
