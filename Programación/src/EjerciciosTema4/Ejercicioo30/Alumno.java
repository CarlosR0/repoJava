package EjerciciosTema4.Ejercicioo30;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		return "ALUMNO \n DNI = " + dni + "\n Nota = " + nota  + "\n Nombre = " + nombre
				+ "\n Edad = " + edad + "\n Válido = " + validar() + "\n Curso = " + curso;
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
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(this.dni);
		if (match.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validarCurso() {

		if (curso != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validarNombre() {

		if ((nombre != null) && nombre.length() > 9) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validarEdad() {

		if (edad != null && edad <= 65 && edad >= 12) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validar() {
		if (validarDni() && validarCurso() && validarNombre() && validarEdad()) {
			return true;
		}
		return false;
	}

}
