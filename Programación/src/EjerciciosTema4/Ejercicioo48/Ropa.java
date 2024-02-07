package EjerciciosTema4.Ejercicioo48;

public class Ropa extends Articulo {
	private String talla;
	private String color;
	
	public Ropa(String descrpcion, Double precio, String talla, String color) {
		super(descrpcion, precio);
		this.talla = talla;
		this.color = color;
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

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Ropa [talla=" + talla + ", color=" + color + ", descrpcion=" + descripcion + ", precio=" + precio + "]";
	}

}
