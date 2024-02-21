package EjerciciosRepasoTema4.Ejercicio4;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LibroFisico extends Libro {
	private Tamaño tamaño;
	private BigDecimal peso;

	public LibroFisico(String titulo, String autor, LocalDate fechaEdicion, Integer numPag, Tamaño tamaño,
			BigDecimal peso) {
		super(titulo, autor, fechaEdicion, numPag);
		this.tamaño = tamaño;
		this.peso = peso;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public BigDecimal getPeso() {
		return peso;
	}

}
