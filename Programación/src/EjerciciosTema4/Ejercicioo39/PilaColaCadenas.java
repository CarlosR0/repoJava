package EjerciciosTema4.Ejercicioo39;

import java.util.ArrayList;
import java.util.List;

public class PilaColaCadenas {

	public boolean modo;
	public List<String> lista;

	public PilaColaCadenas() {
		lista = new ArrayList<String>();
		modo = true;
	}

	public void cambiarModo() {
		// modo cola = true
		// modo pila = false
		if (modo == true) {
			modo = false;
		} else {
			modo = true;
		}
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
		if (modo == true) {
			return lista.remove(0);
		}
		return lista.remove(lista.size() - 1);
	}

	@Override
	public String toString() {
		return lista.toString();
	}

}
