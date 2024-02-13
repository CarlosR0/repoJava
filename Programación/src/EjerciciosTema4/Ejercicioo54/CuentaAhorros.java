package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {
	private LocalDate fecha;
	private List<Movimiento> Movimientos;
	private String numeroCuenta;
	private BigDecimal dinero;
	public CuentaAhorros(String numeroCuenta) {
		super();
		this.Movimientos = new ArrayList<Movimiento>();
		this.numeroCuenta = numeroCuenta;
		this.dinero = BigDecimal.ZERO;
	}
	public void addMovimiento(Movimiento movimiento) {
		if () {
			
		}
	}
}
