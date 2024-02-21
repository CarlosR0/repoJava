package EjerciciosRepasoTema4.Ejercicio4;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LibroDigital extends Libro {

	public LibroDigital(String titulo, String autor, LocalDate fechaEdicion, Integer numPag) {
		super(titulo, autor, fechaEdicion, numPag);
	}

	@Override
	public BigDecimal getPeso() {
		// TODO Auto-generated method stub
		return null;
	}
}
