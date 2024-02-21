package EjerciciosRepasoTema4.Ejercicio4;

import java.math.BigDecimal;

public class Tamaño {
	private BigDecimal ancho;
	private BigDecimal alto;

	public Tamaño(BigDecimal ancho, BigDecimal alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}

	public void setAncho(BigDecimal ancho) {
		this.ancho = ancho;
	}

	public void setAlto(BigDecimal alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return ancho + " cm de ancho y " + alto + " cm de alto.";
	}

}
