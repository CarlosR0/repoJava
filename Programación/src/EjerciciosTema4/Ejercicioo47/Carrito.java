package EjerciciosTema4.Ejercicioo47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private LocalDate fechaCreacion;
	private LocalDate ultimaActualizacion;
	private Cliente cliente;
	private List<Articulo> articulos;

	public Carrito(Cliente cliente) {
		super();
		this.fechaCreacion = LocalDate.now();
		this.ultimaActualizacion = LocalDate.now();
		this.cliente = cliente;
		this.articulos = new ArrayList<Articulo>();
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

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public int getCantidad() {
		return articulos.size();
	}

	public double getTotal() {
		double suma = 0;
		for (int i = 0; i < articulos.size(); i++) {
			suma = suma + articulos.get(i).getPrecio();
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

	public void borrarArticulo(int num) {
		articulos.remove(num);
		ultimaActualizacion = LocalDate.now();
	}

	public void vaciarCesta() {
		articulos.clear();
		ultimaActualizacion = LocalDate.now();
	}
}
