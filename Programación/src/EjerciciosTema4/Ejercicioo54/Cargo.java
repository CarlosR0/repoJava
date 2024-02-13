package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cargo extends Movimiento {

	private String cif;

	public Cargo(LocalDate fecha, BigDecimal importe, String cif) {
		super(fecha, importe);
		this.cif = cif;
	}

	@Override
	public String toString() {
		return "[C - " + fecha + " - " + importe + " - " + cif + "]";
	}

	@Override
	public BigDecimal getImporte() {
		
		
	}

}
