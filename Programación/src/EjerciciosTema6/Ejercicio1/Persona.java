package EjerciciosTema6.Ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate date) {
		this.fechaNacimiento = date;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "\tPERSONA \n\t-DNI : " + dni + "\n\t-NOMBRE : " + nombre + "\n\t-APELLIDO : " + apellido
				+ "\n\t-FECHA NACIMIENTO : " + formato.format(fechaNacimiento);
	}

}
