package zPrueba.Libro;

public class Libro {

	private static  String material;
	private String titulo;
	private String autor;
	private String editorial;
	private Integer numPaginas;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Integer getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}

	public static String getMaterial() {
		return material;
	}

	public static void setMaterial(String material) {
		Libro.material = material;
	}

	public Libro(String titulo, String autor, String editorial, Integer numPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}
	public Libro() {
		this.titulo = "No se sabe";
		this.autor = "No se sabe";
		this.editorial = "No se sabe";
		this.numPaginas = 0;
	}
}
