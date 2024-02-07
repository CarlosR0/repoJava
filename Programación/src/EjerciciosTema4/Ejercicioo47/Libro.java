package EjerciciosTema4.Ejercicioo47;

public class Libro extends Articulo {
	private String autor;

	public Libro(String descripcion, Double precio, String autor) {
		super(descripcion, precio);
		this.autor = autor;
	}

	@Override
	public String getDescrpcion() {
		return descripcion;
	}

	@Override
	public void setDescrpcion(String descripcion) {
		this.descripcion = descripcion;

	}

	@Override
	public Double getPrecio() {
		return precio;
		
	}

	@Override
	public void setPrecio(Double precio) {
		this.precio = precio;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", descrpcion=" + descripcion + ", precio=" + precio + "]";
	}

}
