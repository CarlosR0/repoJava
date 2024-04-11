package EjerciciosTema6.Ejercicio1;

public class Test {

	public static void main(String[] args) {
		Personas personas = new Personas();
		personas.testConexion();
		try {
			System.out.println(personas.consultarPersonas("123456781")); 
		} catch (ErrorException e) {
			System.out.println("error");
		}

	}

}
