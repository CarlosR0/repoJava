package EjerciciosTema4.Ejercicioo48;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate ultimaActualizacion;
	private Cliente cliente;
	private Set<Articulo> articulos;

	public Carrito(Cliente cliente) {
		super();
		this.fechaCreacion = LocalDate.now();
		this.ultimaActualizacion = LocalDate.now();
		this.cliente = cliente;
		this.articulos = new HashSet<Articulo>();
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getUltimaActualizacion() {
		return ultimaActualizacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Set<Articulo> getArticulos() {
		return articulos;
	}

	public int getCantidad() {
		return articulos.size();
	}

	public double getTotal() {
		double suma = 0;
		for (Articulo articulo : articulos) {
			suma = suma + articulo.getPrecio();
		}
		return suma;
	}

	public double getPrecioMedio() {
		return (getTotal() / articulos.size());
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String horaAcualCadena = ultimaActualizacion.format(formato);
		return "\tCarrito \n Cliente: " + cliente + "\n Articulos: " + getCantidad() + "\n Total: " + getTotal()
				+ "\n Ultima Actualizacion: " + horaAcualCadena + "\n";
	}

	public void addArticulo(Articulo articulo) {
		articulos.add(articulo);
		ultimaActualizacion = LocalDate.now();
	}

	public void borrarArticulo(Articulo art) {
		articulos.remove(art);
		ultimaActualizacion = LocalDate.now();
	}

	public void vaciarCesta() {
		articulos.clear();
		ultimaActualizacion = LocalDate.now();
	}
}
