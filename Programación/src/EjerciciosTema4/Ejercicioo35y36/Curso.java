package EjerciciosTema4.Ejercicioo35y36;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String identificador;
	private String descripcion;
	private List<Alumno> alumnos;

	public Curso() {
		super();
		this.alumnos = new ArrayList<Alumno>();
	}

	public void addAlumno(Alumno alumnoNuevo) {
		alumnos.add(alumnoNuevo);
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Identificador = " + identificador + "\n 	 Descripción = " + descripcion;
	}

}
