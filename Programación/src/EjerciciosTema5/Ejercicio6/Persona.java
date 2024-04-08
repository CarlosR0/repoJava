package EjerciciosTema5.Ejercicio6;

import java.math.BigDecimal;

public class Persona {
	private String genero;
	private BigDecimal altura;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) throws ParametroIncorrectoException {
		this.genero = null;
		if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("H")) {
			this.genero = genero;
		} else {
			throw new ParametroIncorrectoException("El genero es incorrecto, solo hay dos.");
		}
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) throws ParametroIncorrectoException {
		this.altura = null;
		if (altura.compareTo(BigDecimal.ZERO) == 1 && altura.compareTo(new BigDecimal(3)) == -1) {
			this.altura = altura;
		} else {
			throw new ParametroIncorrectoException("La altura es incorrecta");
		}
	}

	@Override
	public String toString() {
		return "Persona [genero = " + genero + ", altura = " + altura + "]";
	}

}
