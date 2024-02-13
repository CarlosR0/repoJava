package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ingreso extends Movimiento {

	private String descripcion;

	public Ingreso(LocalDate fecha2, BigDecimal importe2, String descripcion) {
		super(fecha2, importe2);
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "[I - " + fecha + " - " + importe + " - " + descripcion + "]";
	}

}
