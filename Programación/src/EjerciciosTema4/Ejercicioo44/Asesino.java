package EjerciciosTema4.Ejercicioo44;

public class Asesino extends Personaje {
	public Asesino(String nombre, String codigo) {
		super(nombre, codigo);

	}

	private Integer vida = 100;
	private Integer daño = 10;
	private Integer dps = 5;

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
		return "Asesino [Nombre = " + nombre + ", Código = " + codigo + "]";
	}

}
