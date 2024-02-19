package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {
	private List<Movimiento> movimientos;
	private String numeroCuenta;
	private BigDecimal dinero;

	DecimalFormat formato = new DecimalFormat("#,##0.00€");

	public CuentaAhorros(String numeroCuenta) {
		super();
		this.movimientos = new ArrayList<Movimiento>();
		this.numeroCuenta = numeroCuenta;
		this.dinero = BigDecimal.ZERO;
	}

	public void addMovimiento(Movimiento movimiento) {
		movimientos.add(movimiento);
		dinero = dinero.add(movimiento.getImporte());
	}

	public BigDecimal getTotal() {
		return dinero;
	}

//	public List<Movimiento> getMovimientos() {
//		return movimientos;
//	}

	public List<String> getMovimientos() {
		List<String> lista = new ArrayList<String>();
		for (int i = 0; i < movimientos.size(); i++) {
			lista.add(movimientos.get(i).toString());
		}
		return lista;
	}

	public List<String> getCargos() {
		List<String> cargos = new ArrayList<String>();
		for (int i = 0; i < movimientos.size(); i++) {
			if (movimientos.get(i).getTipo() == "C") {
				cargos.add(movimientos.get(i).toString());
			}
		}
		return cargos;
	}

	public List<String> getRetiradas() {
		List<String> retiradas = new ArrayList<String>();
		for (int i = 0; i < movimientos.size(); i++) {
			if (movimientos.get(i).getTipo() == "R") {
				retiradas.add(movimientos.get(i).toString());
			}
		}
		return retiradas;
	}

	public List<String> getIngresos() {
		List<String> ingresos = new ArrayList<String>();
		for (int i = 0; i < movimientos.size(); i++) {
			if (movimientos.get(i).getTipo() == "I") {
				ingresos.add(movimientos.get(i).toString());
			}
		}
		return ingresos;
	}

	@Override
	public String toString() {
		return "CuentaAhorros [numeroCuenta = " + numeroCuenta + ", dinero = " + formato.format(dinero) + "]";
	}

}
