package EjerciciosTema4.Ejercicioo37;

import java.util.ArrayList;
import java.util.List;

public class Cola {

	public List<String> lista;

	public Cola() {
		lista = new ArrayList<String>();
	}

	public void añadirCadena(String cad) {
		lista.add(cad);
	}

	public Integer getTamaño() {
		return lista.size();
	}

	public String sacarCadena() {
		if (lista.isEmpty()) {
			return null;
		}
		return lista.remove(0);
	}

	@Override
	public String toString() {
		return lista.toString();
	}

}
