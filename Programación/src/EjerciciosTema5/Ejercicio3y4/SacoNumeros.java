package EjerciciosTema5.Ejercicio3y4;

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

}
