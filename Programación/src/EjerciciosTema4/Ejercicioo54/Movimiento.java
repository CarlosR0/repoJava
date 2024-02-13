package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimiento {

	protected LocalDate fecha;
	protected BigDecimal importe;

	public Movimiento(LocalDate fecha2, BigDecimal importe2) {

	}

	public abstract BigDecimal getImporte();
	}

	

