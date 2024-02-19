package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Retirada extends Movimiento {

	public Retirada(BigDecimal importe2) {
		super(importe2);

	}

	public String getTipo() {
		return "R";
	}

	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat formato = new DecimalFormat("#,##0.00€");
		return "[R - " + format.format(fecha) + " - " + formato.format(importe) + "]\n";
	}

	@Override
	public BigDecimal getImporte() {
		return importe.negate();
	}

}
