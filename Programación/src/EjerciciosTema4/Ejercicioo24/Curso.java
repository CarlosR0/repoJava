package EjerciciosTema4.Ejercicioo24;

public class Curso {
	private String identificador;
	private String descripcion;

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
