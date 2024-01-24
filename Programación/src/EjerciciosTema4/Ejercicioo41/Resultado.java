package EjerciciosTema4.Ejercicioo41;

import java.util.Objects;

public class Resultado {
	private Integer golesLocales;
	private Integer golesVisitante;

	public Integer getGolesLocales() {
		return golesLocales;
	}

	public void setGolesLocales(Integer golesLocales) {
		this.golesLocales = golesLocales;
	}

	public Integer getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(Integer golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public Resultado() {
		super();
		this.golesLocales = 0;
		this.golesVisitante = 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(golesLocales, golesVisitante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return Objects.equals(golesLocales, other.golesLocales) && Objects.equals(golesVisitante, other.golesVisitante);
	}

	@Override
	public String toString() {
		return golesLocales + "-" + golesVisitante;
	}

	public boolean isVictoriaLocal() {
		if (golesLocales > golesVisitante) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isVictoriaVisitante() {
		if (golesVisitante > golesLocales) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpate() {
		if (golesVisitante == golesLocales) {
			return true;
		} else {
			return false;
		}
	}
}
