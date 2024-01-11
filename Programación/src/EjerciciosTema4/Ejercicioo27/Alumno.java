package EjerciciosTema4.Ejercicioo27;

import java.util.Objects;

public class Alumno extends Persona {

	private String dni;
	private Double nota;
	private Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void aprobar() {
		this.nota = 5.0;

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni.toUpperCase();
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Alumno(String dni, String nombre, Integer edad, Double nota, Curso curso) {
		super();
		this.dni = dni.toUpperCase();
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
		this.curso = null;
	}

	public Alumno(String dni) {
		super();
		this.dni = dni.toUpperCase();
		this.nombre = "Nada";
		this.edad = null;
		this.nota = null;
		this.curso = null;
	}

	@Override
	public String toString() {
		return "ALUMNO \n DNI = " + dni + "\n Nota = " + nota + "\n Curso = " + curso + "\n Nombre = " + nombre
				+ "\n Edad = " + edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}
	
	public boolean validarDni() {
		if(this.dni == null || this.dni.equals("") || this.dni.length() != 9) {
			return false;
		}
		return true;
	}
	
	
}
