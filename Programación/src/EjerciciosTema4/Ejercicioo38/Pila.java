package EjerciciosTema4.Ejercicioo38;

import java.util.ArrayList;
import java.util.List;

public class Pila {

	public List<String> lista;

	public Pila() {
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
		return lista.remove(lista.size() - 1);
	}

	@Override
	public String toString() {
		return lista.toString();
	}

}
