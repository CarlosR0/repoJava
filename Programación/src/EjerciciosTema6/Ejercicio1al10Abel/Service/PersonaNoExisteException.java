package EjerciciosTema6.Ejercicio1al10Abel.Service;

public class PersonaNoExisteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8842080304066816558L;

	public PersonaNoExisteException() {
	}

	public PersonaNoExisteException(String message) {
		super(message);
	}

	public PersonaNoExisteException(Throwable cause) {
		super(cause);
	}

	public PersonaNoExisteException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonaNoExisteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
