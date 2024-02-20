package EjerciciosRepasoTema4.Ejercicio3;

public abstract class Telefono {
	protected Integer numero;
	protected Boolean enLlamada;

	public Telefono(Integer numero) {
		super();
		this.numero = numero;
		this.enLlamada = false;
	}

	public Integer consultarNumero() {
		return numero;
	}

	public void marcar(Integer numero) {
		System.out.println("LLAMANDO A " + numero);
		if (this.numero.equals(numero)) {
			System.out.println("COMUNICANDO");
		} else {
			System.out.println("EN COMUNICACION");
			enLlamada = true;
		}
	}

	public void colgar() {
		if (enLlamada) {
			System.out.println("COMUNICACION TERMINADA");
			enLlamada = false;
		}
	}

}
