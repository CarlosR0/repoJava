package EjerciciosTema5.Ejercicio3y4y5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SacoNumeros {
	private List<Integer> lista;

	public SacoNumeros() {
		lista = new ArrayList<Integer>();
	}

	public void addNumero(Integer num) {
		lista.add(num);

	}

	@Override
	public String toString() {
		return "SacoNumeros [ " + lista + " ]";
	}

	public Integer getNumero(Integer num) {
		return lista.get(num);

	}

	public BigDecimal division(BigDecimal num1, BigDecimal num2) {
		try {
			return num1.divide(num2);

		} catch (ArithmeticException e) {
			throw e;
		}
	}

}
