package EjerciciosRepasoTema4.Ejercicio4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
	private List<Libro> libros;
	@SuppressWarnings("unused")
	private String direccion;
	@SuppressWarnings("unused")
	private BigDecimal numTelefono;

	public Libreria(String direccion, BigDecimal numTelefono) {
		super();
		this.libros = new ArrayList<Libro>();
		this.direccion = direccion;
		this.numTelefono = numTelefono;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public void addLibro(Libro libro) {
		libros.add(libro);
	}

	public String obtenerLibroMasAntiguo() {
		LocalDate fecha = LocalDate.now();
		Libro librofecha = libros.get(0);
		for (Libro libro : libros) {
			
			if (fecha.compareTo(libro.getFechaEdicion()) > 0) {
				fecha = libro.getFechaEdicion();
				librofecha = libro;
			}
		}
		return librofecha.getTitulo();
	}

	public BigDecimal obtenerPesoTotalDeLibros() {
		BigDecimal suma = BigDecimal.ZERO;
		for (Libro libro : libros) {
			if (libro.getPeso() == null) {

			} else {
				suma = suma.add(libro.getPeso());

			}
		}
		return suma;
	}

	public Integer obtenerNumPaginasMedio() {
		Integer suma = 0;
		for (Libro libro : libros) {
			suma += libro.getNumPag();
		}
		return suma / libros.size();
	}
}
