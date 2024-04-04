package EjerciciosTema4.Ejercicioo59;

import java.util.HashMap;
import java.util.Iterator;
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

	public void imprimirPaises() {
		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("PAIS: " + key + " - CAPITAL: " + val);
		}
	}

	public void eliminarPais(String pais) {
		if (mapa.containsKey(pais.toUpperCase())) {

		} else {
			mapa.remove(pais, mapa.get(pais));
		}
	}

	public void eliminarPaisConCapitalLetra(String letra) {
		for (Iterator<String> iterator = mapa.keySet().iterator(); iterator.hasNext();) {
			String pais = (String) iterator.next();
			String capital = mapa.get(pais);
			if (capital.startsWith(letra.toUpperCase())) {
				iterator.remove();
				break;
				// return; // también válido
			}
		}
	}

	public Integer calcularLongitudMediaPaises() {
		if (mapa.isEmpty()) {
			return 0;
		}
		Integer suma = 0;
		for (String pais : mapa.keySet()) {
			suma += pais.length();
		}
		return suma / mapa.size();
	}

	public Integer numeroPaisesConCapitalLetra(String letra) {
		Integer contador = 0;
		for (String pais : mapa.keySet()) {
			String capital = mapa.get(pais);
			if (capital.startsWith(letra.toUpperCase())) {
				contador++;
			}
		}
		return contador;
	}

	public void imprimirNumeroPaisesLetra(String letra) {
		Boolean existeAlguno = false;
		for (String pais : mapa.keySet()) {
			String capital = mapa.get(pais);
			if (capital.startsWith(letra.toUpperCase())) {
				existeAlguno = true;
				System.out.println("PAÍS: " + pais + " - CAPITAL: " + capital);
			}
		}
		if (!existeAlguno) {
			System.out.println("No hay ningún país cuya capital empiece por " + letra);
		}
	}

	public void mismaLetra() {
		Boolean existeAlguno = false;
		for (String pais : mapa.keySet()) {
			String capital = mapa.get(pais);
			if (capital.startsWith(pais.substring(0, 1))) {
				existeAlguno = true;
				System.out.println("PAÍS: " + pais + " - CAPITAL: " + capital);
			}
		}
		if (!existeAlguno) {
			System.out.println("No hay ningún país cuya capital empiece por la misma letra que su nombre");
		}
	}

}
