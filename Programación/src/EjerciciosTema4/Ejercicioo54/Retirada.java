package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Retirada extends Movimiento {

	public Retirada(LocalDate fecha2, BigDecimal importe2) {
		super(fecha2, importe2);

	}

	@Override
	public String toString() {
		return "[R - " + fecha + " - " + importe + "]";
	}

}
