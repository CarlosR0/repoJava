package EjerciciosTema6.Ejercicio1;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException, NoExisteException {
		Personas personas = new Personas();
		personas.testConexion();
		try {
			System.out.println(personas.consultarBBDD());
			System.out.println();
			System.out.println(personas.consultarPersonas("12345678A")); 
		} catch (ErrorException e) {
			e.printStackTrace();
		}

	}

}
