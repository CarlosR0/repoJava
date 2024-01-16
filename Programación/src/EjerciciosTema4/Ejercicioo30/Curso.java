package EjerciciosTema4.Ejercicioo30;

public class Curso {
	private String identificador;
	private String descripcion;
	private Alumno[] alumnos;

	public Curso(Integer numAlumnos) {
		super();
		this.alumnos = new Alumno[numAlumnos];
	}

	public void addAlumno(Alumno alumnoNuevo) {
		for (int i = 0; i < alumnos.length; i++) {
			if (this.alumnos[i] == null) {
				
				this.alumnos[i] = alumnoNuevo;
				break;
			}
		}
	}
	
	public Alumno[] getAlumnos() {
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
