package EjerciciosTema6.Ejercicio1al10Abel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import EjerciciosTema6.Ejercicio1al10Abel.Service.DatosIncompletosException;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "\tPERSONA \n\t-DNI : " + dni + "\n\t-NOMBRE : " + nombre + "\n\t-APELLIDO : " + apellidos
				+ "\n\t-FECHA NACIMIENTO : " + formato.format(fechaNacimiento) + "\n";
	}

	public void validar() throws DatosIncompletosException {
		if (dni == null || dni.isBlank()) {
			throw new DatosIncompletosException("El DNI no puede ser vacío");
		}
		if (nombre == null || nombre.isBlank()) {
			throw new DatosIncompletosException("El nombre no puede ser vacío");
		}
		if (apellidos == null || apellidos.isBlank()) {
			throw new DatosIncompletosException("Los apellidos no pueden ser vacíos");
		}
		if (fechaNacimiento == null) {
			throw new DatosIncompletosException("La fecha de nacimiento no puede ser vacía");
		}
		if (dni.length() > 50 || nombre.length() > 50 || apellidos.length() > 100) {
			throw new DatosIncompletosException("Los valores indicados superan el tamaño máximo");
		}

	}

}
