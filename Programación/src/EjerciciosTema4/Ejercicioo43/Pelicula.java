package EjerciciosTema4.Ejercicioo43;

import java.util.List;

public class Pelicula {
	private Integer añoEstreno;
	private String titulo;
	private List<Actor> actores;
	private Guionista guionista;
	private Director director;

	public Integer getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(Integer añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	public Guionista getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Pelicula(Integer añoEstreno, String titulo, List<Actor> actores, Guionista guionista, Director director) {
		super();
		this.añoEstreno = añoEstreno;
		this.titulo = titulo;
		this.actores = actores;
		this.guionista = guionista;
		this.director = director;
	}

	public Pelicula() {
		super();
	}

	@Override
	public String toString() {
		return "Pelicula [añoEstreno=" + añoEstreno + ", titulo=" + titulo + ", actores=" + actores + ", guionista="
				+ guionista + ", director=" + director + "]";
	}

}
