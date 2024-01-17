package EjerciciosTema4.Semaforo;

public class Semaforo {

	public static final String ROJO = "ROJO";
	public static final String AMBAR = "AMBAR";
	public static final String VERDE = "VERDE";

	public String color;
	public Boolean parpadeando = true;

	public Semaforo() {
		super();
		this.color = ROJO;
		this.parpadeando = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (!color.equals(ROJO) && !color.equals(VERDE) && !color.equals(AMBAR)) {

		} else {
			this.color = color;
		}
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if (color.equals(AMBAR)) {
			this.parpadeando = parpadeando;
		}
		if (!color.equals(AMBAR) && this.parpadeando) {
			this.parpadeando = parpadeando;
		}
		if (!color.equals(AMBAR) && !this.parpadeando) {

		}

	}

	@Override
	public String toString() {
		if (parpadeando) {
			return "semáforo en " + color + " parpadeando";
		} else {
			return "Semáforo en " + color;
		}
	}

	public void cambiarEstado() {
		if (color.equals(ROJO)) {
			setColor(VERDE);
		}
		else if (color.equals(VERDE)) {
			setColor(AMBAR);
			setParpadeando(true);
		}
		else if (color.equals(AMBAR) && parpadeando) {
			setColor(AMBAR);
			setParpadeando(false);
		}
		else if (color.equals(AMBAR) && !parpadeando) {
			setColor(ROJO);
			
		}
	}
}
