package EjerciciosTema6.Ejercicio1al10Abel.Service;

public class ErrorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 46536733920391561L;

	public ErrorException() {
	}

	public ErrorException(String message) {
		super(message);
	}

	public ErrorException(Throwable cause) {
		super(cause);
	}

	public ErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public ErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
