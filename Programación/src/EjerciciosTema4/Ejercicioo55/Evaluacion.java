package EjerciciosTema4.Ejercicioo55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Evaluacion {
	private Map<String, BigDecimal> evaluaciones;

	public Evaluacion() {
		super();
		this.evaluaciones = new HashMap<String, BigDecimal>();
	}

	public boolean addNota(String dni, BigDecimal nota) {
		if (evaluaciones.containsKey(dni)) {
			return false;
		} else {
			evaluaciones.put(dni, nota);
			return true;
		}
	}

	public boolean corregirNota(String dni, BigDecimal nota) {
		if (evaluaciones.containsKey(dni)) {
			evaluaciones.put(dni, nota);
			return true;
		} else {
			return false;
		}
	}

	public BigDecimal obtenerNotaAlumno(String dni) {

		if (!evaluaciones.containsKey(dni)) {
			return BigDecimal.ZERO;
		} else {
			return evaluaciones.get(dni);

		}

	}

	public BigDecimal obtenerNotaMedia() {
		BigDecimal suma = BigDecimal.ZERO;
		BigDecimal contador = BigDecimal.ZERO;
		for (Map.Entry<String, BigDecimal> entry : evaluaciones.entrySet()) {
			suma = suma.add(entry.getValue());
			contador = contador.add(BigDecimal.ONE);
		}
		return suma.divide(contador, 2, RoundingMode.HALF_DOWN);
	}

	public int obtenerCantidadAprobados() {
		int cont = 0;
		for (Map.Entry<String, BigDecimal> entry : evaluaciones.entrySet()) {
			if (entry.getValue().compareTo(new BigDecimal(5)) >= 0) {
				cont++;
			}
		}
		return cont;
	}

	public List<String> obtenerSuspensos() {
		List<String> suspensos = new ArrayList<String>();
		for (Map.Entry<String, BigDecimal> entry : evaluaciones.entrySet()) {
			if (entry.getValue().compareTo(new BigDecimal(5)) == -1) {
				suspensos.add(entry.getKey());
			}
		}
		return suspensos;
	}

	public boolean isAprobado(String dni) {
		if (evaluaciones.get(dni).compareTo(new BigDecimal(5)) >= 0) {
			return true;
		}
		return false;

	}

	public void borrarAprobados() {
		for (Iterator<String> iterator = evaluaciones.keySet().iterator(); iterator.hasNext();) {
			String dni = iterator.next();
			if (isAprobado(dni)) {
				iterator.remove();
			}

		}

	}

	@Override
	public String toString() {
		String aprobados = "Aprobados: \n";
		String suspensos = "Suspensos: \n";

		for (Map.Entry<String, BigDecimal> entry : evaluaciones.entrySet()) {
			if (isAprobado(entry.getKey())) {
				aprobados = aprobados + "\t" + entry.getKey() + "(" + entry.getValue() + ")\n";
			} else {
				suspensos = suspensos + "\t" + entry.getKey() + "(" + entry.getValue() + ")\n";
			}

		}

		return "\n" + aprobados + suspensos;
	}

}
