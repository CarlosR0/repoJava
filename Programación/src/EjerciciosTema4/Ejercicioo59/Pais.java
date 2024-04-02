package EjerciciosTema4.Ejercicioo59;

import java.util.HashMap;
import java.util.Map;

public class Pais {
	private Map<String, String> mapa;

	public Pais() {
		mapa = new HashMap<String, String>();
	}

	public Boolean agregarPais(String pais, String capital) {
		pais = pais.toUpperCase();
		Boolean noExiste = true;
		if (noExiste) {
			mapa.put(pais, capital);
			return noExiste;
		} else {
			mapa.put(pais, capital);
			return !noExiste;
		}
	}

	public String obetenerCapital(String pais) {
		pais = pais.toUpperCase();
		if (mapa.containsKey(pais)) {
			return mapa.get(pais);
		}
		return "";
	}

	@Override
	public String toString() {
		return "Pais [mapa=" + mapa + "]";
	}

	public String imprimirPaises() {
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			return "PAIS: " + key + " - CAPITAL: " + val;
		}

		return null;
	}
}
