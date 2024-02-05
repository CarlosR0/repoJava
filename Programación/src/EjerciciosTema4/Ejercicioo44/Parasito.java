package EjerciciosTema4.Ejercicioo44;

public class Parasito extends Personaje {
	public Parasito(String nombre, String codigo) {
		super(nombre, codigo);

	}

	private Integer vida = 200;
	private Integer daño = 2;
	private Integer dps = 1;

	public Integer getVida() {
		return vida;
	}

	public Integer getDaño() {
		return daño;
	}

	public Integer getDps() {
		return dps;
	}

	@Override
	public String toString() {
		return "Parasito [Nombre = " + nombre + ", Código = " + codigo + "]";
	}

}
