package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Cargo extends Movimiento {
	private String cif;

	public Cargo(BigDecimal importe, String cif) {
		super(importe);
		this.cif = cif;
	}

	public String getTipo() {
		return "C";
	}

	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat formato = new DecimalFormat("#,##0.00€");
		return "[C - " + format.format(fecha) + " - " + formato.format(importe) + " - " + cif + "]\n";
	}

	@Override
	public BigDecimal getImporte() {
		return importe.negate();

	}

}
