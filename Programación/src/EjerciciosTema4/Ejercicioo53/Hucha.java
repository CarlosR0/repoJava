package EjerciciosTema4.Ejercicioo53;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	private BigDecimal ahorros;

	public Hucha() {
		ahorros = BigDecimal.ZERO;
	}

	public BigDecimal meterDinero(BigDecimal dinero) {
		ahorros = ahorros.add(dinero).setScale(2,RoundingMode.HALF_DOWN);
		return ahorros;
	}

	public BigDecimal sacarDinero(BigDecimal dinero) {
		if (dinero.compareTo(ahorros) == 1) {
			BigDecimal importe = ahorros.setScale(2,RoundingMode.HALF_DOWN);
			ahorros = BigDecimal.ZERO;
			return importe;
		} else {
			ahorros = ahorros.subtract(dinero).setScale(2,RoundingMode.HALF_DOWN);
			return dinero;

		}

	}

	public BigDecimal contarDinero() {
		return ahorros;
	}

	public BigDecimal romperHucha() {
		return sacarDinero(ahorros);
		//		BigDecimal ahorrado = ahorros.setScale(2,RoundingMode.HALF_DOWN);
		//		this.ahorros = BigDecimal.ZERO;
		//		return ahorrado;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#,##0.00€");
		return "Hucha [ahorros = " + formato.format(ahorros) + "]";
	}
	
}
