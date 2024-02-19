package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Ingreso extends Movimiento {

	private String descripcion;

	public Ingreso(BigDecimal importe2, String descripcion) {
		super(importe2);
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return "I";
	}

	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat formato = new DecimalFormat("#,##0.00€");
		return "[I - " + format.format(fecha) + " - " + formato.format(importe) + " - " + descripcion + "]\n";
	}

	@Override
	public BigDecimal getImporte() {
		return importe;
	}

}
