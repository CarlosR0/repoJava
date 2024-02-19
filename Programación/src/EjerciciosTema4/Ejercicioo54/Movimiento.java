package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimiento {

	protected LocalDate fecha;
	protected BigDecimal importe;

	public Movimiento(BigDecimal importe2) {
		this.importe = importe2;
		this.fecha = LocalDate.now();
	}

	public abstract String toString();

	public abstract String getTipo();

	public abstract BigDecimal getImporte();
}
