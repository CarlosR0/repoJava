package EjerciciosTema4.Ejercicioo58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
	private Map<String, List<String>> palabras;

	public Diccionario() {
		palabras = new HashMap<String, List<String>>();
	}

	public void cargarDiccionario(List<String> lista) {
		for (int i = 0; i < lista.size(); i++) {
			List<String> listPalabra = new ArrayList<String>();
			String letra = lista.get(i).substring(0, 1).toLowerCase();
			if (!palabras.containsKey(letra)) {
				listPalabra.add(lista.get(i));
				palabras.put(letra, listPalabra);
			} else {
				palabras.get(letra).add(lista.get(i));
			}
		}
	}

	public void borrarDiccionario() {
		palabras.clear();
	}

	public List<String> imprimirPalabras(String letra) {
		if (palabras.containsKey(letra)) {
			return palabras.get(letra);
		}
		return null;
	}
}
