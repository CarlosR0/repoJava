package EjerciciosTema4.Ejercicioo55;

import java.math.BigDecimal;

public class test {

	public static void main(String[] args) {

		Evaluacion eva = new Evaluacion();
		eva.addNota("1234", new BigDecimal(9));
		eva.addNota("2345", new BigDecimal(7));
		eva.addNota("3456", new BigDecimal("5"));
		eva.addNota("4567", new BigDecimal(3));
		eva.addNota("5678", new BigDecimal(1));

		System.out.println(eva.toString());

		eva.addNota("3456", new BigDecimal(7));

		System.out.println(eva.toString());

		eva.corregirNota("1234", new BigDecimal(10));
		eva.corregirNota("6789", new BigDecimal(10));

		System.out.println(eva.toString());

		System.out.println(eva.obtenerNotaAlumno("1234"));
		System.out.println("Media: " + eva.obtenerNotaMedia());

		System.out.println("Aprobados: " + eva.obtenerCantidadAprobados());

		System.out.println("Suspensos: " + eva.obtenerSuspensos());
		
		eva.borrarAprobados();
		System.out.println(eva);
	}

}
