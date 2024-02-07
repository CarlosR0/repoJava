package EjerciciosTema4.Ejercicioo48;

public abstract class Articulo {
	protected String descripcion;
	protected Double precio;

	public abstract String getDescrpcion();

	public abstract void setDescrpcion(String descrpcion);

	public abstract Double getPrecio();

	public abstract void setPrecio(Double precio);

	public Articulo(String descrpcion, Double precio) {
		super();
		this.descripcion = descrpcion;
		this.precio = precio;
	}

}
