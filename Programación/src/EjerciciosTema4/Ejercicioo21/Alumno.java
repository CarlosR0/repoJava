package EjerciciosTema4.Ejercicioo21;

public class Alumno extends Persona {

	private String dni;
	private Double nota;

	public void aprobar() {
		this.nota = 5.0;

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Alumno(String dni, String nombre, Integer edad, Double nota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}

	public Alumno(String dni) {
		super();
		this.dni = dni;
		this.nombre = "Nada";
		this.edad = null;
		this.nota = null;
	}
}
